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
		
		이름 : ${studentInfo.name}
		나이 : ${studentInfo.age}
		학년 : ${studentInfo.gradeNum}
		반 : ${studentInfo.classNum}
		
	</body>
</html>