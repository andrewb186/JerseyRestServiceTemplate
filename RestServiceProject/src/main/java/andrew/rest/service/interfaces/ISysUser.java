package andrew.rest.service.interfaces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("user")
public class ISysUser {

	@GET
	@Path("/getuser")
	@Produces("text/plain")
	public String getUser(){
		return "Andrew brincat";
	}
		
}
