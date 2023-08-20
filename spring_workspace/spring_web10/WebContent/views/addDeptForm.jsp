<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>addDeptForm.jsp</h2>
	<form action="addDept.do" method="post">
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>부서위치</th>
		</tr>
	
		<tr>
			<td><input type="text" name="deptno" id="" /></td>
			<td><input type="text" name="dname" id="" /></td>
			<td><input type="text" name="loc" id="" /></td>
		</tr>
		<tr>
			<td colspan="3">
				<input type="submit" value="추가" />		
			</td>
		</tr>
	</table>
	</form>
</body>
</html>