<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>


<%@ include file="/WEB-INF/views/include/include-head.jspf"%>
<style>
	section {
		margin: 10px;
	}
	#buttons {
		padding: 10px;
		text-align: right;
	
	
	}
	#order_input {
		background-color : blue;
		color:  white;
		padding: 5px;
		border: 0;
		border-bottom: 2px solid blue;
		
	
	
	
	}
	/* 어떤 tag에 마우스를 올렷을때의 효과 지정*/
	#order_input:hover {
		background-color:  gray;
		color: black;
		border-bottom: 2px solid yellow;
	
	
	}
	td a {
	
		color: black;
		cursor: pointer;
	
	}
	



</style>

</head>

<body>



	<!-- jsp 일 경우만 가능 -->
	<%@ include file="/WEB-INF/views/include/include-header.jspf"%>
	<%@ include file="/WEB-INF/views/include/include-nav.jspf"%>
	<h3>${korea}</h3>


	<section>


		<table border="1">
			<thead>
				<tr>
					<th>NO</th>
					<th>주문번호</th>
					<th>주문일자</th>
					<th>고객번호</th>
					<th>상품번호</th>
					<th>상품이름</th>
					<th>가격</th>
					<th>수량</th>
					<th>합계</th>
				</tr>

			</thead>
			<tbody>

				<c:forEach items = "${ORDERS }" var="vo" varStatus="index">
					<!-- tr값을 10개만들어라 -->
				<tr>
						<!-- tr값을 10개만들어라  count 순번이 몇번인지 알려준다 반복문사용-->
						<td>${index.count}</td>
						<td>
						
						<a href = "order?seq=${vo.o_seq}">
						${vo.o_num}
						</a>
												
						</td>
						<td>${vo.o_date}</td>
						<td>${vo.o_cnum}</td>
						<td>${vo.o_pcode}</td>
						<td>상품이름</td>
						<td>${vo.o_price}</td>
						<td>${vo.o_qty}</td>
						<td>${vo.o_price * vo.o_qty}</td>

				</tr>
				
				</c:forEach>
			</tbody>
		</table>

	</section>
	<hr/>
	<section id="buttons">
		<button id ="order_input"><a href = "input">주문서작성</a></button>

	</section>
	
	<section>
		<p>EL 단일변수 : ${price} , 변수가 선언되지 않더라도 오류가 없다</p>
		<p>EL 객체변수 : ${vo.price}, vo 객체는 있는데 vo에 price필드변수의 getter,getPrice()가 없을 경우 exception이 발생</p>
		
	</section>
	
	<%@ include file="/WEB-INF/views/include/include-footer.jspf"%>

</body>
</html>