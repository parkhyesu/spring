<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<%
			String context = request.getContextPath();
		%>
		
		<form action="<%= context %>/circleArea" method="post">
		
			���� ���� : <input type="text" name = "radius">
			<input type="submit" value = "����">
		</form>
		
	</body>
</html>