<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="test" method="post">
User Name<input type="text" name ="username"/>
Password<input type="password" name="password"/>
<input type="button" value="Submit">
String uname=request.getParameter("username");
		System.out.println("User name is : "+uname);
		
		String pass=request.getParameter("password");
		System.out.println("Password is : "+pass);
</form>
</body>
</html>