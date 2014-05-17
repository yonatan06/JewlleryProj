<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Statistics</title>
<script type="text/javascript" src="scripts/jquery-2.0.3.js"></script>
<script type="text/javascript" src="styles/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="scripts/onLoad.js"></script>
<link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet"></link>
<link href="styles/site.css" rel="stylesheet"></link>

</head>
<body>
	<header>
		<nav id="menu">
			<jsp:include page="navbar.jsp"/>
		</nav>
	</header>
	<section id="main">
		<div class="yk-form row col-md-4 col-md-offset-4">
			<h3>Login</h3>
			<form:form commandName="fuelRecord">
				<table class="table">
					<tr>
						<td>Amount:</td><td><form:input path="amount" class="form-control"/></td>
					</tr>
					<tr>
						<td>Price:</td><td><form:input path="price" class="form-control"/></td>
					</tr>
					<tr>
						<td>currentKM:</td><td><form:input path="currentKM" class="form-control"/></td>
					</tr>
					<tr>
						<td><input type="submit" value="Add Fuel Record" class="btn btn-success"/></td>
					</tr>
				</table>
			</form:form>
		</div>
	</section>
	<footer>
	
	</footer>
</body>
</html>