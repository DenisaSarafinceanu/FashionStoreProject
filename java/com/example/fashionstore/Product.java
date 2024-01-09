package com.example.fashionstore;

import java.util.Locale;

public class Product {
    private Integer product_id;
    private String product_name;
    private String product_size;
    private String product_color;
    private Integer product_quantity;
    private String product_price;
    private String product_image;
    private Integer category_id;

    public Product(Integer product_id, String product_name, String product_size, String product_price, String product_color, Integer product_quantity, String product_image) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_size = product_size;
        this.product_price = product_price;
        this.product_color = product_color;
        this.product_quantity = product_quantity;
        this.product_image = product_image;
    }

    public Product(Integer product_id, String product_name, String product_size, String product_color, Integer product_quantity, String product_price, String product_image, Integer category_id) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_size = product_size;
        this.product_color = product_color;
        this.product_quantity = product_quantity;
        this.product_price = product_price;
        this.product_image = product_image;
        this.category_id = category_id;
    }

    public Product(String product_name, String product_size, String product_color, String product_price, String product_image) {
        this.product_name = product_name;
        this.product_size = product_size;
        this.product_color = product_color;
        this.product_price = product_price;
        this.product_image = product_image;
    }

    public Product(String product_name, String product_price, String product_image, String product_size) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_image = product_image;
        this.product_size = product_size;
    }

    public Product(String product_name, String product_price, String product_image) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_image = product_image;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Integer product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

}
