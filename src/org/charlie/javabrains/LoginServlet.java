package org.charlie.javabrains;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.charlie.javabrains.dto.User;
import org.charlie.javabrains.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userId, pass);
		
		if (result) {
			User user = new User();
			user = loginService.getUserDetails(userId);
			//we have to save this user in the session scope
			request.getSession().setAttribute("user", user);
			response.sendRedirect("Success.jsp");
			return;
		} else {
			response.sendRedirect("Login.jsp");		
			return;
		}
	}

}
