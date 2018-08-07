<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hola</title>
</head>
<body bgcolor=Gray text=maroon align="center">
<h1>Welcome</h1><hr>
<jsp:include page="banner.jsp" />
<form action="users.hola">
<fieldset color=Black>  
<legend>Enter details to login</legend><br/>
Email:<input type="email" name="email" placeholder="Enter email" required = ""/><br/><br/>  
Password:<input type="password" name="password" placeholder="Enter Password" required = ""/><br/><br/>  
<input type="submit" value="login"/> 
</form>  
<br><br>
<a href="Register.jsp">Register</a>|  
<a href="Forgot.jsp">Forgot Password?</a><br/>
</fieldset>
<%@include file="footer.html" %>
</body>
</html>