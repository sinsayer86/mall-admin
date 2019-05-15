<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	관리자 페이지
	<c:if test="${loginAdmin == null}">
		<ol>
			<li><a href="${pageContext.request.contextPath}/admin/adminLogin">로그인</a></li>
		</ol>
	</c:if>
	<c:if test="${loginAdmin != null}">
		<ol>
			<li><a href="${pageContext.request.contextPath}/category/addCategory">카테고리 추가</a></li>
			<li><a href="${pageContext.request.contextPath}/category/getCategoryList">카테고리 리스트</a></li>
			<li><a href="${pageContext.request.contextPath}/product/addProductCommon">상품 추가</a></li>
			<li><a href="${pageContext.request.contextPath}/product/addProductCommonList">상품 리스트</a></li>
			<li><a href="${pageContext.request.contextPath}/admin/adminLogout">로그아웃</a></li>
		</ol>
	</c:if>
	
	
</body>
</html>