<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
	<head>
		<title> 메인페이지 </title>
	</head>
	
	<body>
	
		<h1>
			메인페이지
		</h1>
		
		<!-- 익명(로그인안한사람) 이 들어오면 loginForm 으로 보내겠다. -->
		<sec:authorize access = "isAnonymous()">
			<p><a href = "<c:url value = "/login/loginForm"/>"> 로그인 </a></p>
		</sec:authorize>
		
		
		<sec:authorize access = "isAuthenticated()">
			<form:form action = "${pageContext.request.contextPath}/logout" method = "POST">
				<input type = "submit" value = "로그아웃" />
			</form:form>
		</sec:authorize>
		
		
		<h3>
			[ <a href = "<c:url value = "/user/userHome"/>"> 유저 홈 </a>]
			[ <a href = "<c:url value = "/admin/adminHome"/>"> 관리자 홈 </a>]
		</h3>
		
		</body>
</html>
