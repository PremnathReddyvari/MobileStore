

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container w3-teal">
  <h1>Mobile Store</h1>
</div>
<ul>
  <li><a href="HomePage.jsp">Home</a></li>
  <li><a href="InsertSymbian.jsp">Add Symbian Phones</a></li>
   <li><a href="InsertAndroid.jsp">Add Symbian Phones</a></li>
  
  
  
</ul>

<center><h1><b>Insert Apple Phones </b></h1></center>
</head>


<body>
	<form action="InsertApple"  method="post" enctype="multipart/form-data">
		<table align="center">
			<tr>
				<td>Product Name:</td>
				<td><input type="text" name="productName"></td>
			</tr>
			<tr>
				<td>Product Company</td>
				<td><input type="text" name="productCompany"></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><input type="text" name="productPrice"></td>
			</tr>
			<tr>
				<td>Reference Number</td>
				<td><input type="text" name="referenceNumber"></td>
			</tr>
			<tr>
					<tr>
				<td>Image:</td>
				<td><input type="file" name="file"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>