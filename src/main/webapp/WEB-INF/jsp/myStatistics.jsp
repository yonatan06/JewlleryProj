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
		getJson('<spring:url value="getFuelRecords.json"/>', handleGetMyStatisticsReport);
	});
</script>
<link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet"></link>
<link href="styles/site.css" rel="stylesheet"></link>

</head>
<body>
	<header>
		<nav id="menu">
			<jsp:include page="navbar"/>
		</nav>
	</header>
	<section id="main">
		<div class="myStatisticsTable col-md-6 col-lg-6 col-sm-6">
			<table class="table table-striped">
				<tr>
					<th>Amount</th><th>Price</th><th>Total car KM</th><th>Time</th>
				</tr>
			</table>
		</div>
		<div class="myStatisticsBoard col-md-6 col-lg-4 col-sm-6 col-lg-offset-1">
			<table>
			</table>
		</div>
	</section>
	<footer>
	
	</footer>
</body>
</html>