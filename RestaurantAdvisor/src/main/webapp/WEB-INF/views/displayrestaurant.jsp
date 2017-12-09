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
		.restaurantname
		{
			font-size: 18pt;
			font-weight: bold;
		}
	</style>
</head>
<body>
<h1>Restaurant Advisor</h1>
<ul>
  <li><a href="mainPage">Home</a></li>
  <li><a href="getRestaurantList">Restaurants</a></li>
  <li><a href="getRestaurantsAndRatings">Reviews</a></li>
  <li><a href="">Orders</a></li>
  <li><a href="">Logout</a></li>
  <li><input type="text" placeholder="Search for a restaurant...">&nbsp;&nbsp;&nbsp;<input type="submit" value="Search"></li>
</ul>
<br><div class="restaurantname">${restaurantinfo.rname} (${restaurantinfo.diningtype})</div>
<br>Phone: ${restaurantinfo.phone}
<br>Email: ${restaurantinfo.email}
<br>Hours: ${restaurantinfo.hours}
<br>Price: ${restaurantinfo.pricerange}
<br></br>
<table>
	<tr>
		<td>${restaurantinfo.streetno} ${restaurantinfo.streetname}</td>
	</tr>
	<tr>
		<td>${restaurantinfo.city} ${restaurantinfo.state} ${restaurantinfo.zip}</td>
	</tr>
	<tr>
		<td></td>
	</tr>
	<tr>
		<td>${restaurantinfo.deliveryflag}</td>
	</tr>
	<tr>
		<td>${restaurantinfo.outdoorseatingflag}</td>
	</tr>
</table>
</body>
</html>