<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
<script type="text/javascript" src="jquery-1.10.2.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	  //your code here
	});
	
	function yonatan(){
		debugger;
		var flickerAPI = "http://api.flickr.com/services/feeds/photos_public.gne?jsoncallback=?";
		  $.getJSON( flickerAPI, {
		    tags: "mount rainier",
		    tagmode: "any",
		    format: "json"
		  })
		    .done(function( data ) {
		      $.each( data.items, function( i, item ) {
		        $( "<img>" ).attr( "src", item.media.m ).appendTo( "#images" );
		        if ( i === 3 ) {
		          return false;
		        }
		      });
		    });
	}
	
	
</script>

</head>
<body>
	<div id="images"></div>
</body>
</html>