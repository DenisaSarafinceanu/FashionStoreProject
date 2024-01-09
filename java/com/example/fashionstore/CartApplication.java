package com.example.fashionstore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CartApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Cart.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load());
        stage.setFullScreen(true);
        stage.setTitle("Cart");
        stage.setScene(scene);
        stage.show();
    }

}
