<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<script>
	document.addEventListener("DOMContentLoaded", function() {
		document.querySelector("#ems-write")
				.addEventListener("click",function() {
					document.location.href = "${rootPath}/ems/write"
				})
		
		document.querySelector("table").addEventListener("click", function (event) {
			let tag_name = event.target.tagName;
			if(tag_name === "TD") {
				
				
				let seq = event.target.closest("TR").dataset.seq
				if(seq) {
					//alert(seq)
					document.location.href = "${rootPath}/ems/detail/" + seq
				}
			}
		});
		
	})


</script>
<style>
	td.ems-tr {
		cursor: pointer;
	}
	
	td.ems-tr:hover {
		background-color: #ccc;
	}
	#ems-write{
      background-color: blue;
      color: white;
      padding:8px;
      float: right;
      margin: 30px;
   }

</style>
<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>수신</th>
			<th>발신</th>
			<th>일자</th>
			<th>시각</th>
			<th>제목</th>
			<th>내용</th>
		</tr>
	</thead>
	<tbody>
		<c:if test="${empty EMS_LIST}">
		  <tr><td colspan="6">데이터가 없습니다</td></tr>
		</c:if>
		<c:forEach items="${EMS_LIST}" var="vo" varStatus="i">
		<tr class="ems-tr" data-seq="${vo.id}">
			<td>${vo.from_email}</td>
			<td>${vo.to_email}</td>
			<td>${vo.s_date}</td>
			<td>${vo.s_time}</td>
			<td data-id="${vo.id}" class="ems-subject">
				${vo.s_subject}
			</td>
			<td>${vo.s_content}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<button id="ems-write">글쓰기</button>


