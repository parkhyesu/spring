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
			/* context = /ex 이거임. */
			String context = request.getContextPath();
		%>
		
		<!-- <%= context %> 액션에 이거 넣어줘야함. -->
		<form action="<%= context %>/studentView" method="post">
			이름 : <input type = "text" name = "name"> <br/>
			나이 : <input type = "text" name = "age"> <br/>
			학년 : <input type = "text" name = "gradeNum"> <br/>
			반 : <input type = "text" name = "classNum"> <br/>
			<input type = "submit" value = "전송">
		</form>
	
	</body>
</html>