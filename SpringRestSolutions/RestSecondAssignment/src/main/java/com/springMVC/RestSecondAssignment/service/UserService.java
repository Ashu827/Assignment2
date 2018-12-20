package com.springMVC.RestSecondAssignment.service;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class UserService {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getmsg(@PathParam("username")String username, @PathParam("password")String password ){
		
		if(username.equals("abc") && password.equals("123")) {
			return  "validUser";
		}
		else {
			return "invalid";
		}
	}

}
