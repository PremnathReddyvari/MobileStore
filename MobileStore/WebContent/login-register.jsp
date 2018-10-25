<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShoppingKart</title>
<link href="bootstrap/css/shop-homepae.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet" />
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.2.1/css/bootstrap-combined.min.css"
	rel="stylesheet">
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<script src="bootstrap/scripts/jquery-1.7.1.min.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
<style>
.paymentinfo ul {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

.paymentinfo ul li {
	display: inline;
}
</style>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>
<div class="w3-container w3-teal">
		<a class="brand" href="HomePage.jsp"><h1>Mobile Store</h1></a> 
	</div>
	

	<!-- Section -->
	<section>
	<div class="container">
		<div class="breadcrumbs">
			</ul>
		</div>
		<div class="loginsection">
			<hr class="soft" />
			<div class="row">
				<div class="span5">
					<div class="well">
						<c:if test="${param.regStatus=='Fail'}">
							<p class="warning">Registration Unsuccessful.</p>
						</c:if>
						<h5>CREATE YOUR ACCOUNT</h5>
						<form action="InsertServlet" method="post">
							<div class="control-group">
								<label class="control-label" for="name">Name</label>
								<div class="controls">
									<input class="span3" type="text" name="name" id="name"
										placeholder="Enter you Name" required />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="email">E-mail Address</label>
								<div class="controls">
									<input class="span3" type="email" name="email" id="email"
										placeholder="Enter you email" required />
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label" for="password">Password</label>
								<div class="controls">
									<input class="span3" type="password" name="password"
										id="password" placeholder="Password" required />
								</div>
							</div>
							<div class="controls">
								<button type="submit" class="btn btn-primary">Create
									Your Account</button>
							</div>
						</form>
					</div>
				</div>
				<div class="span1">&nbsp;</div>
				<div class="span5">
					<div class="well">
						<h5>ALREADY REGISTERED? LOGIN HERE</h5>
						<form action="LoginServlet" method="post">
							<div class="control-group">
								<label class="control-label" for="inputEmail">Email</label>
								<div class="controls">
									<input class="span3" type="email" name="email" id="email"
										placeholder="E-mail Address" required>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputPassword">Password</label>
								<div class="controls">
									<input type="password" class="span3" name="password"
										id="password" placeholder="Password" required>
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="inputPassword">RoleName</label>
								<div class="controls">
									<select name="roleName">
										<option value="user">User</option>
										<option value="admin">Admin</option>
										
									</select>
								</div>
							</div>

							<div class="control-group">
								<div class="controls">
									<button type="submit" class="btn btn-primary">Sign in</button>

								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<hr class="soft" />
	</div>
	</section>
</body>
</html>