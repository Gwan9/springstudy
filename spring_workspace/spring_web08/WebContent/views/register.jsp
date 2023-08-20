<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
</head>
<body>
<div class="container">
	<form action="join.do" method="post">
		<table class="table">
			<tr>
				<th>아이디 </th>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<th>비밀번호 </th>
				<td><input type="password" name="pw" /></td>
			</tr>
			<tr>
				<th>이름 </th>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<th>성별 </th>
				<td><input type="text" name="gender" /></td>
			</tr>
			<tr>
				<th>동기 </th>
				<td><textarea rows="10" cols="30" name="motive"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" value="회원가입" />
				<input type="button" value="홈으로" />
				</td>
			</tr>

		</table>


	</form>
</div>

</body>
</html>