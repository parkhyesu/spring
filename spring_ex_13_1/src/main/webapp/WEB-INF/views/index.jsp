<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<%
			/* context = /ex �̰���. */
			String context = request.getContextPath();
		%>
		
		<!-- <%= context %> �׼ǿ� �̰� �־������. -->
		<form action="<%= context %>/studentView" method="post">
			�̸� : <input type = "text" name = "name"> <br/>
			���� : <input type = "text" name = "age"> <br/>
			�г� : <input type = "text" name = "gradeNum"> <br/>
			�� : <input type = "text" name = "classNum"> <br/>
			<input type = "submit" value = "����">
		</form>
	
	</body>
</html>