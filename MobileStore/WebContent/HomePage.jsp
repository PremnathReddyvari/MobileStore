<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>HOME PAGE</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
footer {
	background-color: #f2f2f2;
	padding: 25px;
}
</style>

</head>

<body>

	<!NAVIGATION BAR CODE> <nav id="menu"
		class="navbar navbar-default navbar-fixed-top on">
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
				<li class="active"><a href="login-register.jsp" class="page-scroll">Login</a></li>
			</ul>
			
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav> <header id="header">
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

	</header> <!NAVIGATION BAR CODE ENDS> <!CREATING CAROUSAL>
	<div class="container-fluid">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
		

			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">

					<img src="images/add1.jpg">
				</div>

				<div class="item">
					<img src="images/add2.jpg">
				</div>

				<div class="item">
					<img src="images/add3.jpg">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<!CAROUSAL END>

	<style>
.logo {
	font-size: 200px;
}

@media screen and (max-width:768px) {
	.col-sm-4 {
		text-align: center margin:25px 0;
	}
}
</style>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-8">
				<h2>About Company Page</h2>
				<p>Digi Mobile Store is a leading destination for online mobile
					shopping in India, offering some of the best prices and a
					completely hassle-free experience with options of paying through
					cash on delivery.</p>
				<p>We deliver reliably to Chennai, Bangalore, Coimbatore,
					Cuddalore, Hosur, Kanchipuram, Madurai, Mangalore, , Perambalur,
					Salem,Tanjore,
					Vellore,Hyderabad,Vijayawada,Tirupati,Kochi,Palakkad.</p>
			</div>
			<div class="col-sm-">
				<span class="glyphicon glyphicon-signal logo"></span>
			</div>
		</div>
	</div>
		
		
		
		<div id="contact" class="text-center">
  <div class="container">
    <div class="section-title text-center">
      <h2>Contact Us</h2>
    </div>
    <div class="col-md-10 col-md-offset-1 contact-info">
      <div class="col-md-4">
        <h3>Address</h3>
        <hr>
        <div class="contact-item">
          <p>4321 dlf,</p>
          <p>Ramapuram, block 10 </p>
        </div>
      </div>
      <div class="col-md-4">
        <h3>Working Hours</h3>
        <hr>
        <div class="contact-item">
          <p>Monday-Saturday: 09:00 - 20:00</p>
          <p>Sunday: CLOSED</p>
        </div>
      </div>
      <div class="col-md-4">
        <h3>Contact Info</h3>
        <hr>
        <div class="contact-item">
          <p>Phone: +1800 6666 3333</p>
          <p>Email: info@digimobilestore.com</p>
        </div>
      </div>
    </div>
     </div>
    </div>
    
    
		
		
		
		
		
</body>
</html>