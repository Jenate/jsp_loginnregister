package lti.hola.service;
import lti.hola.bean.ForgotBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
public interface UserService {
RegisterBean authenticate(LoginBean login);
Boolean validate(ForgotBean forgot);
boolean changePassword(LoginBean login );
boolean persist(RegisterBean register);

}
