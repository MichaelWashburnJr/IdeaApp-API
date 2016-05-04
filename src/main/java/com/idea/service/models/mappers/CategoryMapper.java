package com.idea.service.models.mappers;

import com.idea.service.models.Category;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
public class CategoryMapper implements ResultSetMapper<Category> {

    public Category map(
            int index,
            ResultSet resultSet,
            StatementContext statementContext)
            throws SQLException {
        return new Category()
                .setId(resultSet.getInt("id"))
                .setTitle(resultSet.getString("title"));


    }
}
