<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<div class="container">
    <div class="col-sm-9 padding-right">
        <div class="product-details"><!--product-details-->
            <div class="col-sm-5">
                <div class="view-product">
                    <img src="${product.imageUrl[0]}" alt="">
                </div>
                <div id="similar-product" class="carousel slide" data-ride="carousel">

                    <!-- Controls -->
                    <a class="left item-control" href="#similar-product" data-slide="prev">
                        <i class="fa fa-angle-left"></i>
                    </a>
                    <a class="right item-control" href="#similar-product" data-slide="next">
                        <i class="fa fa-angle-right"></i>
                    </a>
                </div>

            </div>
            <div class="col-sm-7">
                <div class="product-information"><!--/product-information-->
                    <img src="/static/images/product-details/new.jpg" class="newarrival" alt="">
                    <h2>${product.title}</h2>
                    <p>모델명: ${product.model}</p>
                    <span>${product.price}원</span>
                    <p><b>카테고리:</b> ${product.category}</p>
                    <p><b>제조사:</b> ${product.madeby}</p>
                    <label>구매수량:</label>
                    <form id="cartForm">
                        <input class="form-control" type="number" value="1" name="ea" id="ea" min="1" max="10">
                        <div class="row" style="margin-top: 30px;">
                                <button type="submit" class="btn btn-fefault cart">
                                    <i class="fa fa-shopping-cart"></i>
                                    장바구니에 추가
                                </button>
                            <input type="hidden" value="0" name="isEndOfTransaction" id="isEndOfTransaction"/>
                            <input type="hidden" value="${fkMemberId}" name="fkMemberId" id="fkMemberId"/>
                            <input type="hidden" value="${product.id}" name="fkProductId" id="fkProductId"/>
                        </div>
                    </form>

                </div><!--/product-information-->
            </div>
        </div><!--/product-details-->

        <div class="category-tab shop-details-tab"><!--category-tab-->
            <div class="col-sm-12">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#details" data-toggle="tab">상세설명</a></li>
                </ul>
            </div>
            <div class="tab-content">

                <div class="tab-pane fade active in" id="details">
                    <div class="col-sm-12">
                        <p>
                            ${product.description}
                        </p>
                        <c:forEach var="url" items="${product.imageUrl}">
                            <div class="row">
                                <img src="${url}" class="Rounded Corners" width="100%">
                            </div>
                        </c:forEach>
                        <pre>
[ 국내 배송 ]

배송
· 배송사: CJ대한통운
· 배송비: 국내 2,500원 (3만 원 이상 구매 시 무료배송)
· 배송기간: 오후 3시 이전 주문 당일 출고 (영업일 기준)
단, 상품의 재고 상황, 배송량, 배송 지역에 따라 배송기일이 추가로 소요될 수 있는 점 양해 부탁드립니다.

취소/교환/반품
· 주문 취소 및 배송지 변경은 “주문접수” 단계에서만 가능합니다.
마이페이지에서 취소 또는 변경하실 수 있습니다.
· 교환 및 반품은 배송완료 후 7일 이내만 가능합니다.
단, 재화 등의 내용이 표시, 광고 내용과 다르거나 계약내용을 다르게 이행한 경우에는 재화 등을 공급받은 날로부터 3개월 이내, 그 사실을 안 날 또는 알 수 있었던 날로부터 30일 이내에 교환 및 반품이 가능합니다.
· 다음의 경우 교환 및 반품이 불가합니다.
- 이용자에게 책임 있는 사유로 재화 등이 멸실 또는 훼손된 경우
- 포장이 훼손되어 상품가치가 상실된 경우 (예: 택과 라벨이 훼손된 경우 등)
- 이용자의 사용 또는 일부 소비에 의해 재화 등의 가치가 현저히 감소한 경우
- 복제가 가능한 재화 등의 포장을 훼손한 경우
- 시간 경과에 의하여 재판매가 곤란할 정도로 상품의 가치가 현저히 감소한 경우
- 고객의 주문에 따라 개별 생산되는 상품의 경우
· 상품의 불량/하자 및 표시광고 및 계약 내용이 다른 경우 해당 상품의 회수 비용은 무료이나, 고객님의 단순변심에 의한 교환/반품일 경우에는 교환/반품 배송비를 고객님께서 직접 부담하셔야 합니다.

환불
· 주문취소 및 반품 시 환불은 주문 시 이용하신 결제수단으로 2~7 영업일 이내 환불됩니다.

기타 문의
· 기타 교환 및 반품에 대한 문의는 1:1 문의하기 또는 1577-6263으로 문의해주세요.



[ 글로벌 배송 ]

배송
· 배송사: EMS
· 배송비: EMS 요금 적용
· 국가별 배송비는 글로벌 배송 안내 페이지를 참고해주세요. (홈페이지 하단 글로벌배송)
· 배송기간: 주문일로부터 1~3일 이내 출고
단, 상품의 재고 상황, 배송량에 따라 배송기일이 추가적으로 소요될 수 있는 점 양해 부탁드립니다.

취소/교환/반품
· 주문 취소 및 배송지 변경은 “주문접수” 단계에서만 가능합니다.
마이페이지에서 취소 또는 변경하실 수 있습니다.
· 글로벌 배송 구매 시, 단순 변심에 의한 교환 및 반품이 불가합니다.

통관/관세
· 국가 세관 규정에 따르면, 배송 과정에서 나라별로 관세가 발생할 수 있으며 관세는 고객 부담입니다.
상세 문의사항은 가까운 우체국이나 세관 또는 거주하시는 국가의 우체국에 문의바랍니다.
· 배송 국가별 금지 및 제한 품목을 주문 전 확인 바랍니다.

기타 문의
· 기타 문의사항은 1:1 문의 또는 global@kakaofriends.com 으로 문의해주세요.
                        </pre>

                    </div>
                </div>

            </div>
        </div><!--/category-tab-->


    </div>
</div>


<script type="text/javascript">
    $( document ).ready(function() {
        // SUBMIT FORM
        $("#cartForm").submit(function(event) {
            // Prevent the form from submitting via the browser.
            event.preventDefault();
            ajaxPost();
        });


        function ajaxPost(){
            // PREPARE FORM DATA
            var formData = {
                ea : $("#ea").val(),
                isEndOfTransaction :  $("#lastname").val(),
                fkMemberId : $("#fkMemberId").val(),
                fkProductId : $("#fkProductId").val()
            };

            // DO POST
            $.ajax({
                type : "POST",
                contentType : "application/json",
                url : "/api/cart",
                data : JSON.stringify(formData),
                dataType : 'json',
                success : function(result) {
                   alert(result.msg);
                },
                error : function(e) {
                    console.log("ERROR: ", e);
                }
            });
        }

    })
</script>