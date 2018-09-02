package com.passioncell.kakaoixshop.domain;

import java.util.Date;

public class OrderDomain {
    private int id;
    private int ea;
    private Date orderAt;
    private int memberId;
    private int productId;

    public OrderDomain(){};

    public OrderDomain(int id, int ea, Date orderAt, int memberId, int productId) {
        this.id = id;
        this.ea = ea;
        this.orderAt = orderAt;
        this.memberId = memberId;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEa() {
        return ea;
    }

    public void setEa(int ea) {
        this.ea = ea;
    }

    public Date getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(Date orderAt) {
        this.orderAt = orderAt;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "OrderDomain{" +
                "id=" + id +
                ", ea=" + ea +
                ", orderAt=" + orderAt +
                ", memberId=" + memberId +
                ", productId=" + productId +
                '}';
    }
}
