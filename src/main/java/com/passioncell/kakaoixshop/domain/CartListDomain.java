package com.passioncell.kakaoixshop.domain;

public class CartListDomain {
    private int id;
    private int ea;
    private String title;
    private String category;
    private String model;
    private String madeby;
    private int price;
    private String description;
    private int memberId;
    private int productId;
    private String thumnail;

    public CartListDomain(){};

    public CartListDomain(int id, int ea, String title, String category, String model, String madeby, int price, String description, int memberId, int productId, String thumnail) {
        this.id = id;
        this.ea = ea;
        this.title = title;
        this.category = category;
        this.model = model;
        this.madeby = madeby;
        this.price = price;
        this.description = description;
        this.memberId = memberId;
        this.productId = productId;
        this.thumnail = thumnail;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMadeby() {
        return madeby;
    }

    public void setMadeby(String madeby) {
        this.madeby = madeby;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    @Override
    public String toString() {
        return "CartListDomain{" +
                "id=" + id +
                ", ea=" + ea +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", model='" + model + '\'' +
                ", madeby='" + madeby + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", memberId=" + memberId +
                ", productId=" + productId +
                ", thumnail='" + thumnail + '\'' +
                '}';
    }
}
