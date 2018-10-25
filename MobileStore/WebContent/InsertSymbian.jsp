<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Book</title>
</head>
<body>
	<form action="InsertSymbian"  method="post" enctype="multipart/form-data">
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