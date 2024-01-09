package com.example.fashionstore;

public class DataSingleton {
    private static final DataSingleton instance = new DataSingleton();

    private String username;
    private Integer user_id;

    public DataSingleton(){

    }
    public static DataSingleton getInstance(){
        return instance;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
