package com.passioncell.kakaoixshop.domain;

import java.util.List;

public class ProductDomain {
    private int id;
    private String title;
    private String category;
    private String model;
    private String madeby;
    private int price;
    private String description;
    private List<String> imageUrl;

    public ProductDomain(){};

    public ProductDomain(int id, String title, String category, String model, String madeby, int price, String description, List<String> imageUrl) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.model = model;
        this.madeby = madeby;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ProductDomain{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", madeby='" + madeby + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", imageUrl=" + imageUrl +
                '}';
    }
}
