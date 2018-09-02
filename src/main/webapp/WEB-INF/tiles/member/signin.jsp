<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="container">
    <h4 style="margin-bottom: 20px;">지금 가입하시고 이쁘고 귀여운 프렌즈 상품을 만나보세요!</h4>
    <div class="col-lg-4">
        <div class="signup-form"><!--sign up form-->
            <form action="signin" method="post">
                <input type="text" placeholder="Name" name="customerId">
                <input type="password" placeholder="Password" name="customerPw">
                <p style="margin-top: 10px; margin-bottom: 10px;">가입을 안하셨나요? <a href="/member/signup">회원가입</a></p>
                <button type="submit" class="btn btn-default">로그인</button>
            </form>
        </div>
    </div>

</div>