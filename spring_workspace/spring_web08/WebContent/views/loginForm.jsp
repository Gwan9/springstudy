<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm.jsp</title>
</head>
<body>
	<h2>loginForm.jsp</h2>
	<form action="login.do" method="post">
		<table class="table">
			<tr>
				<th>ID</th>
				<th><input type="text" name="id" id="" /></th>
			</tr>
			<tr>
				<th>PW</th>
				<th><input type="text" name="pw" id="" /></th>
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" value="로그인" />
				<input type="button" value="회원가입" />
				</td>
			</tr>
		</table>
	
	</form>
</body>
</html>