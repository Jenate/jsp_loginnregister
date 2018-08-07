package lti.hola.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService1;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String referer = request.getHeader("referer");
		if (referer.contains("Home.jsp")) {
			// request coming from home for login aunthentication
			RegisterBean user = LoginController.authenticate(request);
			if(user !=null) {
//				login Successfull
				response.sendRedirect("Profile.jsp");
			}else
			{
				response.sendRedirect("Home.jsp");
			}
		} else if (referer.contains("Register.jsp")) {
			// request coming for user registration
			if(RegisterController.registration(request))
				response.sendRedirect("Home.jsp");
			else
				response.sendRedirect("Register.jsp");
				
		} else if (referer.contains("Forgot.jsp")) {
			// request coming for validating user for password change
			if(LoginController.forgetPassword(request))
				response.sendRedirect("change.jsp");
			else
				response.sendRedirect("Forgot.jsp");
				
		} else
		 {
			// Request coming for updating password
			if(LoginController.changePassword(request))
				response.sendRedirect("Home.jsp");
			else
			    response.sendRedirect("change.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Deligating call to doget() method to perform common logic
		doGet(request, response);
	}

}
