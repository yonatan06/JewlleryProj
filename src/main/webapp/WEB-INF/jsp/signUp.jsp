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
<script type="text/javascript" src="scripts/helperFunctions.js"></script>
<script type="text/javascript" src="scripts/scripts.js"></script>
<script type="text/javascript">
		function getJson(url,handler){
			$.getJSON(url,{ajax : 'true'},handler);
		}
		
		$(document).ready(function(){
			getJson('<spring:url value="getCarModels.json"/>', handleGetCarModelsOnSignUp);
		});
		
</script>

<link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet"></link>
<link href="styles/site.css" rel="stylesheet"></link>

</head>
<body>
	<header>
		<nav id="menu">
			<jsp:include page="navbar.jsp"/>
		</nav>
	</header>
	
	


	<div class="signup row col-md-4 col-md-offset-4">
		<h3>Sign Up</h3>
		<form:form commandName="createUser" action="signUp.html" method="post">
			<table>
			<tr>
		        <td><form:label path="userInfo.username" class="form-label">Username</form:label></td>
		        <td><form:input path="userInfo.username" class="form-control pretty-form-control" /></td> 
		    </tr>
			<tr>
		        <td><form:label path="userInfo.firstName" class="form-label">First Name</form:label></td>
		        <td><form:input path="userInfo.firstName" class="form-control pretty-form-control"/></td> 
		    </tr>
		    <tr>
		        <td><form:label path="userInfo.lastName" class="form-label">Last Name</form:label></td>
		        <td><form:input path="userInfo.lastName" class="form-control pretty-form-control"/></td>
		    </tr>
		    <tr>
		        <td><form:label path="password" class="form-label">Password</form:label></td>
		        <td><form:input path="password" class="form-control pretty-form-control"/></td>
		    </tr>
		    <tr>
		        <td><form:label path="retypePassword" class="form-label">Retype Password</form:label></td>
		        <td><form:input path="retypePassword" class="form-control pretty-form-control"/></td>
		    </tr>
		    
		    <tr>
		        <td><h3>Please fill in your car details</h3></td>
		    </tr>
		    
		    <tr>
		        <td><form:label path="userInfo.carInstance.color" class="form-label">Car Color</form:label></td>
		        <td><form:input path="userInfo.carInstance.color" class="form-control pretty-form-control"/></td>
		    </tr>
		    <tr>
		    	<td><form:label path="userInfo.carInstance.carModel.model" class="form-label">Car Model</form:label></td>
		        <td><form:select path="userInfo.carInstance.carModel.model" id="carModels"/></td>
		    </tr>
			<tr>
				<td><input type="submit" name="Sign up" value="Sign up" class="btn btn-success"></td>
			</tr>
			</table>
		</form:form>
	</div>

	
	


	<footer>
	
	</footer>
</body>
</html>