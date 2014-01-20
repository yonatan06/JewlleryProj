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
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"></link>
<link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet"></link>
<!-- <link href="styles/bootstrap.min.css" rel="stylesheet"></link> -->
<link href="styles/site.css" rel="stylesheet"></link>




</head>
<body>


<div id="page" >
	<!-- ************************* header ****************************-->
	<header class="container">
		<div id="menu" class="navbar navbar-default navbar-fixed-top">
			<div id="navbar-menu">
				<div id="logo">
					<a href='.'>  Koby Palachi  </a>
				</div>
				<button class="btn btn-primary navbar-toggle" 
				data-toggle="collapse"
				data-target=".navbar-collapse"><span class="glyphicon glyphicon-chevron-down "></span></button>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="nav active"><a href="."> Home </a></li>
					<li class="nav"><a href="about.html"> About </a></li>
					<li class="nav"><a href="contact.html"> Contact </a></li>
				</ul>
			</div>
		</div>
	</header>
	<!-- ************************* section body ****************************-->
	<section id="body" class="container">
	<div class="row hidden-xs" >	
		<img  src="images/train.jpg" alt="1" class="col-md-2 col-md-offset-2"/>
		<img  src="images/train.jpg" alt="2" class="col-md-2"/>
		<img  src="images/train.jpg" alt="2" class="col-md-2"/>
		<img  src="images/train.jpg" alt="2" class="col-md-2"/>
	</div>
		<section id="main"class="col-md-8">
			<h1>main  header</h1>
			<p>
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				
			</p>
			
			<img  src="images/train.jpg" alt="Bowling" class="pull-right img-thumbnail">
			
			<p>
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
				main text main text main text main text main text main text main text main text
			</p>
		</section>
		
		<section id="sidebar" class="col-md-4">
			<h1>sidebar  header</h1>
			<p>
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
				sidebar text sidebar text sidebar text sidebar text sidebar text sidebar text
			</p>
		</section>
	</section>
	<hr/>
	<!-- ************************* footer ****************************-->
	<footer class="container">
		<p>text in  footer </p>
	</footer>
</div>

</body>
</html>