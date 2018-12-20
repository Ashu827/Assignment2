package com.springRest.RestAssignment3;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.springRest.RestAssignment3.dao.ZipcodeDAA;
import com.springRest.RestAssignment3.pojo.ZipcodeInfo;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
 ArrayList<ZipcodeInfo> zipDao=ZipcodeDAA.getZCDao(); 
	 	@GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public ArrayList<ZipcodeInfo> getData() {
	       
	    	        	   	    	
	    	return zipDao;
	    }
	
	@Path("{Zip}")
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
    public ZipcodeInfo getIt(@PathParam("Zip") int zip) {
        ArrayList<ZipcodeInfo> zipDao=ZipcodeDAA.getZCDao();
    	ZipcodeInfo info=null;
        
        for(ZipcodeInfo zp:zipDao){
    		if(zp.getZipcode()==zip){
    			info=zp;
    		}
    		
    	}
    	
    	return info;
    }
 	
	
}
