<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
<script type="text/javascript" src="scripts/jquery-2.0.3.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="scripts/helperFunctions.js"></script>
<script type="text/javascript" src="scripts/example.js"></script>
<script type="text/javascript">
	function getJson(url,handler){
		$.getJSON(url,{ajax : 'true'},handler);
	}
	
	$(document).ready(function(){
		getJson('<spring:url value="getimages.json"/>', handleGetImages);
	});
</script>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"></link>
<link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet"></link>
<!-- <link href="styles/bootstrap.min.css" rel="stylesheet"></link> -->
<link href="styles/site.css" rel="stylesheet"></link>

</head>
	<body>
		<div id="div1">
			<img class="col-md-3 col-md-offset-3">
			<img class="col-md-3">
		</div>
	</body>
</html>