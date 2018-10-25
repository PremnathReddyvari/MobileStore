<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar {
	margin-bottom: 50px;
	border-radius: 0;
}

/* Remove the jumbotron's default bottom margin */
.jumbotron {
	margin-bottom: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f6f6f6;
	padding: 25px;
}
</style>
</head>
<body>
<header>
	<div class="jumbotron">
		<div class="container text-center">
			<h1>
				<b>DIGI ONLINE STORE</b>
			</h1>
			<p>BEST OFFERS</p>
		</div>
	</div>
</header>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Logo</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="HomePage.jsp"><a href="#">Home</a></li>
					<li><a href="LogoutServlet">LogOut</a></li>
					
				</ul>

			</div>
		</div>
	</nav>
	<p style="font-size:15px;">Welcome ${user.name}</p>

	
	<div class="container">
		<div class="row">
			<div class="col-xs-4 col-lg-4 ">
				<div class="panel panel-primary">
					<div class="panel-heading">ANDROID</div>
					<div class="panel-body">
						<img src="900image.jpg" class="img-responsive" style="width: 50%"
							alt="Image">
					</div>
					<div class="panel-footer">
						<a href="AndroidServlet?osId=1"><b>Android</b></a>
					</div>

				</div>
			</div>
			<div class="col-xs-4 col-lg-4">
				<div class="panel panel-danger">
					<div class="panel-heading">APPLE</div>
					<div class="panel-body">
						<img src="apple2.jpg" class="img-responsive" style="width: 50%"
							alt="Image">
					</div>
					<div class="panel-footer">
						<a href="AndroidServlet?osId=2"><b>iOS </b></a>
					</div>

				</div>
			</div>
			<div class="col-xs-4 col-lg-4">
				<div class="panel panel-success">
					<div class="panel-heading">SYMBIAN</div>
					<div class="panel-body">
						<img src="symbian2.jpg" class="img-responsive" style="width: 50%"
							alt="Image">
					</div>
					<div class="panel-footer">
						<a href="SymbianServlet"><b> Symbian</b></a>
					</div>
				</div>
			</div>
			<div class="container">
				<div class="row">
					<div class="col-xs-4 col-lg-4">
						<div class="panel panel-primary">
							<div class="panel-heading">Accessories</div>
							<div class="panel-body">
								<img src="900image.jpg" class="img-responsive"
									style="width: 50%" alt="Image">
							</div>
							<div class="panel-footer">
								<a href="AndroidServlet"><b>Mobile Accessories</b></a>
							</div>
						</div>
					</div>

				
			
			<div class="container">
				<div class="row">
					<div class="col-xs-4 col-lg-4">
						<div class="panel panel-primary">
							<div class="panel-heading">Order History</div>
							<div class="panel-body">
								<img src="900image.jpg" class="img-responsive"
									style="width: 50%" alt="Image">
							</div>
							<div class="panel-footer">
								<a href="HistoryServlet"><b>Previous Orders</b></a>
							</div>
						</div>
					</div>
				
			
			<div class="container">
				<div class="row">
					<div class="col-xs-4 col-lg-4">
						<div class="panel panel-primary">
							<div class="panel-heading">Feedback</div>
							<div class="panel-body">
								<img src="900image.jpg" class="img-responsive"
									style="width: 50%" alt="Image">
							</div>
							<div class="panel-footer">
								<a href="AndroidServlet"><b>Please Rate us</b></a>
							</div>
						</div>
					</div>
				</div>
			</div><br><br>
<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form>
</footer>

			</body>
</html>
