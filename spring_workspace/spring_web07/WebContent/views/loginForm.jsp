<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</head>
<body>
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