package com.springMVC.RestSecondAssignment.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.springMVC.RestSecondAssignment.service.UserService;

@Path("user_resource")
public class UserResource {
	
	UserService messageservice=new UserService();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test()
	{
		return messageservice.getmsg("abc", "123");
		
		
		
	}
}
