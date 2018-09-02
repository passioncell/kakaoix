<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="container">
    <div class="signup-form"><!--sign up form-->
        <h2>회원가입</h2>
        <div class="col-lg-6">
            <form action="/member/signup" method="post" onsubmit="return doSubmit()" id="signupForm">
                <input type="text" placeholder="아이디" name="customerId" id="customerId">
                <input type="password" placeholder="비밀번호" name="customerPw" id="customerPw">
                <input type="password" placeholder="비밀번호 확인" name="custoperPwCheck" id="customerPwCheck">
                <input type="text" placeholder="성명" name="customerName" id="customerName">
                <input type="text" placeholder="전화번호(010-1234-5678)" name="tel" id="tel">
                <input type="text" placeholder="주소" name="address" id="address">
                <button type="submit" class="btn btn-default">가입완료</button>
            </form>
        </div>
    </div>

</div>

<script type="text/javascript">

    function doSubmit() {
        if(isFormValid()){
            return true;
        }
        return false;
    }

    function isFormValid() {
        if(document.getElementById("customerId").value == ""){
            alert("아이디를 입력해주세요.");
            return false;
        }

        if(document.getElementById("customerPw").value == ""){
            alert("비밀번호를 입력해주세요.");
            return false;
        }

        if(document.getElementById("customerPwCheck").value == ""){
            alert("비밀번호 확인을 입력해주세요.");
            return false;
        }

        if(document.getElementById("customerName").value == ""){
            alert("성명을 입력해주세요.");
            return false;
        }

        if(document.getElementById("tel").value == ""){
            alert("전화번호를 입력해주세요.");
            return false;
        }

        if(document.getElementById("address").value == ""){
            alert("주소를 입력해주세요.");
            return false;
        }

        if(document.getElementById("customerPw").value != document.getElementById("customerPwCheck").value){
            alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
            return false;
        }

        return true;
    }

</script>