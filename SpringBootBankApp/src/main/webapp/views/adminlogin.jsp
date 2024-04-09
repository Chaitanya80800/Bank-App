<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function registerPerson() {
	alert("IN-Register");
	document.fn.action="openregpage";
	document.fn.submit();
	
}

function deletePerson() {
	alert("IN-Delete");
	document.fn.action="delete";
	document.fn.submit();
	
}

function editPerson() {
	alert("IN-Edit");
	document.fn.action="edit";
	document.fn.submit();
	alert("Data Successfully Updated...")
	
}
</script>
</head>
<body>
<div align="right">
<a href="logout">LogOut</a>
</div>
${msg}
<form name="fn">
<table border="2">
<tr>
<th>Select</th>
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

<c:forEach items="${data }" var="p">
<tr>
<td> <input type="radio" name="pid" value="${p.pid }"></td>
<td>${p.name }</td>
<td>${p.username }</td>
<td>${p.password }</td>
<td>${p.contact }</td>
<td>${p.address }</td>
<td>${p.dob }</td>
<td>${p.email }</td>
<td>${p.adhar }</td>
<td>${p.pan }</td>
<td>${p.bal }</td>
<td><a href="edit?pid=${p.pid }">EDIT</a> || <a href="delete?pid=${ p.pid }">DELETE</a></td>
</c:forEach>

</table>
<br>
<input type="button" value="ADD" onclick="registerPerson()"><br>
<br>
<input type="button" value="DELETE" onclick="deletePerson()"><br>
<br>
<input type="button" value="EDIT" onclick="editPerson()">

</form>
</body>
</html>