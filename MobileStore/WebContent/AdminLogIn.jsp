<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content=
  "width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}
.input-container {
    display: -ms-flexbox;
    display: flex;
    width: 100%;
    margin-bottom: 15px;
}

.input-field {
    width: 100%;
    padding: 10px;
    outline: none;
}

.input-field:focus {
    border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
    background-color: dodgerblue;
    color: white;
    padding: 15px 20px;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.btn:hover {
    opacity: 1;
}
style>
body {
	position: relative;
}


</style>
</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">DIGI MOBILE STORE </a>
	
			</div>
		</div>
	</nav><br><br><br>
	
	
	
	<form action="AdminLogIn" style="max-width:500px; margin:auto" method="post">
  <h1 align="center">  Admin login</h1><br>
 

  <div class="input-container">
    
 <b>	</b> <input class="input-field" type="email" placeholder="Email" name="email">
  </div>
  
  <div class="input-container">
    
  <b></b> <input class="input-field" type="password" placeholder="Password" name="password">
  </div>

  <button type="submit" class="btn">Submit</button>
</form>
<br>
<center> <input type="button" value="Go back!" onclick="history.back()"></center>
  </body>
  
  




</html>