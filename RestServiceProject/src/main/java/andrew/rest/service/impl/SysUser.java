package andrew.rest.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import andrew.rest.service.interfaces.ISysUser;


@Path("user")
public class SysUser implements ISysUser {

	
	@GET
	@Path("/getuser")
	@Produces("text/plain")
	public String getUser() {
		return "Andrew Brincat";
	}

}
