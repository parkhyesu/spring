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
		
			원의 넓이 : <input type="text" name = "radius">
			<input type="submit" value = "전송">
		</form>
		
	</body>
</html>