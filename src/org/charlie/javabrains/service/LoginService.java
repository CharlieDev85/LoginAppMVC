package org.charlie.javabrains.service;

import java.util.HashMap;

import org.charlie.javabrains.dto.User;

public class LoginService {
	
	private HashMap<String, String> users = new HashMap<>();
	
	
	
	public LoginService() {
		users.put("cmarroq", "Charlie Marroquin");
		users.put("ecab", "Enrique Cabrera");
	}



	public boolean authenticate(String user, String pass) {
		if(pass != null && pass.equals("Eclipse")) {
			return true;
		}		
		return false;
		/*
		 * Controller: LoginServlet
		 * View:the jsp
		 * Bussiness Service: LoginService
		 * Model: We are not passing a lot of data in this case, so the model is the boolean that
		 * this method returns.
		 * */
	}
	
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName(users.get(userId));
		user.setActive(true);
		return user;
	}
}
