package com.idea.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
public class Category {

    /****************************************************************
     * Fields
     ****************************************************************/

    @JsonProperty
    private Integer id;

    @NotNull
    @JsonProperty
    private String title;


    /****************************************************************
     * Standard Java Overrides
     ****************************************************************/

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    /****************************************************************
     * Getters
     ****************************************************************/

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    /****************************************************************
     * Setters
     ****************************************************************/

    public Category setId(Integer id) {
        this.id = id;
        return this;
    }

    public Category setTitle(String title) {
        this.title = title;
        return this;
    }
}
