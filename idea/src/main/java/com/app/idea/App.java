package com.app.idea;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.app.idea.config.IdeaAppConfiguration;

/**
 * Dropwizard API Application
 *
 */
public class App  extends Application<IdeaAppConfiguration>
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    @Override
    public void initialize(Bootstrap<IdeaAppConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(IdeaAppConfiguration configuration,
                    Environment environment) {
        // nothing to do yet
    }
}
