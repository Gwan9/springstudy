<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous"> 
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</head>
<body>
	<div class=container>
	<table class="table">
	<tr>
		<th>사번</th>
		<th>이름</th>
		<th>급여</th>
		<th>직무</th>
	</tr>
	<tr>
		<td>${dto.empno }</td>
		<td>${dto.ename }</td>
		<td>${dto.sal }</td>
		<td>${dto.job }</td>
	</tr>
	<tr>
		<td colspan="2">
			<a href="list" class="btn btn-outline-primary">목록</a>
			<a href="modify?empno=${dto.empno}" class="btn btn-outline-success">수정</a>
			<a href="delete?empno=${dto.empno}" class="btn btn-outline-danger">삭제</a>
		</td>
	</tr>
	
	</table>
	</div>
</body>
</html>