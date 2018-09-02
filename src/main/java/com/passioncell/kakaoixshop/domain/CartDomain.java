package com.passioncell.kakaoixshop.domain;

public class CartDomain {
    private int id;
    private int ea;
    private boolean isEndOfTransaction;
    private int fkMemberId;
    private int fkProductId;

    public CartDomain(){};

    public CartDomain(int id, int ea, boolean isEndOfTransaction, int fkMemberId, int fkProductId) {
        this.id = id;
        this.ea = ea;
        this.isEndOfTransaction = isEndOfTransaction;
        this.fkMemberId = fkMemberId;
        this.fkProductId = fkProductId;
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

    public boolean isEndOfTransaction() {
        return isEndOfTransaction;
    }

    public void setEndOfTransaction(boolean endOfTransaction) {
        isEndOfTransaction = endOfTransaction;
    }

    public int getFkMemberId() {
        return fkMemberId;
    }

    public void setFkMemberId(int fkMemberId) {
        this.fkMemberId = fkMemberId;
    }

    public int getFkProductId() {
        return fkProductId;
    }

    public void setFkProductId(int fkProductId) {
        this.fkProductId = fkProductId;
    }

    @Override
    public String toString() {
        return "CartDomain{" +
                "id=" + id +
                ", ea=" + ea +
                ", isEndOfTransaction=" + isEndOfTransaction +
                ", fkMemberId=" + fkMemberId +
                ", fkProductId=" + fkProductId +
                '}';
    }
}
