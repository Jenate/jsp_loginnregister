package lti.hola.repo;

import lti.hola.bean.ForgotBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
/**
 * 
 * @author Manisha,jenate
 * @version 1.0
 *
 */
public interface UserRepository {
	RegisterBean authenticate(LoginBean login);
	Boolean validate(ForgotBean forgot);
	boolean changePassword(LoginBean login );
	boolean persist(RegisterBean register);
}
