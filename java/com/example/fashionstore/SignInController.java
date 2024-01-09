package com.example.fashionstore;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.URL;
import java.sql.*;
import java.util.*;

public class SignInController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private Button articles;

    @FXML
    private Button button_create;

    @FXML
    private TextField email;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private Button log_in;

    @FXML
    private TextField password1;

    @FXML
    private TextField phone;

    @FXML
    private Button sign_in;

    @FXML
    private TextField userName;
    
    private PreparedStatement prepare;
    private ResultSet result;
    private Statement statement;
    private Connection connect;

    public void switchToArticles(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource("Item.fxml"));
            this.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            this.scene = new Scene(root);
            this.stage.setScene(this.scene);
            this.stage.setFullScreen(true);
            this.stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToSignIn(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource("SignIn.fxml"));
            this.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            this.scene = new Scene(root);
            this.stage.setScene(this.scene);
            //this.stage.setFullScreen(true);
            this.stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToLogIn(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource("LogIn.fxml"));
            this.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            this.scene = new Scene(root);
            this.stage.setScene(this.scene);
            //this.stage.setFullScreen(true);
            this.stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void signup(){
        AlertMessages alert = new AlertMessages();

        if(email.getText().isEmpty() || firstName.getText().isEmpty() || lastName.getText().isEmpty() || userName.getText().isEmpty() || password1.getText().isEmpty() || phone.getText().isEmpty()){
            alert.errorMessage("All fields are necessary to be filled!");
        }
        else
            if(password1.getText().length() < 8)
                alert.errorMessage("Invalid password, at least 8 characters needed!");
            else {
                String checkUsername = "SELECT * FROM \"user\" WHERE username = '" + userName.getText() + "'";
                try (Connection connect = Database.connectDB();
                     Statement statement = connect.createStatement();
                     ResultSet result = statement.executeQuery(checkUsername)){
                if (result.next()) {
                            alert.errorMessage(userName.getText() + " is already taken!");
                        } else {
                            String insertData = "INSERT INTO \"user\" " + "(first_name, last_name, email_address, phone_number, username, password) " + "VALUES(?, ?, ?, ?, ?, ?)";
                            prepare = connect.prepareStatement(insertData);
                            prepare.setString(1, firstName.getText());
                            prepare.setString(2, lastName.getText());
                            prepare.setString(3, email.getText());
                            prepare.setString(4, phone.getText());
                            prepare.setString(5, userName.getText());
                            prepare.setString(6, password1.getText());
                            prepare.executeUpdate();

                            alert.successMessage("Registered Succesfully!");

                            List<User> userList = new ArrayList<>();
                            userList.add(new User(firstName.getText(), lastName.getText(), email.getText(), phone.getText(), userName.getText(), password1.getText()));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
    }

    @FXML
    private Button button_logout;

    private Alert alert;
    public void logout(){
        try{
            alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to logout?");
            Optional<ButtonType> option = alert.showAndWait();

            if(option.get().equals(ButtonType.OK)){
                button_logout.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

                Stage stage = new Stage();
                Scene scene = new Scene(root);

                stage.setTitle("Fashion Store");
                stage.setScene(scene);
                stage.show();

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }


}