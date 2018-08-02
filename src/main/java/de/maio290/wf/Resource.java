package de.maio290.wf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("")
public class Resource {
	
	@GET
	@Produces("application/json")
	public Response getExampleModel()
	{
		Model model = new Model("Mario","notWorking",-1337);
		return Response.status(200).entity(model).build();
	}

}
