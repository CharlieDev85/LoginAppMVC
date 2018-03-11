package org.charlie.javabrains.service;

public class LoginService {
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
}
