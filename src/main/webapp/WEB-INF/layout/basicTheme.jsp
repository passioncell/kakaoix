<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title><tiles:getAsString name="title"/></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link href="/static/css/bootstrap.min.css" rel="stylesheet">
<link href="/static/css/font-awesome.min.css" rel="stylesheet">
<link href="/static/css/prettyPhoto.css" rel="stylesheet">
<link href="/static/css/price-range.css" rel="stylesheet">
<link href="/static/css/animate.css" rel="stylesheet">
<link href="/static/css/main.css" rel="stylesheet">
<link href="/static/css/responsive.css" rel="stylesheet">
<!--[if lt IE 9]>
<script src="/static/js/html5shiv.js"></script>
<script src="/static/js/respond.min.js"></script>
<![endif]-->
<link rel="shortcut icon" href="/static/images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
href="/static/images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
href="/static/images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
href="/static/images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="/static/images/ico/apple-touch-icon-57-precomposed.png">


</head><!--/head-->

<body>
<header id="header"><!--header-->
<div class="header_top"><!--header_top-->
<div class="container">
<div class="row">
<div class="col-sm-6">
<div class="contactinfo">
<ul class="nav nav-pills">
<li><a href="#"><i class="fa fa-phone"></i> 010 7160 3434</a></li>
<li><a href="#"><i class="fa fa-envelope"></i> passion_cell@naver.com</a></li>
</ul>
</div>
</div>
<div class="col-sm-6">
<div class="social-icons pull-right">
<ul class="nav navbar-nav">
<li><a href="https://www.facebook.com/kakaofriends"><i class="fa fa-facebook"></i></a></li>
<li><a href="#"><i class="fa fa-twitter"></i></a></li>
<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
<li><a href="#"><i class="fa fa-dribbble"></i></a></li>
<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
</ul>
</div>
</div>
</div>
</div>
</div><!--/header_top-->
<%--<c:set var="test" value="${customerId}"/>--%>
<div class="header-bottom"><!--header-bottom-->
<div class="container">
<div class="row">
<div class="col-sm-9">
<div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        </button>
</div>
<div class="mainmenu pull-left">
        <ul class="nav navbar-nav collapse navbar-collapse">
        <li><a href="/">처음으로</a></li>
        <li><a href="/product/page/1">상품보기</a></li>
        <li><a href="/product/cart">장바구니</a></li>
        <li><a href="/product/order/history">구매내역</a></li>
        <li>
        <c:choose>
                <c:when test="${not empty customerId }">
                        <a href="/member/signout">로그아웃</a>
                </c:when>
                <c:otherwise>
                        <a href="/member/signin">로그인</a>
                </c:otherwise>
        </c:choose>
        </li>
        </li>
        </ul>
</div>
</div>
<div class="col-sm-3">
<div class="search_box pull-right">
</div>
</div>
</div>
</div>
</div><!--/header-bottom-->
</header><!--/header-->

<tiles:insertAttribute name="header"/>
<section>
<div class="container" style="padding:20px;">
<div class="row">
<tiles:insertAttribute name="body"/>
</div>
</div>
</section>
<footer id="footer"><!--Footer-->
<div class="footer-top">
        <div class="container">
        <div class="row">
        <div class="col-sm-2">
        <div class="companyinfo">
        <h2><span>KAKAO</span>-FRIENDS</h2>
        <p>카카오아이엑스 사업자등록번호 : 354-86-00070
        통신판매업 신고번호 : 2017-서울강남-02573
        대표이사 : 권승조 </p>
        </div>
        </div>
        <div class="col-sm-7">
        <div class="col-sm-3">
        <div class="video-gallery text-center">
        <a href="https://www.youtube.com/watch?v=ZgHNyCtBOhs">
        <div class="iframe-img">
        <img src="/static/images/thumnail_video1.png" alt="" />
        </div>
        <div class="overlay-icon">
        <i class="fa fa-play-circle-o"></i>
        </div>
        </a>
        <p>카카오프렌즈- 리본을 두르면 행복해지는 라이언 매직!</p>
        <h2>2017. 10. 16.</h2>
        </div>
</div>

<div class="col-sm-3">
<div class="video-gallery text-center">
<a href="#">
<div class="iframe-img">
<img src="/static/images/thumnail_video2.png" alt="" />
</div>
<div class="overlay-icon">
<i class="fa fa-play-circle-o"></i>
</div>
</a>
<p>무지 탄생의 비밀! 무지&콘 스페셜 에디션</p>
<h2>2016. 3. 18.</h2>
</div>
</div>

</div>

</div>
</div>
</div>


<div class="footer-bottom">
<div class="container">
<div class="row">
<p class="pull-left">Copyright © KAKAO IX Corp.</p>
<p class="pull-right">Developed by <span><a href="#"> SeoHyunBae</a></span></p>
</div>
</div>
</div>

</footer><!--/Footer-->

<script src="/static/js/jquery.js"></script>
<script src="/static/js/bootstrap.min.js"></script>
<script src="/static/js/jquery.scrollUp.min.js"></script>
<script src="/static/js/price-range.js"></script>
<script src="/static/js/jquery.prettyPhoto.js"></script>
<script src="/static/js/main.js"></script>
</body>
</html>