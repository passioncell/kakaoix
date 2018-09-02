package com.passioncell.kakaoixshop.domain;

/*
    사용자 로그인 정보 도메인 객체
 */

public class SigninDomain {
    private String customerId;
    private String customerPw;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPw() {
        return customerPw;
    }

    public void setCustomerPw(String customerPw) {
        this.customerPw = customerPw;
    }

    @Override
    public String toString() {
        return "SigninDomain{" +
                "customerId='" + customerId + '\'' +
                ", customerPw='" + customerPw + '\'' +
                '}';
    }
}
