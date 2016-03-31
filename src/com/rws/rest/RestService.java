package com.rws.rest;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/restService")
public class RestService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item> sayHello() throws PropertyVetoException, SQLException, IOException{
		RestRepoImpl impl = new RestRepoImpl();
		
		List<Item> items = impl.getItems();
		return items;
		
	}
}
