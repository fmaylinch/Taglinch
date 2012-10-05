package com.taglinch.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/echo")
public class EchoResource
{

    @GET
    @Path("/{param}")
    public Response printMessage(@PathParam("param") String msg)
    {
        return Response.status(200).entity(msg).build();

    }

}
