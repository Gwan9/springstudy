<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>form.jsp</h2>
	<!-- 파일같은 긴거 전송 post -->
	<%-- <form action="upload.do" method="post" enctype="multipart/form-data">
	<input type="file" name="file" />
	<input type="submit" value="전송" />
	</form> --%>
	
	<form:form method="post" action="upload.do" modelAttribute="uploadFile" enctype="multipart/form-data">
	
		<input type="file" name="file" />
		<input type="submit" value="전송 " />
		<form:errors path="file" />
	
	</form:form>
</body>
</html>