<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurants</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<style>
		ul {
			list-style-type: none;
			margin: 0;
			padding: 0;
			overflow: hidden;
		}
		li {
		    float: left;
		}
		li a {
		    display: block;
    		padding: 8px;
		}
	</style>
</head>
<body>
<h1>Welcome to Restaurant Advisor</h1>
<ul>
  <li><a href="mainPage">Home</a></li>
  <li><a href="restaurantList">Restaurants</a></li>
  <li><a href="">Reviews</a></li>
  <li><a href="">Orders</a></li>
  <li><a href="">Logout</a></li>
  <li><input type="text" placeholder="Search for a restaurant...">&nbsp;&nbsp;&nbsp;<input type="submit" value="Search"></li>
</ul>
<p>Here is the list of available restaurants:</p>
</body>
</html>