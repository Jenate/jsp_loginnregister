<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor=Gray text=maroon>
	<fieldset color=Black>
		<legend>Enter information to register</legend>
		<br />
		<form action="users.hola" >
			Name:<input type="text" name="name" placeholder="Enter Name" /><br />
			<br />
			 Age:<select  name="age" placeholder="Enter Age" >
			<% for (int a=18 ;a<=60 ;a++)
				{ %> <option value="<%=a %>" ><%=a %></option><% } %></select>
		<br />
			<br />
			 Email:<input type="email" name="email"
				placeholder="Enter Email" required="" /><br /> <br />
				
				 Password:<input
				type="password" name="password" placeholder="Enter Password"
				required="" /><br /> <br /> 
				
	City:<select  name="city">
				<% String[] cities={"mumbai","Pune","mangalore","noida","kanpur"};
				for(String ct : cities){%>
					<option value ="<%=ct %>"><%=ct %></option><% } %>
					
					</select>
				
				<br />
			<br />
				Gender:<input type="text" name="gender" placeholder="Enter Gender" required /><br /> <br />
			Favourite movie:<input type="text" name="movie" placeholder="Enter Favourite Movie" required /><br /> <br />
			
			Profile Photo:</label> <input id="image" type="file" name="profile_photo" placeholder="Photo" capture>
			<br> <br>
			 <input type="submit" value="Register" /> 
	</fieldset>
	</form><%@ include file="footer.html"%>
</body>
</html>