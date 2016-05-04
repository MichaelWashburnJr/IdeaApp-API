package com.idea.service.resources;

import com.idea.service.dao.PostDAO;
import com.idea.service.models.Post;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Michael Washburn on 5/3/2016.
 */
@Path("/posts")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class PostResource {


    private PostDAO postDAO;

    public PostResource(PostDAO postDAO) {
        this.postDAO = postDAO;
    }

    /****************************************************************
     * Endpoints
     ****************************************************************/

    @GET
    @Path("/all")
    public List<Post> getAll() {
        return postDAO.getAll();
    }

}
