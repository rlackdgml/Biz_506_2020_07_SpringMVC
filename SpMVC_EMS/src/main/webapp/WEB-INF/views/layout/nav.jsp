<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value ="${pageContext.request.contextPath}"/>
<script>
	
	document.addEventListener("DOMContentLoaded", function() {
		
		document.querySelector("#nav-bbs").addEventListener("click",function(){
			document.location.href="${rootPath}/bbs/list"
			
		})
		
	})

</script>
<nav>
	<ul>
		<li>Home</li>
		<li id="nav-ems">수신Email</li>
		<li id="nav-ems">발신Email<li>
		<li id="nav-ems"></li>
		<li id="nav-ems"></li>
		<li id="nav-ems"></li>
		
	</ul>
</nav>