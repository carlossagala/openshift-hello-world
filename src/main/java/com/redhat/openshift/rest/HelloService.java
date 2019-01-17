package com.redhat.openshift.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/")
public class HelloService extends Application {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok(String.format("%s (develop - %s)", 
										 System.getenv("HELLO_STRING"), 
										 System.getenv("HELLO_ENVIRONMENT"))).build();
	}
}
