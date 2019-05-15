<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>AddProductCommon</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
			$('#addBtn').click(function(){
				console.log('addBtn Click');
				$('#addProductCommon').submit();
			});
		});
	</script>
</head>
<body>
	<h1>상품 추가</h1>
	<form id="addProductCommon" action="${pageContext.request.contextPath}/product/addProductCommon" method="post">
		<div>카테고리</div>
		<div>
			<select name="categoryNo">
				<c:forEach var="category" items="${categoryList}">
					<option value="${category.categoryNo}">${category.categoryName}</option>
				</c:forEach>
			</select>
		</div>
		<div>상품이름</div>
		<div><input type="text" name="productCommonName"></div>
		<div>상품가격</div>
		<div><input type="text" name="productCommonPrice"></div>
		<div>상품상세</div>
		<div><input type="text" name="productCommonDescription"></div>
		<div>상품색상</div>
		<div><input type="text" name="productColor"></div>
		<div>상품사이즈</div>
		<div><input type="text" name="productSize"></div>
		<div>상품재고</div>
		<div><input type="text" name="productStock"></div>
		<div><button id="addBtn" type="button">추가</button></div>
	</form>
</body>
</html>