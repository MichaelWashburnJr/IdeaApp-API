package com.idea.service.models.mappers;

import com.idea.service.models.PostImage;

import com.idea.service.models.ProjectRelationship;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
public class ProjectRelationshipMapper implements ResultSetMapper<ProjectRelationship> {

    public ProjectRelationship map(
            int index,
            ResultSet resultSet,
            StatementContext statementContext)
            throws SQLException {
        return new ProjectRelationship()
                .setId(resultSet.getInt("id"))
                .setChildId(resultSet.getInt("child_id"))
                .setParentId(resultSet.getInt("parent_id"));


    }
}
