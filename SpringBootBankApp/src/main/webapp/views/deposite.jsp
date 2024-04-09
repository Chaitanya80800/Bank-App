<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="deposite">
<pre>
<input type="hidden" name="name" value="${ps.name }">
Current Balance:${ps.bal }
<br>
Deposite Amount:<input type="text" name="bal" value="${ps.bal }"><br>

<input type="submit" value="DEPOSITE"><br>

</pre>
</form>


</body>
</html>