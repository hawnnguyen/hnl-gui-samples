/**
 * 
 */
package com.hnl.sample.user;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

/**
 * @author hawnnguyen
 *
 */

@ManagedBean(name="user") 
@SessionScoped
public class UserBean implements Serializable {
	private Logger logger = Logger.getLogger(this.getClass());
	private String username;
	private String password;
	private String name;
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * validateUser
	 **/
	public String validateUser(){
		
		return "welcome";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


}
