<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>


<c:choose>
    <c:when test="${empty carts }">
        <p>장바구니 내역이 없습니다.</p>
    </c:when>
    <c:otherwise>
        <div class="container">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">썸네일</th>
                    <th scope="col">상품명</th>
                    <th scope="col">가격</th>
                    <th scope="col">모델명</th>
                    <th scope="col">제조사</th>
                    <th scope="col">구매수량</th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>
                <c:set var="sno" value="1"/>
                <c:set var="totalPrice" value="0"/>
                <c:forEach var="cart" items="${carts}">
                    <tr>
                        <th scope="row"><c:out value="${sno}"/></th>
                        <td>
                            <a href="/product/${cart.productId}"></a><img src="${cart.thumnail}" width="100" height="100"></a>
                        </td>
                        <td>
                            <a href="/product/${cart.productId}">${cart.title}</a>
                        </td>
                        <td>${cart.price}원</td>
                        <td>${cart.model}</td>
                        <td>${cart.madeby}</td>
                        <td>${cart.ea}</td>
                        <td>
                            <button class="btn btn-danger" value="${cart.id}" onclick="deleteCart(${cart.id})">삭제</button>
                        </td>
                        <c:set var="totalPrice" value="${totalPrice+(cart.ea*cart.price)}"/>
                        <c:set var="sno" value="${sno+1}"/>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <hr />
            <h3>총 결재금액 : <c:out value="${totalPrice}"/>원</h3>
            <form method="post" action="/product/order">
                <input type="hidden" name="memberId" value="${carts[0].memberId}">
                <button type="submit" class="btn btn-primary btn-lg">결재하기</button>
            </form>
        </div>
    </c:otherwise>
</c:choose>


<script type="text/javascript">
    function deleteCart(cartId){
        $.ajax({
            type : "DELETE",
            url : "/api/cart/"+cartId,
            success : function(resultMsg) {
                window.location.reload();
            },
            error : function(e) {
                console.log("ERROR: ", e);
            }
        });
    }
</script>