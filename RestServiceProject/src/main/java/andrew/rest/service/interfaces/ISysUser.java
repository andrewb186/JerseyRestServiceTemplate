package andrew.rest.service.interfaces;

import org.apache.log4j.Logger;


public interface ISysUser {

	static Logger log = Logger.getLogger(ISysUser.class);
	
	public String getUser();
		
}
