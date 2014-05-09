<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html">
<html>
	<head>
		<title>Custom Login Page</title>
		<script type="text/javascript" src="scripts/jquery-2.0.3.js"></script>
		<script type="text/javascript" src="styles/bootstrap/js/bootstrap.js"></script>
		<script type="text/javascript" src="scripts/onLoad.js"></script>
		<link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet"></link>
		<link href="styles/site.css" rel="stylesheet"></link>
	</head>
	
	<body onload='document.f.j_username.focus()'>
		
		<header>
			<nav id="menu">
				<jsp:include page="navbar"/>
			</nav>
		</header>
		<h3>Fitness Tracker Custom Login Page</h3>
		<c:if test="${not empty error}">
			<div class="alert alert-block">
				Your Login was unsuccessfull. <br/>
				Caused: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
			</div>
		</c:if>
		
		
		<section id="main">
			<div class="login row col-md-4 col-md-offset-4">
				<h3>Login</h3>
				<form:form commandName="login" action="j_spring_security_check" name="f" method="post">
					<input name="j_username" class="form-control" placeholder="user name">
					<input name="j_password" type="password" class="form-control" placeholder="password">	
					<input type="submit" name="Submit" value="Submit" class="btn btn-success">
				</form:form>
			</div>
		</section>
		
<%-- 		<form action="j_spring_security_check" name="f" method="post"> --%>
<!-- 			<table> -->
<!-- 				<tr> -->
<!-- 					<td>User:</td>  -->
<!-- 					<td><input type="text" name="j_username"></td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td>Password:</td> -->
<!-- 					<td><input type="password" name="j_password"></td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td colspan="2"><input type="submit" name="Submit" value="Submit"></td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td colspan="2"><input type="reset" name="reset"></td> -->
<!-- 				</tr> -->
<!-- 			</table> -->
<%-- 		</form> --%>
		
	</body>
	<!--
	
	<body>


	<footer>
	
	</footer>
</body> 
	 -->
</html>