package andrew.rest.service.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SystemUserResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SysUserResponse {
	
	
	@XmlElement(name="Username", required=true)
	private String username;
	
	@XmlElement(name="Password", required=true)
	private String password;
	
	@XmlElement(name="SessionID", required=false)
	private String sessionID;
	
	
	
	public SysUserResponse(){
		
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	
	
	
	
}
