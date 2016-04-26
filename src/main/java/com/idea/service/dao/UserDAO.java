package com.idea.service.dao;

import com.idea.service.models.User;

import org.hibernate.annotations.SQLUpdate;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

/**
 * Created by Michael Washburn on 4/26/2016.
 */
@RegisterMapper(UserMapper.class)
public interface UserDAO {

    @SqlQuery("select * from USERS where ID = :id")
    User findById(@Bind("id") int id);

    @SqlUpdate("delete from USERS where ID = :id")
    int deleteById(@Bind("id") int id);

    @SqlUpdate("update USERS set EMAIL = :email WHERE id = :id")
    int update(@BindBean User user);

}
