<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<c:choose>
    <c:when test="${empty histories }">
        <p>거래완료 내역이 없습니다.</p>
    </c:when>
    <c:otherwise>
        <div class="container">
            <h3>구매이력</h3>
            <table class="table table-hover">
                <thead>
                <tr>
                    <th scope="col">상품명</th>
                    <th scope="col">결재일시</th>
                    <th scope="col">카테고리</th>
                    <th scope="col">제조사</th>
                    <th scope="col">수량</th>
                    <th scope="col">가격</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="history" items="${histories}">
                    <tr>
                        <td>${history.title}</td>
                        <td><fmt:formatDate value="${history.orderAt}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                        <td>${history.category}</td>
                        <td>${history.madeby}</td>
                        <td>${history.ea}</td>
                        <c:set var="individualPrice" value="${history.price}"/>
                        <c:set var="ea" value="${history.ea}"/>
                        <c:set var="sumPrice" value="${ea*individualPrice}"/>
                        <td>${sumPrice}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </c:otherwise>
</c:choose>

<%--private int id;--%>
<%--private int ea;--%>
<%--private Date orderAt;--%>
<%--private String title;--%>
<%--private String category;--%>
<%--private String model;--%>
<%--private String madeby;--%>
<%--private int price;--%>
<%--private String description;--%>
<%--private int memberId;--%>
<%--private int productId;--%>