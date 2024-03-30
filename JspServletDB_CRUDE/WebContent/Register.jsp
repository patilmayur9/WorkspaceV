<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SaveServlet">
User Name:<input type="text" name="username">
Password :<input type="text" name="password">
<!-- <input type="submit" value="submit"></button>  this is also valid -->
 <input type="submit" value="submit"></button>
</form>
<a href="ShowServlet">Show User List</a>
</body>
</html>