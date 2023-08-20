<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous"> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>

</head>
<body>
	<h2>form.jsp</h2>
	<form action="register.do" method="post">
		<div class="container">
			<table class="table">
				<tr>
					<td>id</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>pw</td>
					<td><input type="text" name="pw" /></td>
				</tr>
				<tr>
					<td>name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>gender</td>
					<td><input type="text" name="gender" /></td>
				</tr>
				<tr>
					<td>motive</td>
					<td><input type="text" name="motive" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="회원가입" /></td>
					<td><a href="main.do">취소</a></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>