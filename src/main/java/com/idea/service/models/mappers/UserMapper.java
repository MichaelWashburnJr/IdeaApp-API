package com.idea.service.models.mappers;

import com.idea.service.models.User;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Michael Washburn on 4/27/2016.
 */
public class UserMapper implements ResultSetMapper<User> {

    public User map(
            int index,
            ResultSet resultSet,
            StatementContext statementContext)
            throws SQLException {
        return new User()
                .setId(resultSet.getInt("ID"))
                .setEmail(resultSet.getString("EMAIL"));

    }
}
