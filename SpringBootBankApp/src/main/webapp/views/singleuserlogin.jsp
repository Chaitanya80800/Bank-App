<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="right">
<a href="logout">LogOut</a>
</div>
<h2>Welcome "${pr.username}"</h2>

<form name="fn">
<table border="2">
<tr>
<th>ID</th>
<th>Name</th>
<th>UserName</th>
<th>Password</th>
<th>Contact</th>
<th>Address</th>
<th>D.O.B</th>
<th>Email</th>
<th>Adhar No</th>
<th>Pan No</th>
<th>Balance</th>
</tr>


<tr>
<td>${pr.pid }</td>
<td>${pr.name }</td>
<td>${pr.username }</td>
<td>${pr.password }</td>
<td>${pr.contact }</td>
<td>${pr.address }</td>
<td>${pr.dob }</td>
<td>${pr.email }</td>
<td>${pr.adhar }</td>
<td>${pr.pan }</td>
<td>${pr.bal }</td>

</table>
<br>
</form>
<a href="openwithdraw?username=${pr.username }">Withdraw</a> || <a href="opendeposite?username=${pr.username }">Deposite</a>
|| <a href="opencheckbal?username=${pr.username }">Check Balance</a>
</body>
</html>