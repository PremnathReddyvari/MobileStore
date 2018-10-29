<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<body>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<ul>
		<li><a class="active" href="product" name="aa">Home</a></li>
		
		<li><a href="LogoutServlet" name="vn">Log Out</a></li>
	</ul>



	<p align="center" style="font-size: 50px;">Order Confirmation</p>
	<center>
		<title>Order Confirmation</title>
		<form action="OrderServlet" method="POST">

<p style="font-size:20px;">Welcome your referenceNumber is : ${referenceNumber} </p>
			<table>
			<tr>
					<th> Your Name<br></th>
					<td><input type="text" name="name" value="${user.name}" readonly></td>
				</tr>
		
		
			<tr>
					<th> Your Email<br></th>
					<td><input type="text" name="email" value="${user.email}" readonly></td>
				</tr>
			
				<tr>
					<th>Product Name<br></th>
					<td><input type="text" name="productName" value="${productName}" readonly></td>
				</tr>
				<br>
				<br>
				<tr>
					<th>Product Company:</th>
					<td><input type="text" name="productCompany" value="${productCompany}" readonly></td>
				</tr>

				<tr>
					<th>Product Price:</th>
					<td><input type="text" name="productPrice" value="${productPrice}" readonly></td>

				</tr>

					<tr>
						<th>Address </th>
					<td><input type="text" name="address" ></td>

				</tr>


							</table>

			<br>
			<br> <input type="submit" value="Submit" name="submit"> 
			</form>
	</center>
 <center> <input type="button" value="Go back!" onclick="history.back()"></center>

	
</body>
</html>