package com.idea.service.models.mappers;

import com.idea.service.models.PostImage;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
public class PostImageMapper implements ResultSetMapper<PostImage> {

    public PostImage map(
            int index,
            ResultSet resultSet,
            StatementContext statementContext)
            throws SQLException {
        return new PostImage()
                .setId(resultSet.getInt("id"))
                .setPostId(resultSet.getInt("post_id"))
                .setUrl(resultSet.getString("url"));


    }
}
