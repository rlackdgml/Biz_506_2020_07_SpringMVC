<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1'>
<title>나의 홈페이지</title>
<style>
form#write-form {
	width: 80%;
	margin: 10px auto;
}

form#write-form fieldset {
	border: 1px solid blue;
	border-radius: 10px;
}

form#write-form legend {
	color: blue;
	margin: 5px;
	padding: 5px;
}

form#write-form label {
	display: inline-block;
	width: 20%;
	padding: 4px;
	margin: 4px;
	color: blue;
	text-align: right;
	font-weight: bold;
}

form#write-form input {
	display: inline-block;
	width: 70%;
	padding: 4px;
	margin: 4px;
}

form#write-form textarea {
	width: 70%
}

div.button-box {
	text-align: right;
}

form#write-form .button-box button {
	color: white;
	cursor: pointer;
	outline: 0;
	border: 0;
	padding: 10px 16px;
	margin: 5px;
	border-radius: 5px;
}

button:hover {
	box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.5);
}

button#list {
	background-color: brown;
	color: white;
}

button#save {
	background-color: skyblue;
	color: white;
}
</style>


</head>
<body>
	<h3>성적작성</h3>

	<form method="POST" id="write-form" enctype="multipart/form-data">
		<fieldset>
			<legend>성적리스트</legend>
			<div>
				<label>학번</label> <input name="s_num" value="${GRADE.s_num}" />
			</div>
			<div>
				<label>이름</label> <input name="s_name" value="${GRADE.s_name}" />
			</div>
			<div>
				<label>국어</label> <input name="s_kor" value="${GRADE.s_kor}" />
			</div>
			<div>
				<label>영어</label> <input name="s_eng" value="${GRADE.s_eng}" />
			</div>
			<div>
				<label>수학</label> <input name="s_math" value="${GRADE.s_math}" />
			</div>
			<div>
				<label>총점</label> <input name="s_sum" value="${GRADE.s_sum}" />
			</div>
			<div>
				<label>평균</label> <input name="s_avg" value="${GRADE.s_avg}" />
			</div>
			<div>
				<label>기타</label> <input name="s_us" value="${GRADE.s_us}" />
			</div>

			<div class="button-box">
				<button type="button" id="list">리스트</button>
				<button type="submit" id="save">저장</button>
			</div>
		</fieldset>


	</form>
</body>
</html>