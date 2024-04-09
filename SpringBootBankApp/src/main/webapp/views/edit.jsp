<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<pre>
<input type="hidden" name="pid" value="${ps.pid }">
Name:<input type="text" name="name" value="${ps.name }"><br>
Username:<input type="text" name="username" value="${ps.username }"><br>
Password:<input type="text" name="password" value="${ps.password}"><br>
Contact:<input type="number" name="contact" value="${ps.contact }"><br>
Address:<input type="text" name="address" value="${ps.address }"><br>
D.O.B:<input type="text" name="dob" value="${ps.dob }"><br>
Email:<input type="text" name="email" value="${ps.email }"><br>
Adhar No:<input type="number" name="adhar" value="${ps.adhar }"><br>
Pan No:<input type="text" name="pan" value="${ps.pan }"><br>
Opening Balance:<input type="number" name="bal" value="${ps.bal }"><br>
<input type="submit" value="UPDATE"><br>

</pre>
</form>


</body>
</html>