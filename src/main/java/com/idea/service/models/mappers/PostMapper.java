package com.idea.service.models.mappers;

import com.idea.service.models.Post;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
public class PostMapper implements ResultSetMapper<Post> {

    public Post map(
            int index,
            ResultSet resultSet,
            StatementContext statementContext)
            throws SQLException {
        return new Post()
                .setId(resultSet.getInt("id"))
                .setAuthorId(resultSet.getInt("author_id"))
                .setCategoryId(resultSet.getInt("category_id"))
                .setIsProject(resultSet.getBoolean("is_project"))
                .setTitle(resultSet.getString("title"))
                .setDescription(resultSet.getString("description"))
                .setCreatedAt(resultSet.getTimestamp("created_at"));

    }
}
