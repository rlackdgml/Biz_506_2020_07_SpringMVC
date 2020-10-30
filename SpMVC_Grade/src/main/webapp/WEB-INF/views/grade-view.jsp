<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value ="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1'>
<title>나의 홈페이지</title>
</head>
<body>
<h3>나의 홈페이지를 방문을 환영합니다.</h3>

<p> 학번: ${GRADE.s_num}</p>
<p> 이름: ${GRADE.s_name} </p>
<p> 국어: ${GRADE.s_kor}</p>
<p> 영어: ${GRADE.s_eng}</p>
<p> 수학: ${GRADE.s_math}</p>
<p> 총점: ${GRADE.s_sum}</p>
<p> 평균: ${GRADE.s_avg}</p>
<p> 기타: ${GRADE.s_us}</p>
</body>
<a href="${rootPath}/">처음으로</a>
</body>
</html>