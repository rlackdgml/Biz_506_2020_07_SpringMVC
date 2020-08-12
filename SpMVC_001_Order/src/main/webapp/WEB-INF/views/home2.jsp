<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>
<link rel="stylesheet"  href="resources/css/main.css" type="text/css" >
</head>
<body>
	
	
	
	<!-- jsp 일 경우만 가능 -->
	<%@ include file="/WEB-INF/views/include/include-header.jspf"%>  
	<%@ include file="/WEB-INF/views/include/include-nav.jspf"%>
	
	
	<section>
		<h3>반갑습니다</h3>
		<p>나는 ${page} 입니다
	</section>
	<section>
		<img src="resources/images/jupyter.jpg" alt ="목성 수평선" width="100px">
	
	</section>
	<footer>
		<address>CopyRight &copy; dhdlqkqh2003@naver.com</address>
	</footer>
	
	
</body>
</html>