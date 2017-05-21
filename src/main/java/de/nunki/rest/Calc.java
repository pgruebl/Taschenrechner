package de.nunki.rest;
 
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
 
@Path("/calc")
public class Calc {
 
	@POST
	@Path("/add")
	public Response getMsg(@FormParam("a") String as, @FormParam("b") String bs) {
		int a = Integer.parseInt(as);
		int b = Integer.parseInt(bs);
		Integer result = new Integer (a+b); 
		 
		return Response.status(200).entity(result.toString()).build();
	}
}
