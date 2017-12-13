<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reviews</title>
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
		th {
			text-align: left;
			border-bottom: 1px solid black;
		}
		.mytext300 {
 				width: 300px;
		}		
		.mytext250 {
 				width: 225px;
		}
		.mytext50 {
 				width: 50px;
		}
	</style>
</head>
<body>
<h1>Restaurant Advisor</h1>
<ul>
  <li><a href="mainPage">Home</a></li>
  <li><a href="getRestaurantList">Restaurants</a></li>
  <li><a href="getRestaurantsAndRatings">Reviews</a></li>
  <li><a href="getRestaurantOrders">Orders</a></li>
  <li><a href="">Logout</a></li>
  <li><input type="text" placeholder="Search for a restaurant...">&nbsp;&nbsp;&nbsp;<input type="submit" value="Search"></li>
</ul>
<c:forEach items="${reviewinfo}" var="r" begin="0" end="0">
<br><div class="restaurantname">${r.rname}</div>
</c:forEach>
<br>
<table>
	<c:forEach items="${reviewinfo}" var="r">
	<th>${r.reviewtitle} - ${r.rating}/5</th>
	<tr>
		<td>${r.reviewdescr}</td>
	</tr>
	</c:forEach>
</table>
<br>
<br>
<br>
<br>
<form:form method="POST" action="addReview" modelAttribute="custreview">
     Add your review:
     <table>
        <tr>
            <td><form:input path="reviewtitle" class="mytext250" placeholder="Title"/> <form:input type="number" path="rating" min="1" max="5" class="mytext50" placeholder="Rate"/> / 5</td>
        </tr>
        <tr>
            <td><form:textarea path="reviewdescr" rows="5" class="mytext300" placeholder="Enter your review here..."/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="Clear"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>