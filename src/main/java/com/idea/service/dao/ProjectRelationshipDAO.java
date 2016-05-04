package com.idea.service.dao;

import com.idea.service.models.ProjectRelationship;
import com.idea.service.models.mappers.ProjectRelationshipMapper;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
@RegisterMapper(ProjectRelationshipMapper.class)
public interface ProjectRelationshipDAO {

    @SqlQuery("select * from project_relationship where id = :id")
    ProjectRelationship findById(@Bind("id") int id);

    @SqlUpdate("delete from project_relationship where id = :id")
    int deleteById(@Bind("id") int id);

    @SqlUpdate("update project_relationship set child_id = :childId, parent_id = :parentId WHERE id = :id")
    int update(@BindBean ProjectRelationship projectRelationship);

}
