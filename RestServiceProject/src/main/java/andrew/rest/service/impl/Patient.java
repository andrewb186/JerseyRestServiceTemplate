package andrew.rest.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import andrew.rest.service.interfaces.IPatient;

@Path("patient")
public class Patient implements IPatient {

	
	@GET
	@Path("/getpatient")
	@Produces("text/plain")
	public String getPatient() {
		log.error("Getting Patient with ID 965424047");
		return "Patient - Andrew Brincat";
	}

}
