package com.idea.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * Created by Michael Washburn on 4/26/2016.
 */
public class User {

    /****************************************************************
     * Fields
     ****************************************************************/

    @JsonProperty
    private Integer id;

    @NotNull
    @JsonProperty
    private String email;

    @NotNull
    @JsonProperty
    private String name;

    @JsonProperty
    private String description;

    @JsonProperty
    private String imageUrl;

    @NotNull
    @JsonProperty
    private boolean isActive;

    @NotNull
    @JsonProperty
    private Timestamp createdAt;


    /****************************************************************
     * Standard Java Overrides
     ****************************************************************/
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", isActive=" + isActive +
                ", createdAt=" + createdAt +
                '}';
    }

    /****************************************************************
     * Getters
     ****************************************************************/

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isActive() {
        return isActive;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /****************************************************************
     * Setters
     ****************************************************************/

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setDescription(String description) {
        this.description = description;
        return this;
    }

    public User setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public User setIsActive(boolean active) {
        isActive = active;
        return this;
    }

    public User setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
