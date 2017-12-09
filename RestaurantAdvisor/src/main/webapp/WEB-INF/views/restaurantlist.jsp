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
		table td + td {
			
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
<p>Click on a restaurant to see its details:</p>
<table>
	<c:forEach items="${restaurant}" var="r">
	<tr>
		<td><a href="displayRestaurantDetails">${r.rname}</a></td>
	</tr>
	<tr>
		<td>About</td>
		<td>Style: ${r.diningtype}</td>
	</tr>
	<tr>
		<td>Dining Info</td>
		<td>Address: ${r.streetno} ${r.streetname} ${r.city} ${r.state} ${r.zip}</td>
		<td>Hours: ${r.hours}</td>
		<td>Price: ${r.pricerange}</td>
		<td>Delivery: ${r.deliveryflag}</td>
		<td>Outdoor Seating: ${r.outdoorseatingflag}</td>
	</tr>
	<tr>	
		<td>Contact Info</td>
		<td>Phone: ${r.phone}</td>
		<td>Email: ${r.email}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>