<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>main.jsp</h2>
	<!-- 로그인이 되어 있는 경우 -->
	<c:if test="${ !empty dto }">
	<!-- test="참이면" 여기 코드가 실행 -->
		<h3><a href="logout.do">${dto.name}</a> 님 환영합니다.</h3>
	</c:if>
	<!-- 로그인이 되어 있지 않은 경우 -->
	<c:if test="${ empty dto }">
	<a href="login.do">로그인</a>
	<!-- LoginController => /login.do GET  loginForm()=> loginForm.jsp  -->
	</c:if>
	
	
	
	<a href="join.do">회원가입</a>
	
</body>
</html>