package andrew.rest.service.interfaces;

import org.apache.log4j.Logger;

import andrew.rest.service.response.SysUserResponse;


public interface ISysUser {

	static Logger log = Logger.getLogger(ISysUser.class);
	
	public SysUserResponse getUser(String id);
		
}
