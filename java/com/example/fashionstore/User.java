package com.example.fashionstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    private Integer user_id;
    private String first_name;
    private String last_name;
    private String email_address;
    private String phone_number;
    private String username;
    private String password;

    public User(){

    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String first_name, String last_name, String email_address, String phone_number, String username, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
    }

    public void getUser(String username, String password){

        String selectData = "SELECT username, \"password\" FROM \"user\" WHERE " + "username = ? AND \"password\" = ?";
        try (Connection connect = Database.connectDB()) {
            if (connect != null) {
                try (PreparedStatement prepare = connect.prepareStatement(selectData)) {
                    prepare.setString(1, username);
                    prepare.setString(2, password);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
