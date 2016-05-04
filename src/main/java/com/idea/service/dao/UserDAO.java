package com.idea.service.dao;

import com.idea.service.models.User;
import com.idea.service.models.mappers.UserMapper;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by Michael Washburn on 4/26/2016.
 */
@RegisterMapper(UserMapper.class)
public interface UserDAO {

    @SqlQuery("select * from users")
    List<User> getAll();

    @SqlQuery("select * from users where id = :id")
    User findById(@Bind("id") int id);

    @SqlUpdate("delete from users where id = :id")
    int deleteById(@Bind("id") int id);

    @SqlUpdate("update users set email = :email, name = :name, description = :description, image_url = :image_url, is_active = :is_active, created_at = :created_at WHERE id = :id")
    int update(@BindBean User user);

    @SqlQuery("select * from users where email = :email")
    User findByEmail(@Bind("id") int id);

}
