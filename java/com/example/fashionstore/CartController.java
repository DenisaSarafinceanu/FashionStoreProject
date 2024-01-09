package com.example.fashionstore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.skin.LabeledSkinBase;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.security.auth.callback.LanguageCallback;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.time.LocalDateTime;

public class CartController implements Initializable {

    DataSingleton data = DataSingleton.getInstance();

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private ImageView image5;

    @FXML
    private ImageView image6;

    @FXML
    private ImageView image7;

    @FXML
    private ImageView image8;

    @FXML
    private ImageView image9;

    @FXML
    private Label username_label;

    @FXML
    private Label text1;
    @FXML
    private Label price1;
    @FXML
    private Label size1;
    @FXML
    private Label color1;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void back(ActionEvent event) throws IOException {
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

    DataSingleton2 data1 = DataSingleton2.getInstance();
    @FXML
    private VBox labelContainer;
    @FXML
    private Label price_label;

    private PreparedStatement prepare;
    private PreparedStatement prepare1;
    private ResultSet result;
    private Statement statement;
    private Connection connect;

    Float total_price = 0.0f;

    Integer product_id;

    public void getUserId(){
        String selectData = "SELECT user_id FROM \"user\" WHERE username = ?";
        try (Connection connect = Database.connectDB();
             PreparedStatement prepare = connect.prepareStatement(selectData)) {

            // Set parameter in the PreparedStatement
            prepare.setString(1, data.getUsername());

            try (ResultSet resultSet = prepare.executeQuery()) {
                // Check if there are results
                if (resultSet.next()) {
                    // Retrieve data from the ResultSet
                    Integer userId = resultSet.getInt("user_id");
                    data.setUser_id(userId);
                } else {
                    // Handle case where no user with that username is found
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Label name_label;
    @FXML
    private Label email_label;
    @FXML
    private Label phone_label;


    public void getItems() {
        List<Product> cartItems = DataSingleton2.getInstance().getCartItems();

        try {
            for (Product item : cartItems) {
                Label nameLabel = new Label(item.getProduct_name());
                String price = item.getProduct_price(); // Assuming getProduct_price() returns a string
                Label priceLabel = new Label(price);
                Label sizeLabel = new Label(item.getProduct_size());
                Label colorLabel = new Label(item.getProduct_color());

                // ... Other labels and components

                // Load the delete image
                ImageView delete = new ImageView(new Image("file:C:/Users/saraf/Desktop/FashionStore/src/main/resources/garbage.png"));
                delete.setFitWidth(20);
                delete.setFitHeight(20);

                // Load the product image
                ImageView imageView = new ImageView(new Image("file:" + item.getProduct_image()));
                imageView.setFitHeight(100);
                imageView.setFitWidth(100);

                VBox itemContainer = new VBox();
                itemContainer.setSpacing(10);

                HBox imageAndTextContainer = new HBox();
                imageAndTextContainer.setSpacing(20);

                VBox textContainer = new VBox();
                textContainer.getChildren().addAll(nameLabel, priceLabel, sizeLabel, colorLabel, delete);
                imageAndTextContainer.getChildren().addAll(imageView, textContainer);
                imageAndTextContainer.setSpacing(20);
                itemContainer.getChildren().add(imageAndTextContainer);

                labelContainer.getChildren().add(itemContainer);

                String numberText = priceLabel.getText().substring(1, priceLabel.getText().length() - 1);
                total_price += Float.parseFloat(numberText);


                delete.setOnMouseClicked(event -> {
                    // Handle delete click
                    String name = item.getProduct_name(); // Assuming you have a method to get product ID

                    // Delete item from the database
                    deleteItemFromDatabase(name);

                    // Remove corresponding labels from UI
                    removeLabels(nameLabel, priceLabel, sizeLabel, colorLabel, delete, imageView);

                    /*
                    Connection connect = null;


                    try {
                        // Establish the database connection
                        connect = Database.connectDB();

                        // Check if the connection is successfully established
                        if (connect != null) {
                            String insertData = "UPDATE \"order\" SET total_price = total_price - ?";
                            try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                prepare.setFloat(1, Float.parseFloat(numberText));
                                prepare.executeUpdate();
                            } catch (SQLException e) {
                                e.printStackTrace();
                                // Handle SQL exceptions or alert user
                            }
                        } else {
                            // Handle the case where the connection is null
                            System.out.println("Failed to establish database connection.");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // Close the connection in a finally block to ensure it's always closed
                        try {
                            if (connect != null) {
                                connect.close();
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }*/
                });

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Connection connect = null;


        try {
            // Establish the database connection
            connect = Database.connectDB();

            // Check if the connection is successfully established
            if (connect != null) {
                String insertData = "INSERT INTO \"order\" (date, user_id, total_price) VALUES (?, ?, ?)";
                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                    LocalDateTime currentDate = LocalDateTime.now();
                    java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                    prepare.setTimestamp(1, timestamp);
                    getUserId();
                    prepare.setInt(2, data.getUser_id());
                    prepare.setFloat(3, total_price);
                    prepare.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Handle SQL exceptions or alert user
                }
            } else {
                // Handle the case where the connection is null
                System.out.println("Failed to establish database connection.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the connection in a finally block to ensure it's always closed
            try {
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        String sql = "SELECT first_name, last_name, email_address, phone_number FROM \"user\" WHERE " + "username = ?";
        try (Connection connection = Database.connectDB()) {
            if (connection != null) {
                try (PreparedStatement prepare1 = connection.prepareStatement(sql)) {
                    int spaceIndex = username_label.getText().indexOf(" ");
                    String desiredWord = username_label.getText().substring(spaceIndex + 1);
                    prepare1.setString(1, desiredWord);

                    try (ResultSet result = prepare1.executeQuery()) {
                        if (result.next()) {
                            String first_name = result.getString("first_name");
                            String last_name = result.getString("last_name");
                            String email = result.getString("email_address");
                            String phone = result.getString("phone_number");

                            name_label.setText("Name: " + first_name + last_name);
                            email_label.setText("Email: " + email);
                            phone_label.setText("Phone number: " + phone);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                price_label.setText("Total price: " + String.valueOf(total_price));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void removeLabels(Node... nodesToRemove) {
        // Remove provided nodes (labels) from their parent container
        for (Node node : nodesToRemove) {
            if (node != null) {
                ((Pane) node.getParent()).getChildren().remove(node);
            }
        }
    }

    public void deleteItemFromDatabase(String name){
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationAlert.setTitle("Confirmation Dialog");
        confirmationAlert.setHeaderText(null);
        confirmationAlert.setContentText("Are you sure you want to delete this order?");

        // Show the confirmation dialog and wait for user response
        confirmationAlert.showAndWait().ifPresent(response -> {
                    if (response == ButtonType.OK) {

                        Connection connect = Database.connectDB();

                        if (connect != null) {
                            String deleteQuery = "DELETE FROM order_items WHERE product_name = ?";

                            try (PreparedStatement prepare = connect.prepareStatement(deleteQuery)) {
                                prepare.setString(1, name);
                                prepare.executeUpdate();

                            } catch (SQLException e) {
                                e.printStackTrace();
                                // Handle SQL exceptions or alert the user about deletion failure
                            } finally {
                                try {
                                    connect.close();
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            }
                        } else {
                            System.out.println("Failed to establish database connection.");
                        }
                    }
    });
    }

    /*
    public void delete(){
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationAlert.setTitle("Confirmation Dialog");
        confirmationAlert.setHeaderText(null);
        confirmationAlert.setContentText("Are you sure you want to delete this order?");

        // Show the confirmation dialog and wait for user response
        confirmationAlert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {

                for(String items : name){
                    if()
                }
                Connection connect = Database.connectDB();

                if (connect != null) {
                    String deleteQuery = "DELETE FROM order_items WHERE product_name = ?";

                    try (PreparedStatement prepare = connect.prepareStatement(deleteQuery)) {
                        prepare.setString(1, nameLabel);
                        prepare.executeUpdate();

                    } catch (SQLException e) {
                        e.printStackTrace();
                        // Handle SQL exceptions or alert the user about deletion failure
                    } finally {
                        try {
                            connect.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    System.out.println("Failed to establish database connection.");
                }
            }
        }*/



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (data.getUsername() != null)
            username_label.setText("Username: " + data.getUsername());
        else
            username_label.setText("Username:");
        getItems();
        if(username_label.getText().equals("Username:")) {
            labelContainer.getChildren().clear();
        }

    }

}
