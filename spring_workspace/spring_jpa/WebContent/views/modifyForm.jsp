<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>modifyForm.jsp</h2>
	<div class="container">
	<form action="modify" method="post">
		<table class="table">
			<tr>
				<th>부서번호</th>
				<th>부서명</th>
				<th>부서위치</th>
			</tr>
			<tr>
				<td>${dto.deptno}<input type="hidden" name="deptno" value="${dto.deptno }" /></td>
				<td><input type="text" name="dname" value="${dto.dname }" /></td>
				<td><input type="text" name="loc" value="${dto.loc }"/></td>
			</tr>
			<tr>
				<td colspan="3">
					<input type="submit" value="수정" />
				</td>
			</tr>
		</table>
	
	</form>
	</div>
</body>
</html>