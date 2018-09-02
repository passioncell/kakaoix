package com.passioncell.kakaoixshop.domain;

/*
    사용자 정보 도메인 객체
 */

public class MemberDomain {

    private int id;
    private String customerId;
    private String customerPw;
    private String customerName;
    private String tel;
    private String address;

    public MemberDomain(){}

    public MemberDomain(int id, String customerId, String customerPw, String customerName, String tel, String address) {
        this.id = id;
        this.customerId = customerId;
        this.customerPw = customerPw;
        this.customerName = customerName;
        this.tel = tel;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberDomain{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", customerPw='" + customerPw + '\'' +
                ", customerName='" + customerName + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
