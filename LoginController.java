package lti.hola.web;

import javax.servlet.http.HttpServletRequest;

import lti.hola.bean.ForgotBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;
import lti.hola.service.UserService1;

public class LoginController {
	public static RegisterBean authenticate(HttpServletRequest request) {
		UserService service = new UserService1();
		// instantiating login bean to hold login credentials
		LoginBean login = new LoginBean();
		// Reading request parameters and storing
		login.setEmail(request.getParameter("email"));
		login.setPassword(request.getParameter("password"));
		// passing login object to service method
		RegisterBean user = service.authenticate(login);
		return user;
	}

	public static boolean changePassword(HttpServletRequest request) {
		UserService service = new UserService1();
		LoginBean change = new LoginBean();
		// Reading Request Parameters and storing in login bean object
		change.setEmail(request.getParameter("email"));
		change.setPassword(request.getParameter("password"));
		return service.changePassword(change);
	}

	public static boolean forgetPassword(HttpServletRequest request) {
		UserService service = new UserService1();
		ForgotBean forget = new ForgotBean();
		// Reading Request Parameters and storing in login bean object
		forget.setEmail(request.getParameter("email"));
		forget.setMovie(request.getParameter("movie"));
		return service.validate(forget);
	}
}
