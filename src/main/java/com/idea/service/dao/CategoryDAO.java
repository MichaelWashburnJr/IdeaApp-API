package com.idea.service.dao;

import com.idea.service.models.Category;
import com.idea.service.models.mappers.CategoryMapper;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
@RegisterMapper(CategoryMapper.class)
public interface CategoryDAO {

    @SqlQuery("select * from categories")
    List<Category> getAll();

    @SqlQuery("select * from categories where id = :id")
    Category findById(@Bind("id") int id);

    @SqlUpdate("delete from categories where id = :id")
    int deleteById(@Bind("id") int id);

    @SqlUpdate("update categories set title = :title WHERE id = :id")
    int update(@BindBean Category post);

}
