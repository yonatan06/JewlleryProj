<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
<script type="text/javascript" src="jquery-1.10.2.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	$.getJSON('<spring:url value="getimages.json"/>',{
		ajax : 'true'
	}, function(data){
		var html = '<ul>';
		for (var i = 0; i < data.length; i++){
			html += '<li>\n\t<img src="' + data[i].path + '">\n</li>';
		}
		html += "</ul>";
		$('#images').html(html);
	});	
});
</script>
</head>
<body>
	<div id="images"></div>
</body>
</html>