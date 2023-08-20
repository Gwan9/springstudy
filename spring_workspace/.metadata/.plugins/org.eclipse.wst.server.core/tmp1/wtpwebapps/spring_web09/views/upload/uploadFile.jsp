<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>upload.jsp</h2>
	<h2>${fileName }</h2>
	<h2>${filePath }</h2>
	
	<a href="download.do?fileName=${fileName}">${fileName}</a>
	<img src="${filePath}" alt="${fileName}" />
</body>
</html>