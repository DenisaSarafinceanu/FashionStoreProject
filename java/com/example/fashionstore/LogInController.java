package com.example.fashionstore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Optional;
import java.util.ResourceBundle;

public class LogInController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private Button articles;

    @FXML
    private Button button_login;

    @FXML
    private Button button_logout;

    @FXML
    private Label label_login;

    @FXML
    private Button log_in;

    @FXML
    private Button sign_in;

    @FXML
    private TextField username_text;

    @FXML
    private TextField password_text;

    @FXML
    private Label label2;

    @FXML
    private TextField confirm_password;

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
    DataSingleton data = DataSingleton.getInstance();
    public void login(){
        AlertMessages alert = new AlertMessages();

        if(username_text.getText().isEmpty() || password_text.getText().isEmpty()){
            alert.errorMessage("Introduce Username/Password.");
        }
         else {
             String selectData = "SELECT username, \"password\" FROM \"user\" WHERE " + "username = ? AND \"password\" = ?";
            try (Connection connect = Database.connectDB()) {
                if (connect != null) {
                    try (PreparedStatement prepare = connect.prepareStatement(selectData)) {
                        prepare.setString(1, username_text.getText());
                        prepare.setString(2, password_text.getText());

                        data.setUsername(username_text.getText());

                        try (ResultSet result = prepare.executeQuery()) {
                            if (result.next()) {
                                alert.successMessage("Login Successfuly!");
                                String user = username_text.getText();
                                user = user.substring(0, 1).toUpperCase() + user.substring(1);
                                label_login.setText("Welcome " + user);



                            } else {
                                alert.errorMessage("Incorrect Username/Password.");
                            }
                        }
                    }
                } else {
                    alert.errorMessage("Connection to the database failed.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private Button save_button;

    public void set(){
        confirm_password.setVisible(true);
        save_button.setVisible(true);
    }

    public void forgotPassword(){

        AlertMessages alert = new AlertMessages();

        String checkData = "SELECT username, password FROM \"user\" WHERE username = ?";
        connect = Database.connectDB();

        try {
            prepare = connect.prepareStatement(checkData);
            prepare.setString(1, username_text.getText());
            result = prepare.executeQuery();

            if (result.next()) {
                if (!confirm_password.getText().equals(password_text.getText())) {
                    alert.errorMessage("The passwords do not match!");
                } else {
                    String updateData = "UPDATE \"user\" SET password = ? WHERE username = ?";
                    try (PreparedStatement updateStatement = connect.prepareStatement(updateData)) {
                        updateStatement.setString(1, password_text.getText());
                        updateStatement.setString(2, username_text.getText());
                        updateStatement.executeUpdate();
                        alert.successMessage("Password updated successfully!");
                    } catch (SQLException e) {
                        e.printStackTrace();
                        // Handle SQL exceptions or alert user
                    }
                }
            } else {
                alert.errorMessage("The username is incorrect!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (prepare != null) {
                    prepare.close();
                }
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

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

    public String getUsername(){
        if(username_text.getText()!=null)
            return username_text.getText();
        return null;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
