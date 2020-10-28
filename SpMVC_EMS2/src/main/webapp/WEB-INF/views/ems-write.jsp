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
img {
display: block;
}
</style>

</head>
<body>
	<h3>나의 홈페이지를 방문을 환영합니다.</h3>
	<form method="POST" id="write-form" enctype="multipart/form-data">
	<fieldset>
		<legend>메일쓰기</legend>
		<div>
			<label>보내는 Email</label> <input name="from_email" value="${EMS.from_email}" />
		</div>
		<div>
			<label>받는 Email</label> <input name="to_email" value="${EMS.to_email}" />
		</div>
		<div>
			<label>보내는 날짜</label> <input name="s_date" value="${EMS.s_date}" />
		</div>
		<div>
			<label>보내는 시각</label> <input name="s_time" value="${EMS.s_time}" />
		</div>
		<div>
			<label>제목</label> <input name="s_subject" value="${EMS.s_subject}" />
		</div>
		<div>
			<label>내용</label>
			<textarea name="s_content">${EMS.s_content}</textarea>
		</div>
		<div>
			<label>첨부파일1</label> 
			<input name="file1" type="file"/> 
		</div>
		<div>
			<img src="${rootPath}/files/${EMS.s_file1}" width="100px" >	
		</div>
		<div>
			<label>첨부파일2</label> 
			<input name="file2" type="file"/> 
		</div>
		<div>
			<img src="${rootPath}/files/${EMS.s_file2}" width="100px" >
		</div>
		<div class="button-box">
			<button type="button" id="list">리스트</button>
			<button type="submit" id="save">저장</button>
		</div>
		</fieldset>


	</form>
</body>
</html>