<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

	<div class="w3-container w3-teal">
		<h1>Mobile Store</h1>
	</div>

	<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}
</style>
</head>
<ul>
<li><a class="active" href="HomePage.jsp" name="aa">Home</a></li>
</ul>
			
<h1 align="center">  Thank You For Your Order </h1>
<div style="text-align: center">
<h3> </h3>
<h4>Your order of <b> ${productName}</b>  of <b> ${productPrice} </b> Indian Rupees is confirmed.</h4>


 <h6> You can expect your Order in 2 3 days. </h6>
 
 <br><br>
 
 
 <a href="product.jsp"><input type="button" value="Click to GO BACK TO MENU"></a><br><br>
   </div>
   
   
   
   
   </body>
   </html>