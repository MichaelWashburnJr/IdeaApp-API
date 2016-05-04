package com.idea.service.dao;

import com.idea.service.models.Post;
import com.idea.service.models.PostImage;
import com.idea.service.models.mappers.PostImageMapper;
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
@RegisterMapper(PostImageMapper.class)
public interface PostImageDAO {

    @SqlQuery("select * from post_images where id = :id")
    PostImage findById(@Bind("id") int id);

    @SqlUpdate("delete from post_images where id = :id")
    int deleteById(@Bind("id") int id);

    @SqlUpdate("update post_images set post_id = :post_id, url = :url WHERE id = :id")
    int update(@BindBean PostImage postImage);

}
