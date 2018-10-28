<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


<style>
.container.product_view .modal-dialog {
	max-width: 800px;
	width: 100%;
}

.container.pre-cost {
	text-decoration: line-through;
	color: #a5a5a5;
}

.container.space-ten {
	padding: 10px 0;
	body
	{
	font-family
	:
	Arial;
}

* {
	box-sizing: border-box;
}

form.example input[type=text] {
	padding: 10px;
	font-size: 17px;
	border: 1px solid grey;
	float: left;
	width: 80%;
	background: #f1f1f1;
}

form.example button {
	float: left;
	width: 20%;
	padding: 10px;
	background: #2196F3;
	color: white;
	font-size: 17px;
	border: 1px solid grey;
	border-left: none;
	cursor: pointer;
}

form.example button:hover {
	background: #0b7dda;
}

form.example::after {
	content: "";
	clear: both;
	display: table;
}
</style>


}
</style>
<head>
<body>
	<nav id="menu" class="navbar navbar-default navbar-fixed-top on">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand page-scroll" href="#page-top">DIGI MOBILE
				STORE</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="product.jsp" class="page-scroll">Menu</a></li>

				<li class="active"><a href="LogoutServlet" class="page-scroll">LogOut</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>
	<header id="header">
	<div class="intro">

		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 intro-text">

					<a href="#about" class="btn btn-custom btn-lg page-scroll">More
						Info</a>
				</div>
			</div>
		</div>
	</div>

	</head>
	<!------ Include the above in your HEAD tag ----------> <br>
	<%-- <form class="example" action="SearchServlet"
		style="margin: auto; max-width: 300px">
		<center>
			<input type="text" placeholder="Search by Company" name="search">
		</center>
		<button type="submit">
			<i class="fa fa-search"></i>
		</button>
	</form> --%>

	<body>
		<br>

		<c:forEach items="${list}" var="lb">
			<div class="col-md-4">
				<div class="thumbnail">
					<img
						src="<c:url value='images/uploadDir/${lb.getReferenceNumber()}.png'/>"
						alt="noimg">
					<div class="caption">
						<h4>
							<a href="#">Apple</a>
						</h4>
						<h1>${lb.getProductName()}</h1>
						<h1>${lb.getProductCompany()}</h1>
						<h1>${lb.getProductPrice()}</h1>
					</div>
					<div class="ratings">
						<p>
							<span class="glyphicon glyphicon-star"></span> <span
								class="glyphicon glyphicon-star"></span> <span
								class="glyphicon glyphicon-star"></span> <span
								class="glyphicon glyphicon-star"></span> <span
								class="glyphicon glyphicon-star"></span>
						</p>
					</div>
					<div class="space-ten"></div>
					<div class="btn-ground text-center">
						<!-- 						<form action="GetAndroidSession" method="post">
 -->
						<!-- <button type="button" class="btn btn-primary">
 -->
						<a
							href="GetAppleSession?referenceNumber=<c:out value="${lb.referenceNumber}"/>&productName=<c:out value="${lb.productName}"/> &productCompany=<c:out value="${lb.productCompany}"/> &productPrice=<c:out value="${lb.productPrice}"/>"><b><big><button>Buy
										Now</button></big></b></a> <i class="fa fa-shopping-cart"></i>
						<!-- 	</button>
						</form> -->
					</div>
					<div class="space-ten"></div>
				</div>
			</div>
		</c:forEach>
	</body>
</html>
