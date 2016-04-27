package com.idea.service.resources;

import com.idea.service.dao.UserDAO;
import com.idea.service.models.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Michael Washburn on 4/27/2016.
 */
@Path("/users")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class UserResource {


    private UserDAO userDAO;

    public UserResource(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /****************************************************************
     * Endpoints
     ****************************************************************/

    @GET
    @Path("/all")
    public List<User> getAll() {
        return userDAO.getAll();
    }

}
