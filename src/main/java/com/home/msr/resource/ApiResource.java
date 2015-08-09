package com.home.msr.resource;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@Path("/api")
public class ApiResource {

    @GET
    @Produces("text/plain")
    public String version() {
        return "1.0";
    }
}
