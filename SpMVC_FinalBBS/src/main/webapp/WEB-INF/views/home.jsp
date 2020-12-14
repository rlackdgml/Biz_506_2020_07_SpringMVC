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
table#notice-list {
	width: 80%;
	margin: 10px auto;
	border-collapse: collapse;
	border: 1px solid #aaa;
}

td, th {
	border: 1px solid #ccc;
}
</style>
</head>
<body>
	<h3>나의 홈페이지를 방문을 환영합니다.</h3>
	<table id="notice-list">
		<tr>
			<th>NO</th>
			<th>날짜</th>
			<th>작성자</th>
			<th>제목</th>
			<th>내용</th>
		</tr>
		<c:if test="${empty NOTICE_LIST}">
			<tr>
				<td colspan="5">데이터가 없습니다</td>
		</c:if>

		<tr>
			<td>${notice.date_time}</td>
			<td>${notice.writer}</td>

			<td><a href="${rootPath}/update?id=${notice.id}"> ${notice.s_subject} </a></td>
			<td><a href="${rootPath}/delete?id=${notice.id}">삭제</a></td>
		</tr>



	</table>

</body>
</html>