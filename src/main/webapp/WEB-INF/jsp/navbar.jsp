<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="navbar-menu">
	<div id="logo">
		<a href='.'>YOKO</a>
	</div>
	<div>
		<sec:authorize access="isAnonymous()">
			<a class="btn btn-success" href="<c:url value="/login.html"/>">Login</a>
		</sec:authorize>
		<sec:authorize access="isAuthenticated()">
		   	<a class="btn btn-warning" href="j_spring_security_logout"> Logout </a>
		</sec:authorize>
	</div>
	<button class="btn btn-primary navbar-toggle" 
	data-toggle="collapse"
	data-target=".navbar-collapse"><span class="glyphicon glyphicon-chevron-down"></span></button>
</div>
<div class="navbar-collapse collapse">
	<ul class="nav navbar-nav">
		<li class="nav"><a href="myStatistics.html"> My Statics </a></li>
		<li class="nav"><a href="addFuelRecord.html"> Add Fuel Record </a></li>
		<li class="nav"><a href="home.html"> Account Settings </a></li>
		<li class="nav"><a href="globalStatistics.html"> Global Statistics </a></li>
	</ul>
</div>