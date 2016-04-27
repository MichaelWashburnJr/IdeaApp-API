package com.idea.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

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


    /****************************************************************
     * Standard Java Overrides
     ****************************************************************/

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                '}';
    }


    /****************************************************************
     * Getters and Setters
     ****************************************************************/

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

}
