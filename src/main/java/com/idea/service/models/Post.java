package com.idea.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
public class Post {

    /****************************************************************
     * Fields
     ****************************************************************/

    @JsonProperty
    private Integer id;

    @JsonProperty
    private Integer authorId;

    @JsonProperty
    private Integer categoryId;

    @NotNull
    @JsonProperty
    private boolean isProject;

    @JsonProperty
    private String title;

    @JsonProperty
    private String description;

    @NotNull
    @JsonProperty
    private Timestamp createdAt;


    /****************************************************************
     * Standard Java Overrides
     ****************************************************************/
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", authorId=" + authorId +
                ", categoryId=" + categoryId +
                ", isProject=" + isProject +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    /****************************************************************
     * Getters
     ****************************************************************/
    public Integer getId() {
        return id;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public boolean isProject() {
        return isProject;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /****************************************************************
     * Setters
     ****************************************************************/

    public Post setId(Integer id) {
        this.id = id;
        return this;
    }

    public Post setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public Post setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Post setIsProject(boolean project) {
        isProject = project;
        return this;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public Post setDescription(String description) {
        this.description = description;
        return this;
    }

    public Post setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
