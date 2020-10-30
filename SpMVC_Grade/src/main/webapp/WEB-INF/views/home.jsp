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
  table#grade-list{
      width: 80%;
      margin: 10px auto;
      border-collapse: collapse;
      border: 1px solid #aaa;
   }
   td,th{
      border: 1px solid #ccc;
      
   }
</style>
</head>
<body>
	<h3>성적리스트</h3>

	<table id="grade-list">
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총점</th>
			<th>평균</th>
			<th>기타</th>
		</tr>
		
		<c:if test="${empty GRADE_LIST}">
      <tr><td colspan="8">데이터가 없습니다</td>
   </c:if>
   <c:forEach items="${GRADE_LIST}" var="grade">
      <tr>
         <td>${grade.s_num}</td>
         <td>${grade.s_name}</td>
         <td>${grade.s_kor}</td>
         <td>${grade.s_eng}</td>
         <td>${grade.s_math}</td>
         <td>${grade.s_sum}</td>
         <td>${grade.s_avg}</td>
         <td>${grade.s_us}</td>
         
         
         <td>
         <a href="${rootPath}/delete?num=${grade.num}">삭제</a>
         </td>
         </tr>
   </c:forEach>
		
		
	</table>

<div>
  <a href="${rootPath}/write">성적작성</a>
</div>
</body>
</html>