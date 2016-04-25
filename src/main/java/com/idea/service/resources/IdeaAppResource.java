package com.idea.service.resources;

import com.codahale.metrics.annotation.Timed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class IdeaAppResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(IdeaAppResource.class);


    public IdeaAppResource() {
    	//TODO
    }

    @GET
    @Timed(name = "get-requests")
    public String sayHello() {
        return "Hello, World!";
    }

}
