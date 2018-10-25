<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container w3-teal">
  <h1>Book Reads</h1>
</div>

<title>Show All Users</title>
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


<ul>
  <li><a href="?user=${user}" name="ps">View Previous Logs</a></li>
  <li><a href="LogoutServlet" name="ul">Log Out</a></li>
  
  
</ul>
<center>

<p style="font-size:20px;">Welcome, <br>These are the PRODUCTS YOU HAVE ordered .</p>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                
                <th>Name</th>
                <th>Email</th>
                <th>Product Name</th>
                  <th>Product Comapny</th>
                      <th>Product Price</th>
                
                
               <!--  <th colspan=2>Action</th> -->
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="list">
                <tr>
                    <td><c:out value="${list.name}" /></td>
                     <td><c:out value="${list.email}" /></td>
                      <td><c:out value="${list.productName}" /></td>
                       <td><c:out value="${list.productCompany}" /></td>
                         <td><c:out value="${list.productPrice}" /></td>
                       
                     <%-- <td><input type="checkbox" name="selected" value="${issue.issueId}"/></td> --%>
                     <%--  <c:out value="${issue.approved}" /> --%>
              			  <!--  <td><a href="issue">Request for Issue</a></td> -->
                
              <%--   <td><a href="<c:out value="remove/${libs.id}"/>">Delete</a></td> --%>
                    <%-- <td><a href="<spring:url value="delete/${libs.id}"/>">">Delete</a></td> --%>
                   <%--  <td><a href="/?action=edit&id=<c:out value="${libs.id}"/>">Update</a></td> --%>
                    <%-- <td><a href="delete?action=delete&id=<c:out value="${libs.id}"/>"></a></td> --%>
                </tr>
                
                
                
                
       
            </c:forEach>
            
            
            
   
        </tbody>
    </table>
    
  
    <br><br><br>
      <center> <input type="button" value="Go back!" onclick="history.back()"></center>
                
    </center>
   <!--  <input type="submit" value="Submit"> -->
    <!-- <p><a href="UserController?action=insert">Add User</a></p> -->
</body>
</html>