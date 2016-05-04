package com.idea.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
public class ProjectRelationship {

    /****************************************************************
     * Fields
     ****************************************************************/

    @JsonProperty
    private Integer id;

    @NotNull
    @JsonProperty
    private Integer childId;

    @NotNull
    @JsonProperty
    private Integer parentId;



    /****************************************************************
     * Standard Java Overrides
     ****************************************************************/
    @Override
    public String toString() {
        return "PostRelationship{" +
                "id=" + id +
                ", childId=" + childId +
                ", parentId=" + parentId +
                '}';
    }

    /****************************************************************
     * Getters
     ****************************************************************/
    public Integer getId() {
        return id;
    }

    public Integer getChildId() {
        return childId;
    }

    public Integer getParentId() {
        return parentId;
    }

    /****************************************************************
     * Setters
     ****************************************************************/

    public ProjectRelationship setId(Integer id) {
        this.id = id;
        return this;
    }

    public ProjectRelationship setChildId(Integer childId) {
        this.childId = childId;
        return this;
    }

    public ProjectRelationship setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }
}
