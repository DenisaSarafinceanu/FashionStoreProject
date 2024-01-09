package com.example.fashionstore;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public static Connection connectDB(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Fashion_store2", "postgres", "denisa15");
            return connection;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
