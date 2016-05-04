package com.idea.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
public class PostImage {

    /****************************************************************
     * Fields
     ****************************************************************/

    @JsonProperty
    private Integer id;

    @NotNull
    @JsonProperty
    private Integer postId;

    @NotNull
    @JsonProperty
    private String url;


    /****************************************************************
     * Standard Java Overrides
     ****************************************************************/
    @Override
    public String toString() {
        return "PostImage{" +
                "id=" + id +
                ", postId=" + postId +
                ", url='" + url + '\'' +
                '}';
    }

    /****************************************************************
     * Getters
     ****************************************************************/
    public Integer getId() {
        return id;
    }

    public Integer getPostId() {
        return postId;
    }

    public String getUrl() {
        return url;
    }

    /****************************************************************
     * Setters
     ****************************************************************/

    public PostImage setId(Integer id) {
        this.id = id;
        return this;
    }

    public PostImage setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public PostImage setUrl(String url) {
        this.url = url;
        return this;
    }

}
