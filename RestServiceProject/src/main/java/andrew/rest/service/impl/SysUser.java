package andrew.rest.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;





import javax.ws.rs.core.MediaType;

import andrew.rest.service.interfaces.ISysUser;
import andrew.rest.service.response.SysUserResponse;


@Path("user")
public class SysUser implements ISysUser {

	
	
	
	
	@GET
	@Path("/getuser/{ID}")
	@Produces(MediaType.APPLICATION_JSON)
	public SysUserResponse getUser(@PathParam("ID") String id) {
		log.error("Getting user with ID 10225360");
		return new SysUserResponse();
	}

}
