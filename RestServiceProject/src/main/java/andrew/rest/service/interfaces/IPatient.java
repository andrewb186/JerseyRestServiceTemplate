package andrew.rest.service.interfaces;

import org.apache.log4j.Logger;


public interface IPatient {

	static Logger log = Logger.getLogger(IPatient.class);
	
	
	public String getPatient();
}
