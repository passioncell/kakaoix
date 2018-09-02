<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <div class="features_items"><!--features_items-->
        <h2 class="title text-center">FRIENDS ITEMS</h2>


        <c:forEach var="product" items="${products}">
            <div class="col-sm-4" id="${product.id}">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <img src="${product.imageUrl[0]}" alt="">
                            <h2>${product.price}</h2>
                            <p>${product.title}</p>
                            <a href="/product/${product.id}" class="btn btn-default add-to-cart"><i class="fa fa-eye"></i>상세보기</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>${product.price}</h2>
                                <p>${product.title}</p>
                                <a href="/product/${product.id}" class="btn btn-default add-to-cart"><i class="fa fa-eye"></i>상세보기</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>


        <ul class="pagination">
            <li class="active"><a href="">1</a></li>
        </ul>
    </div>
</div>