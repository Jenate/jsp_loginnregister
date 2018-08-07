<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot password</title>
</head>
<body bgcolor=Gray text=maroon>
<fieldset color=Black>  
<legend>enter your detail to get your password</legend>

<form action="loginprocess.jsp" method="post">
Email:<input type="email" name="email" placeholder="Enter Email"/><br/>
<h4>Which is your Favourite movie?</h4> 
Answer<input type="text" name="answer" placeholder="Enter your favourite movie"/><br/><br/>
<input type="button" value="submit"/> 
</fieldset>
</form>
</body>
</html>