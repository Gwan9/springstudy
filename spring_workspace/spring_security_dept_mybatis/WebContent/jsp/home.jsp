<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>home.jsp</h2>
	
	<%-- <!-- 로그인 해야만 보이는 부분 -->
	<sec:authorize access="isAuthenticated()">
	<a href="<c:url value='common/logout'/>">로그아웃</a>
	
	</sec:authorize>
	--%>
	
	<a href="dept/list">부서목록보기</a>
	<a href="admin/admin">관리자전용</a> 
	
</body>
</html>