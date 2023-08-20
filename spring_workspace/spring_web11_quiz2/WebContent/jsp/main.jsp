<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>main.jsp</h2>
		<img src="images/after.PNG" alt="" />
	<ul>
	
		
		<c:if test="${empty dto }">
		<li><a href="login.do">로그인</a></li>
		</c:if>
		
		<c:if test="${!empty dto }">
		<a href="logout.do">${dto.name} 님 환영합니다</a>
		<li><a href="list.do">부서목록보기</a></li>
		<li><a href="addData.do">부서추가하러가기</a></li>
		</c:if>
		
	</ul>
</body>
</html>