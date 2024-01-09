package com.example.fashionstore;

import java.util.ArrayList;
import java.util.List;

public class DataSingleton2 {
    private static final DataSingleton2 instance = new DataSingleton2();

    private Integer product_id;
    private String name;
    private Float price;
    private String size;
    private String color;
    private String image;
    private List<Product> cartItems;

    public DataSingleton2() {
        cartItems = new ArrayList<>();
    }

    public List<Product> getCartItems() {
        return cartItems;
    }

    public void addToCart(Product item) {
        cartItems.add(item);
    }

    public static DataSingleton2 getInstance(){
        return instance;
    }
    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
