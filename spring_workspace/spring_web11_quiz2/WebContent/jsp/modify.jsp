<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
	integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<form action="updateDept" method="post">
		<h3>${deptno }부서 수정</h3>
			<table class="table">
				<tr>
					<th>부서명</th>
					<th>부서위치</th>
				</tr>
				<tr>
					<input type="hidden" name="deptno" value="${deptno }" />
					<td><input type="text" name="dname" /></td>
					<td><input type="text" name="loc" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="수정하기" />
					<a href="main.do"><input type="button" value="목록" /></a>
					</td>
				</tr>
				
			</table>
		</form>
	</div>
</body>
</html>