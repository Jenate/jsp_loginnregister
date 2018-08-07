package lti.hola.service;

import java.util.Base64.Encoder;
import java.util.Base64;

import java.util.Base64.Decoder;

import lti.hola.bean.ForgotBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
import lti.hola.repo.UserRepository;
import lti.hola.repo.UserRepository1;

public class UserService1 implements UserService {
	private UserRepository repo;
	
	public UserService1() {
		repo = new UserRepository1();
	}

	@Override
	public RegisterBean authenticate(LoginBean login) {
		// password Encoding
//		System.out.println("Welcome");
		Encoder encoder = Base64.getEncoder();
		String encoded = encoder.encodeToString(login.getPassword().getBytes());
		login.setPassword(encoded);
		return repo.authenticate(login);
	}

	@Override
	public Boolean validate(ForgotBean forgot) {
		// movie Encode
		java.util.Base64.Encoder encoder = Base64.getEncoder();
		forgot.setMovie(encoder.encodeToString(forgot.getMovie().getBytes()));
		return repo.validate(forgot);
	}

	@Override
	public boolean changePassword(LoginBean login) {
		// password Encoding
		java.util.Base64.Encoder encoder = Base64.getEncoder();
		login.setPassword(encoder.encodeToString(login.getPassword().getBytes()));
		return repo.changePassword(login);
	}

	@Override
	public boolean persist(RegisterBean register) {
		// password and movie encoding
		java.util.Base64.Encoder encoder = Base64.getEncoder();
		register.setPassword(encoder.encodeToString(register.getPassword().getBytes()));
		register.setMovie(encoder.encodeToString(register.getMovie().getBytes()));
		return repo.persist(register);
	}

}
