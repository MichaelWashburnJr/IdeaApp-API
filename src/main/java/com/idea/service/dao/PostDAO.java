package com.idea.service.dao;

import com.idea.service.models.Post;
import com.idea.service.models.mappers.PostMapper;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
@RegisterMapper(PostMapper.class)
public interface PostDAO {

    @SqlQuery("select * from posts")
    List<Post> getAll();

    @SqlQuery("select * from posts where id = :id")
    Post findById(@Bind("id") int id);

    @SqlUpdate("delete from posts where id = :id")
    int deleteById(@Bind("id") int id);

    @SqlUpdate("update posts set author_id = :author_id, category_id = :category_id, is_project = :is_project, title = :title, description = :description, created_at = :created_at WHERE id = :id")
    int update(@BindBean Post post);

    @SqlQuery("select * from posts where author_id = :author_id")
    List<Post> findByAuthorID(@Bind("author_id") int author_id);

    @SqlQuery("select * from posts where category_id = :category_id")
    List<Post> findByCategoryID(@Bind("category_id") int category_id);

}
