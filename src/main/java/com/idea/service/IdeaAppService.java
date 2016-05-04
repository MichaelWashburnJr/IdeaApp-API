package com.idea.service;
import com.idea.service.config.IdeaAppConfiguration;
import com.idea.service.dao.PostDAO;
import com.idea.service.dao.UserDAO;
import com.idea.service.resources.PostResource;
import com.idea.service.resources.UserResource;
import io.dropwizard.auth.AuthValueFactoryProvider;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.auth.AuthDynamicFeature;
import io.dropwizard.auth.basic.BasicCredentialAuthFilter;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import com.idea.service.resources.IdeaAppResource;
import com.idea.service.models.User;
import org.hibernate.event.spi.PostCollectionRecreateEvent;
import org.skife.jdbi.v2.DBI;
import io.dropwizard.jdbi.DBIFactory;

public class IdeaAppService extends Application<IdeaAppConfiguration> {
    public static void main(String[] args) throws Exception {
        new IdeaAppService().run(args);
    }

    @Override
    public String getName() {
        return "IdeaAppService";
    }

    @Override
    public void initialize(Bootstrap<IdeaAppConfiguration> bootstrap) {
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(
                        bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );

        bootstrap.addBundle(new AssetsBundle());
        bootstrap.addBundle(new MigrationsBundle<IdeaAppConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(IdeaAppConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        });

    }

    @Override
    public void run(IdeaAppConfiguration configuration, Environment environment) {

        environment.jersey().register(RolesAllowedDynamicFeature.class);
        environment.jersey().register(new IdeaAppResource());

        /* initialize DB and DAOs */
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");

        final UserDAO userDAO = jdbi.onDemand(UserDAO.class);
        final PostDAO postDAO = jdbi.onDemand(PostDAO.class);

        /* Initialize Resources */
        final UserResource userResource = new UserResource(userDAO);
        final PostResource postResource = new PostResource(postDAO);

        environment.jersey().register(userResource);
        environment.jersey().register(postResource);

    }
}
