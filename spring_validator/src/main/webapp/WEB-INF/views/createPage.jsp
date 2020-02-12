<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType = "text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
		<form action="student/create">
			이름 : <input type = "text" name = "name" value = "${student.name}"><br />
			아이디 : <input type = "text" name = "id" value = "${student.id}"><br />
			<input type = "submit" value = "전송">
		</form>
	</body>
</html>
