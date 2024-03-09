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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.URL;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.*;

public class ItemController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button accesories_women;

    @FXML
    private Button articles;

    @FXML
    private Button cart_button;

    @FXML
    private Button cart_button1;

    @FXML
    private Button cart_button10;

    @FXML
    private Button cart_button11;

    @FXML
    private Button cart_button2;

    @FXML
    private Button cart_button3;

    @FXML
    private Button cart_button4;

    @FXML
    private Button cart_button5;

    @FXML
    private Button cart_button6;

    @FXML
    private Button cart_button7;

    @FXML
    private Button cart_button8;

    @FXML
    private Button cart_button9;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check10;

    @FXML
    private CheckBox check11;

    @FXML
    private CheckBox check12;

    @FXML
    private CheckBox check13;

    @FXML
    private CheckBox check14;

    @FXML
    private CheckBox check15;

    @FXML
    private CheckBox check16;

    @FXML
    private CheckBox check17;

    @FXML
    private CheckBox check18;

    @FXML
    private CheckBox check19;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check20;

    @FXML
    private CheckBox check21;

    @FXML
    private CheckBox check22;

    @FXML
    private CheckBox check23;

    @FXML
    private CheckBox check24;

    @FXML
    private CheckBox check25;

    @FXML
    private CheckBox check26;

    @FXML
    private CheckBox check27;

    @FXML
    private CheckBox check28;

    @FXML
    private CheckBox check29;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check30;

    @FXML
    private CheckBox check31;

    @FXML
    private CheckBox check32;

    @FXML
    private CheckBox check33;

    @FXML
    private CheckBox check34;

    @FXML
    private CheckBox check35;

    @FXML
    private CheckBox check36;

    @FXML
    private CheckBox check37;

    @FXML
    private CheckBox check38;

    @FXML
    private CheckBox check39;

    @FXML
    private CheckBox check4;

    @FXML
    private CheckBox check40;

    @FXML
    private CheckBox check41;

    @FXML
    private CheckBox check42;

    @FXML
    private CheckBox check43;

    @FXML
    private CheckBox check44;

    @FXML
    private CheckBox check5;

    @FXML
    private CheckBox check6;

    @FXML
    private CheckBox check7;

    @FXML
    private CheckBox check8;

    @FXML
    private CheckBox check9;

    @FXML
    private Label description_button1;

    @FXML
    private Label description_button10;

    @FXML
    private Label description_button11;

    @FXML
    private Label description_button2;

    @FXML
    private Label description_button3;

    @FXML
    private Label description_button4;

    @FXML
    private Label description_button5;

    @FXML
    private Label description_button6;

    @FXML
    private Label description_button7;

    @FXML
    private Label description_button8;

    @FXML
    private Label description_button9;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image10;

    @FXML
    private ImageView image11;

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
    private Button jacket_women;

    @FXML
    private Label label;

    @FXML
    private Button log_in;

    @FXML
    private Button logout;

    @FXML
    private Label price_button1;

    @FXML
    private Label price_button10;

    @FXML
    private Label price_button11;

    @FXML
    private Label price_button2;

    @FXML
    private Label price_button3;

    @FXML
    private Label price_button4;

    @FXML
    private Label price_button5;

    @FXML
    private Label price_button6;

    @FXML
    private Label price_button7;

    @FXML
    private Label price_button8;

    @FXML
    private Label price_button9;

    @FXML
    private Button shoes_women;

    @FXML
    private Button sign_in;

    @FXML
    private Button sweater_women;

    @FXML
    private Button sweatshirt_women;

    @FXML
    private Label text_button1;

    @FXML
    private Label text_button10;

    @FXML
    private Label text_button11;

    @FXML
    private Label text_button2;

    @FXML
    private Label text_button3;

    @FXML
    private Label text_button4;

    @FXML
    private Label text_button5;

    @FXML
    private Label text_button6;

    @FXML
    private Label text_button7;

    @FXML
    private Label text_button8;

    @FXML
    private Label text_button9;

    @FXML
    private Button trousers_women;

    @FXML
    private Button tshirt_women;

    @FXML
    private Label welcome;



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

    public void gotoCart(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource("Cart.fxml"));
            this.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            this.scene = new Scene(root);
            this.stage.setScene(this.scene);
            //this.stage.setFullScreen(true);
            this.stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private Alert alert;
    DataSingleton data = DataSingleton.getInstance();
    public void logout(){
        try{
            alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to logout?");
            Optional<ButtonType> option = alert.showAndWait();

            if(option.get().equals(ButtonType.OK)){
                data.setUsername(null);
                welcome.setText("Welcome");
                ActionEvent event = new ActionEvent();
                switchToArticles(event);
                //logout.getScene().getWindow().hide();
                //Parent root = FXMLLoader.load(getClass().getResource("Item.fxml"));

                //Stage stage = new Stage();
                //Scene scene = new Scene(root);

                //stage.setTitle("Fashion Store");
                //stage.setScene(scene);
                //stage.setFullScreen(true);
                //stage.show();
                //welcome.setText("Welcome");
                //welcome.setVisible(false);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private Product prodData;
    private Image image;

    private List<Jacket> jacketList = new ArrayList<>();
  public void method_jacket1() {
      label.setText("Jackets");
      cart_button1.setVisible(true);
      cart_button2.setVisible(true);
      cart_button3.setVisible(true);
      cart_button4.setVisible(true);
      cart_button5.setVisible(true);
      cart_button6.setVisible(true);
      cart_button7.setVisible(true);
      cart_button8.setVisible(true);
      cart_button9.setVisible(true);
      cart_button10.setVisible(true);
      cart_button11.setVisible(true);
      String sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 57"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket1(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------
      sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 58"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket2(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------
      sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 59"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket3(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------

      sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 60"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket4(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------
      sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 61"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket5(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------

      sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 62"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket6(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------

      sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 63"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket7(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------

      sql = "SELECT name, image, price, size FROM jacket WHERE product_id =64"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket8(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------
      sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 65"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket9(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------

      sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 66"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket10(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
      //------------------------------------
      sql = "SELECT name, image, price, size FROM jacket WHERE product_id = 67"; // Query to fetch required columns
      try (
              Connection connection = Database.connectDB();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql)) {

          // Iterate through the result set and populate productList with fetched data
          while (resultSet.next()) {
              String image = resultSet.getString("image");
              String price = resultSet.getString("price");
              String size = resultSet.getString("size");
              String name = resultSet.getString("name");

              // Create a Product object and add it to the list
              jacketList.add(new Jacket(name, price, image, size));
          }

          // Now productList contains the data retrieved from the database
          // You can use this data to update your FXML elements
          setData_jacket11(jacketList);
      } catch (SQLException e) {
          e.printStackTrace();
      }
  }

    public void setData_jacket1(List<Jacket> jacketList){
      try{
              image1.setVisible(true);
              text_button1.setVisible(true);
              price_button1.setVisible(true);
              this.prodData = jacketList.get(0);
              text_button1.setText(prodData.getProduct_name());
              price_button1.setText(prodData.getProduct_price() + "$");
              InputStream stream = new FileInputStream(prodData.getProduct_image());
              Image image = new Image(stream);
              //Creating the image view
              image1.setImage(image);

              check1.setVisible(false);
              check2.setVisible(false);
              check3.setVisible(false);
              check4.setVisible(false);
              String size = prodData.getProduct_size();
              String[] sizeArray = size.split(", ");
              List<String> sizesList = new ArrayList<>();
              sizesList.addAll(Arrays.asList(sizeArray));
              if(sizesList.size() == 1){
                  check1.setVisible(true);
                  check1.setText(sizesList.get(0));
              }
              if(sizesList.size() == 2) {
                  check1.setVisible(true);
                  check1.setText(sizesList.get(0));
                  check2.setVisible(true);
                  check2.setText(sizesList.get(1));
              }
              if(sizesList.size() == 3){
                  check1.setVisible(true);
                  check1.setText(sizesList.get(0));
                  check2.setVisible(true);
                  check2.setText(sizesList.get(1));
                  check3.setVisible(true);
                  check3.setText(sizesList.get(2));
              }
              if(sizesList.size() == 4){
                  check1.setVisible(true);
                  check1.setText(sizesList.get(0));
                  check2.setVisible(true);
                  check2.setText(sizesList.get(1));
                  check3.setVisible(true);
                  check3.setText(sizesList.get(2));
                  check4.setVisible(true);
                  check4.setText(sizesList.get(3));
                  }


      }catch(Exception e){
          e.printStackTrace();
      }
    }

    public void setData_jacket2(List<Jacket> jacketList){
        try{
            image2.setVisible(true);
            text_button2.setVisible(true);
            price_button2.setVisible(true);
            this.prodData = jacketList.get(1);
            text_button2.setText(prodData.getProduct_name());
            price_button2.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image2.setImage(image);

            check5.setVisible(false);
            check6.setVisible(false);
            check7.setVisible(false);
            check8.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
                check8.setVisible(true);
                check8.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void setData_jacket3(List<Jacket> jacketList){
        try{
            image3.setVisible(true);
            text_button3.setVisible(true);
            price_button3.setVisible(true);
            this.prodData = jacketList.get(2);
            text_button3.setText(prodData.getProduct_name());
            price_button3.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image3.setImage(image);

            check9.setVisible(false);
            check10.setVisible(false);
            check11.setVisible(false);
            check12.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
                check12.setVisible(true);
                check12.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_jacket4(List<Jacket> jacketList){
        try{
            image4.setVisible(true);
            text_button4.setVisible(true);
            price_button4.setVisible(true);
            this.prodData = jacketList.get(3);
            text_button4.setText(prodData.getProduct_name());
            price_button4.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image4.setImage(image);

            check13.setVisible(false);
            check14.setVisible(false);
            check15.setVisible(false);
            check16.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
                check16.setVisible(true);
                check16.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_jacket5(List<Jacket> jacketList){
        try{
            image5.setVisible(true);
            text_button5.setVisible(true);
            price_button5.setVisible(true);
            this.prodData = jacketList.get(4);
            text_button5.setText(prodData.getProduct_name());
            price_button5.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image5.setImage(image);

            check17.setVisible(false);
            check18.setVisible(false);
            check19.setVisible(false);
            check20.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
                check20.setVisible(true);
                check20.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_jacket6(List<Jacket> jacketList){
        try{
            image6.setVisible(true);
            text_button6.setVisible(true);
            price_button6.setVisible(true);
            this.prodData = jacketList.get(5);
            text_button6.setText(prodData.getProduct_name());
            price_button6.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image6.setImage(image);

            check21.setVisible(false);
            check22.setVisible(false);
            check23.setVisible(false);
            check24.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
                check24.setVisible(true);
                check24.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_jacket7(List<Jacket> jacketList){
        try{
            image7.setVisible(true);
            text_button7.setVisible(true);
            price_button7.setVisible(true);
            this.prodData = jacketList.get(6);
            text_button7.setText(prodData.getProduct_name());
            price_button7.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image7.setImage(image);

            check25.setVisible(false);
            check26.setVisible(false);
            check27.setVisible(false);
            check28.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
                check28.setVisible(true);
                check28.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_jacket8(List<Jacket> jacketList){
        try{
            image8.setVisible(true);
            text_button8.setVisible(true);
            price_button8.setVisible(true);
            this.prodData = jacketList.get(7);
            text_button8.setText(prodData.getProduct_name());
            price_button8.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image8.setImage(image);

            check29.setVisible(false);
            check30.setVisible(false);
            check31.setVisible(false);
            check32.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
                check32.setVisible(true);
                check32.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_jacket9(List<Jacket> jacketList){
        try{
            image9.setVisible(true);
            text_button9.setVisible(true);
            price_button9.setVisible(true);
            this.prodData = jacketList.get(8);
            text_button9.setText(prodData.getProduct_name());
            price_button9.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image9.setImage(image);

            check33.setVisible(false);
            check34.setVisible(false);
            check35.setVisible(false);
            check36.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
                check36.setVisible(true);
                check36.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_jacket10(List<Jacket> jacketList){
        try{
            image10.setVisible(true);
            text_button10.setVisible(true);
            price_button10.setVisible(true);
            this.prodData = jacketList.get(9);
            text_button10.setText(prodData.getProduct_name());
            price_button10.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image10.setImage(image);

            check37.setVisible(false);
            check38.setVisible(false);
            check39.setVisible(false);
            check40.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
                check40.setVisible(true);
                check40.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_jacket11(List<Jacket> jacketList){
        try{
            image11.setVisible(true);
            text_button11.setVisible(true);
            price_button11.setVisible(true);
            this.prodData = jacketList.get(10);
            text_button11.setText(prodData.getProduct_name());
            price_button11.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image11.setImage(image);

            check41.setVisible(false);
            check42.setVisible(false);
            check43.setVisible(false);
            check44.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
                check44.setVisible(true);
                check44.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }



    private List<Sweatshirt> sweatshirtList = new ArrayList<>();
    public void method_sweatshirt1() {
        label.setText("Sweatshirts");
        cart_button1.setVisible(true);
        cart_button2.setVisible(true);
        cart_button3.setVisible(true);
        cart_button4.setVisible(true);
        cart_button5.setVisible(true);
        cart_button6.setVisible(true);
        cart_button7.setVisible(true);
        cart_button8.setVisible(true);
        cart_button9.setVisible(true);
        cart_button10.setVisible(true);
        cart_button11.setVisible(true);

        String sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 68"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt1(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 69"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt2(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 70"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt3(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 71"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt4(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------
        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 72"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt5(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 73"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt6(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id =74"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt7(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 75"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt8(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------
        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 76"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt9(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 77"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt10(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------
        sql = "SELECT name, image, price, size FROM sweatshirt WHERE product_id = 78"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweatshirtList.add(new Sweatshirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweatshirt11(sweatshirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt1(List<Sweatshirt> sweatshirtList){
        try{
            image1.setVisible(true);
            text_button1.setVisible(true);
            price_button1.setVisible(true);
            this.prodData = sweatshirtList.get(0);
            text_button1.setText(prodData.getProduct_name());
            price_button1.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image1.setImage(image);

            check1.setVisible(false);
            check2.setVisible(false);
            check3.setVisible(false);
            check4.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
                check4.setVisible(true);
                check4.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt2(List<Sweatshirt> sweatshirtList){
        try{
            image2.setVisible(true);
            text_button2.setVisible(true);
            price_button2.setVisible(true);
            this.prodData = sweatshirtList.get(1);
            text_button2.setText(prodData.getProduct_name());
            price_button2.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image2.setImage(image);

            check5.setVisible(false);
            check6.setVisible(false);
            check7.setVisible(false);
            check8.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
                check8.setVisible(true);
                check8.setText(sizesList.get(3));
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void setData_sweatshirt3(List<Sweatshirt> sweatshirtList){
        try{
            image3.setVisible(true);
            text_button3.setVisible(true);
            price_button3.setVisible(true);
            this.prodData = sweatshirtList.get(2);
            text_button3.setText(prodData.getProduct_name());
            price_button3.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image3.setImage(image);

            check9.setVisible(false);
            check10.setVisible(false);
            check11.setVisible(false);
            check12.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
                check12.setVisible(true);
                check12.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt4(List<Sweatshirt> sweatshirtList){
        try{
            image4.setVisible(true);
            text_button4.setVisible(true);
            price_button4.setVisible(true);
            this.prodData = sweatshirtList.get(3);
            text_button4.setText(prodData.getProduct_name());
            price_button4.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image4.setImage(image);

            check13.setVisible(false);
            check14.setVisible(false);
            check15.setVisible(false);
            check16.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
                check16.setVisible(true);
                check16.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt5(List<Sweatshirt> sweatshirtList){
        try{
            image5.setVisible(true);
            text_button5.setVisible(true);
            price_button5.setVisible(true);
            this.prodData = sweatshirtList.get(4);
            text_button5.setText(prodData.getProduct_name());
            price_button5.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image5.setImage(image);

            check17.setVisible(false);
            check18.setVisible(false);
            check19.setVisible(false);
            check20.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
                check20.setVisible(true);
                check20.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt6(List<Sweatshirt> sweatshirtList){
        try{
            image6.setVisible(true);
            text_button6.setVisible(true);
            price_button6.setVisible(true);
            this.prodData = sweatshirtList.get(5);
            text_button6.setText(prodData.getProduct_name());
            price_button6.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image6.setImage(image);

            check21.setVisible(false);
            check22.setVisible(false);
            check23.setVisible(false);
            check24.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
                check24.setVisible(true);
                check24.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt7(List<Sweatshirt> sweatshirtList){
        try{
            image7.setVisible(true);
            text_button7.setVisible(true);
            price_button7.setVisible(true);
            this.prodData = sweatshirtList.get(6);
            text_button7.setText(prodData.getProduct_name());
            price_button7.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image7.setImage(image);

            check25.setVisible(false);
            check26.setVisible(false);
            check27.setVisible(false);
            check28.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
                check28.setVisible(true);
                check28.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt8(List<Sweatshirt> sweatshirtList){
        try{
            image8.setVisible(true);
            text_button8.setVisible(true);
            price_button8.setVisible(true);
            this.prodData = sweatshirtList.get(7);
            text_button8.setText(prodData.getProduct_name());
            price_button8.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image8.setImage(image);

            check29.setVisible(false);
            check30.setVisible(false);
            check31.setVisible(false);
            check32.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
                check32.setVisible(true);
                check32.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt9(List<Sweatshirt> sweatshirtList){
        try{
            image9.setVisible(true);
            text_button9.setVisible(true);
            price_button9.setVisible(true);
            this.prodData = sweatshirtList.get(8);
            text_button9.setText(prodData.getProduct_name());
            price_button9.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image9.setImage(image);

            check33.setVisible(false);
            check34.setVisible(false);
            check35.setVisible(false);
            check36.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
                check36.setVisible(true);
                check36.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt10(List<Sweatshirt> sweatshirtList){
        try{
            image10.setVisible(true);
            text_button10.setVisible(true);
            price_button10.setVisible(true);
            this.prodData = sweatshirtList.get(9);
            text_button10.setText(prodData.getProduct_name());
            price_button10.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image10.setImage(image);

            check37.setVisible(false);
            check38.setVisible(false);
            check39.setVisible(false);
            check40.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
                check40.setVisible(true);
                check40.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweatshirt11(List<Sweatshirt> sweatshirtList){
        try{
            image11.setVisible(true);
            text_button11.setVisible(true);
            price_button11.setVisible(true);
            this.prodData = sweatshirtList.get(10);
            text_button11.setText(prodData.getProduct_name());
            price_button11.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image11.setImage(image);

            check41.setVisible(false);
            check42.setVisible(false);
            check43.setVisible(false);
            check44.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
                check44.setVisible(true);
                check44.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    private List<Sweater> sweaterList = new ArrayList<>();
    public void method_sweater1() {
        label.setText("Sweaters");
        cart_button1.setVisible(true);
        cart_button2.setVisible(true);
        cart_button3.setVisible(true);
        cart_button4.setVisible(true);
        cart_button5.setVisible(true);
        cart_button6.setVisible(true);
        cart_button7.setVisible(true);
        cart_button8.setVisible(true);
        cart_button9.setVisible(true);
        cart_button10.setVisible(true);
        cart_button11.setVisible(true);

        String sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 79"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater1(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 80"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater2(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 81"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater3(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 82"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater4(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 83"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater5(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 84"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater6(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 85"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater7(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 86"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater8(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 87"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater9(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 88"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater10(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM sweater WHERE product_id = 89"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                sweaterList.add(new Sweater(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_sweater11(sweaterList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setData_sweater1(List<Sweater> sweaterList){
        try{
            image1.setVisible(true);
            text_button1.setVisible(true);
            price_button1.setVisible(true);
            this.prodData = sweaterList.get(0);
            text_button1.setText(prodData.getProduct_name());
            price_button1.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image1.setImage(image);

            check1.setVisible(false);
            check2.setVisible(false);
            check3.setVisible(false);
            check4.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
                check4.setVisible(true);
                check4.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweater2(List<Sweater> sweaterList){
        try{
            image2.setVisible(true);
            text_button2.setVisible(true);
            price_button2.setVisible(true);
            this.prodData = sweaterList.get(1);
            text_button2.setText(prodData.getProduct_name());
            price_button2.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image2.setImage(image);

            check5.setVisible(false);
            check6.setVisible(false);
            check7.setVisible(false);
            check8.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
                check8.setVisible(true);
                check8.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void setData_sweater3(List<Sweater> sweaterList){
        try{
            image3.setVisible(true);
            text_button3.setVisible(true);
            price_button3.setVisible(true);
            this.prodData = sweaterList.get(2);
            text_button3.setText(prodData.getProduct_name());
            price_button3.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image3.setImage(image);

            check9.setVisible(false);
            check10.setVisible(false);
            check11.setVisible(false);
            check12.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
                check12.setVisible(true);
                check12.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweater4(List<Sweater> sweaterList){
        try{
            image4.setVisible(true);
            text_button4.setVisible(true);
            price_button4.setVisible(true);
            this.prodData = sweaterList.get(3);
            text_button4.setText(prodData.getProduct_name());
            price_button4.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image4.setImage(image);

            check13.setVisible(false);
            check14.setVisible(false);
            check15.setVisible(false);
            check16.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
                check16.setVisible(true);
                check16.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweater5(List<Sweater> sweaterList){
        try{
            image5.setVisible(true);
            text_button5.setVisible(true);
            price_button5.setVisible(true);
            this.prodData = sweaterList.get(4);
            text_button5.setText(prodData.getProduct_name());
            price_button5.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image5.setImage(image);

            check17.setVisible(false);
            check18.setVisible(false);
            check19.setVisible(false);
            check20.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
                check20.setVisible(true);
                check20.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweater6(List<Sweater> sweaterList){
        try{
            image6.setVisible(true);
            text_button6.setVisible(true);
            price_button6.setVisible(true);
            this.prodData = sweaterList.get(5);
            text_button6.setText(prodData.getProduct_name());
            price_button6.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image6.setImage(image);

            check21.setVisible(false);
            check22.setVisible(false);
            check23.setVisible(false);
            check24.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
                check24.setVisible(true);
                check24.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweater7(List<Sweater> sweaterList){
        try{
            image7.setVisible(true);
            text_button7.setVisible(true);
            price_button7.setVisible(true);
            this.prodData = sweaterList.get(6);
            text_button7.setText(prodData.getProduct_name());
            price_button7.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image7.setImage(image);

            check25.setVisible(false);
            check26.setVisible(false);
            check27.setVisible(false);
            check28.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
                check28.setVisible(true);
                check28.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweater8(List<Sweater> sweaterList){
        try{
            image8.setVisible(true);
            text_button8.setVisible(true);
            price_button8.setVisible(true);
            this.prodData = sweaterList.get(7);
            text_button8.setText(prodData.getProduct_name());
            price_button8.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image8.setImage(image);

            check29.setVisible(false);
            check30.setVisible(false);
            check31.setVisible(false);
            check32.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
                check32.setVisible(true);
                check32.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweater9(List<Sweater> sweaterList){
        try{
            image9.setVisible(true);
            text_button9.setVisible(true);
            price_button9.setVisible(true);
            this.prodData = sweaterList.get(8);
            text_button9.setText(prodData.getProduct_name());
            price_button9.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image9.setImage(image);

            check33.setVisible(false);
            check34.setVisible(false);
            check35.setVisible(false);
            check36.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
                check36.setVisible(true);
                check36.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweater10(List<Sweater> sweaterList){
        try{
            image10.setVisible(true);
            text_button10.setVisible(true);
            price_button10.setVisible(true);
            this.prodData = sweaterList.get(9);
            text_button10.setText(prodData.getProduct_name());
            price_button10.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image10.setImage(image);

            check37.setVisible(false);
            check38.setVisible(false);
            check39.setVisible(false);
            check40.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
                check40.setVisible(true);
                check40.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_sweater11(List<Sweater> sweaterList){
        try{
            image11.setVisible(true);
            text_button11.setVisible(true);
            price_button11.setVisible(true);
            this.prodData = sweaterList.get(10);
            text_button11.setText(prodData.getProduct_name());
            price_button11.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image11.setImage(image);

            check41.setVisible(false);
            check42.setVisible(false);
            check43.setVisible(false);
            check44.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
                check44.setVisible(true);
                check44.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    private List<TShirt> tShirtList = new ArrayList<>();
    public void method_tshirt1() {
        label.setText("Tshirts");
        cart_button1.setVisible(true);
        cart_button2.setVisible(true);
        cart_button3.setVisible(true);
        cart_button4.setVisible(true);
        cart_button5.setVisible(true);
        cart_button6.setVisible(true);
        cart_button7.setVisible(true);
        cart_button8.setVisible(true);
        cart_button9.setVisible(true);
        cart_button10.setVisible(true);
        cart_button11.setVisible(true);

        String sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 90"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt1(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 91"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt2(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 92"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt3(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 93"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt4(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 94"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt5(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 95"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt6(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 96"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt7(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 97"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt8(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 98"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt9(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 99"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt10(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM tshirt WHERE product_id = 100"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                tShirtList.add(new TShirt(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_tshirt11(tShirtList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setData_tshirt1(List<TShirt> tShirtList){
        try{
            image1.setVisible(true);
            text_button1.setVisible(true);
            price_button1.setVisible(true);
            this.prodData = tShirtList.get(0);
            text_button1.setText(prodData.getProduct_name());
            price_button1.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image1.setImage(image);

            check1.setVisible(false);
            check2.setVisible(false);
            check3.setVisible(false);
            check4.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
                check4.setVisible(true);
                check4.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_tshirt2(List<TShirt> tShirtList){
        try{
            image2.setVisible(true);
            text_button2.setVisible(true);
            price_button2.setVisible(true);
            this.prodData = tShirtList.get(1);
            text_button2.setText(prodData.getProduct_name());
            price_button2.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image2.setImage(image);

            check5.setVisible(false);
            check6.setVisible(false);
            check7.setVisible(false);
            check8.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
                check8.setVisible(true);
                check8.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void setData_tshirt3(List<TShirt> tShirtList){
        try{
            image3.setVisible(true);
            text_button3.setVisible(true);
            price_button3.setVisible(true);
            this.prodData = tShirtList.get(2);
            text_button3.setText(prodData.getProduct_name());
            price_button3.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image3.setImage(image);

            check9.setVisible(false);
            check10.setVisible(false);
            check11.setVisible(false);
            check12.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
                check12.setVisible(true);
                check12.setText(sizesList.get(3));
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_tshirt4(List<TShirt> tShirtList){
        try{
            image4.setVisible(true);
            text_button4.setVisible(true);
            price_button4.setVisible(true);
            this.prodData = tShirtList.get(3);
            text_button4.setText(prodData.getProduct_name());
            price_button4.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image4.setImage(image);

            check13.setVisible(false);
            check14.setVisible(false);
            check15.setVisible(false);
            check16.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
                check16.setVisible(true);
                check16.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_tshirt5(List<TShirt> tShirtList){
        try{
            image5.setVisible(true);
            text_button5.setVisible(true);
            price_button5.setVisible(true);
            this.prodData = tShirtList.get(4);
            text_button5.setText(prodData.getProduct_name());
            price_button5.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image5.setImage(image);

            check17.setVisible(false);
            check18.setVisible(false);
            check19.setVisible(false);
            check20.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
                check20.setVisible(true);
                check20.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_tshirt6(List<TShirt> tShirtList){
        try{
            image6.setVisible(true);
            text_button6.setVisible(true);
            price_button6.setVisible(true);
            this.prodData = tShirtList.get(5);
            text_button6.setText(prodData.getProduct_name());
            price_button6.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image6.setImage(image);

            check21.setVisible(false);
            check22.setVisible(false);
            check23.setVisible(false);
            check24.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
                check24.setVisible(true);
                check24.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_tshirt7(List<TShirt> tShirtList){
        try{
            image7.setVisible(true);
            text_button7.setVisible(true);
            price_button7.setVisible(true);
            this.prodData = tShirtList.get(6);
            text_button7.setText(prodData.getProduct_name());
            price_button7.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image7.setImage(image);

            check25.setVisible(false);
            check26.setVisible(false);
            check27.setVisible(false);
            check28.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
                check28.setVisible(true);
                check28.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_tshirt8(List<TShirt> tShirtList){
        try{
            image8.setVisible(true);
            text_button8.setVisible(true);
            price_button8.setVisible(true);
            this.prodData = tShirtList.get(7);
            text_button8.setText(prodData.getProduct_name());
            price_button8.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image8.setImage(image);

            check29.setVisible(false);
            check30.setVisible(false);
            check31.setVisible(false);
            check32.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
                check32.setVisible(true);
                check32.setText(sizesList.get(3));
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_tshirt9(List<TShirt> tShirtList){
        try{
            image9.setVisible(true);
            text_button9.setVisible(true);
            price_button9.setVisible(true);
            this.prodData = tShirtList.get(8);
            text_button9.setText(prodData.getProduct_name());
            price_button9.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image9.setImage(image);

            check33.setVisible(false);
            check34.setVisible(false);
            check35.setVisible(false);
            check36.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
                check36.setVisible(true);
                check36.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_tshirt10(List<TShirt> tShirtList){
        try{
            image10.setVisible(true);
            text_button10.setVisible(true);
            price_button10.setVisible(true);
            this.prodData = tShirtList.get(9);
            text_button10.setText(prodData.getProduct_name());
            price_button10.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image10.setImage(image);

            check37.setVisible(false);
            check38.setVisible(false);
            check39.setVisible(false);
            check40.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
                check40.setVisible(true);
                check40.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_tshirt11(List<TShirt> tShirtList){
        try{
            image11.setVisible(true);
            text_button11.setVisible(true);
            price_button11.setVisible(true);
            this.prodData = tShirtList.get(10);
            text_button11.setText(prodData.getProduct_name());
            price_button11.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image11.setImage(image);

            check41.setVisible(false);
            check42.setVisible(false);
            check43.setVisible(false);
            check44.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
                check44.setVisible(true);
                check44.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    private List<Trousers> trousersList = new ArrayList<>();
    public void method_trousers1() {
        label.setText("Trousers");
        cart_button1.setVisible(true);
        cart_button2.setVisible(true);
        cart_button3.setVisible(true);
        cart_button4.setVisible(true);
        cart_button5.setVisible(true);
        cart_button6.setVisible(true);
        cart_button7.setVisible(true);
        cart_button8.setVisible(true);
        cart_button9.setVisible(true);
        cart_button10.setVisible(true);
        cart_button11.setVisible(true);

        String sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 101"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers1(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 102"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers2(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------
        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 103"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers3(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 104"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers4(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 105"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers5(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 106"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers6(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 107"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers7(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 108"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers8(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 109"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers9(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------
        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 110"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers10(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------
        sql = "SELECT name, image, price, size FROM trousers WHERE product_id = 111"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                trousersList.add(new Trousers(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_trousers11(trousersList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setData_trousers1(List<Trousers> trousersList){
        try{
            image1.setVisible(true);
            text_button1.setVisible(true);
            price_button1.setVisible(true);
            this.prodData = trousersList.get(0);
            text_button1.setText(prodData.getProduct_name());
            price_button1.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image1.setImage(image);

            check1.setVisible(false);
            check2.setVisible(false);
            check3.setVisible(false);
            check4.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
                check4.setVisible(true);
                check4.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_trousers2(List<Trousers> trousersList){
        try{
            image2.setVisible(true);
            text_button2.setVisible(true);
            price_button2.setVisible(true);
            this.prodData = trousersList.get(1);
            text_button2.setText(prodData.getProduct_name());
            price_button2.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image2.setImage(image);

            check5.setVisible(false);
            check6.setVisible(false);
            check7.setVisible(false);
            check8.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
                check8.setVisible(true);
                check8.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void setData_trousers3(List<Trousers> trousersList){
        try{
            image3.setVisible(true);
            text_button3.setVisible(true);
            price_button3.setVisible(true);
            this.prodData = trousersList.get(2);
            text_button3.setText(prodData.getProduct_name());
            price_button3.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image3.setImage(image);

            check9.setVisible(false);
            check10.setVisible(false);
            check11.setVisible(false);
            check12.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
                check12.setVisible(true);
                check12.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_trousers4(List<Trousers> trousersList){
        try{
            image4.setVisible(true);
            text_button4.setVisible(true);
            price_button4.setVisible(true);
            this.prodData = trousersList.get(3);
            text_button4.setText(prodData.getProduct_name());
            price_button4.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image4.setImage(image);

            check13.setVisible(false);
            check14.setVisible(false);
            check15.setVisible(false);
            check16.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
                check16.setVisible(true);
                check16.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_trousers5(List<Trousers> trousersList){
        try{
            image5.setVisible(true);
            text_button5.setVisible(true);
            price_button5.setVisible(true);
            this.prodData = trousersList.get(4);
            text_button5.setText(prodData.getProduct_name());
            price_button5.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image5.setImage(image);

            check17.setVisible(false);
            check18.setVisible(false);
            check19.setVisible(false);
            check20.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
                check20.setVisible(true);
                check20.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_trousers6(List<Trousers> trousersList){
        try{
            image6.setVisible(true);
            text_button6.setVisible(true);
            price_button6.setVisible(true);
            this.prodData = trousersList.get(5);
            text_button6.setText(prodData.getProduct_name());
            price_button6.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image6.setImage(image);

            check21.setVisible(false);
            check22.setVisible(false);
            check23.setVisible(false);
            check24.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
                check24.setVisible(true);
                check24.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_trousers7(List<Trousers> trousersList){
        try{
            image7.setVisible(true);
            text_button7.setVisible(true);
            price_button7.setVisible(true);
            this.prodData = trousersList.get(6);
            text_button7.setText(prodData.getProduct_name());
            price_button7.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image7.setImage(image);

            check25.setVisible(false);
            check26.setVisible(false);
            check27.setVisible(false);
            check28.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
                check28.setVisible(true);
                check28.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_trousers8(List<Trousers> trousersList){
        try{
            image8.setVisible(true);
            text_button8.setVisible(true);
            price_button8.setVisible(true);
            this.prodData = trousersList.get(7);
            text_button8.setText(prodData.getProduct_name());
            price_button8.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image8.setImage(image);

            check29.setVisible(false);
            check30.setVisible(false);
            check31.setVisible(false);
            check32.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
                check32.setVisible(true);
                check32.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_trousers9(List<Trousers> trousersList){
        try{
            image9.setVisible(true);
            text_button9.setVisible(true);
            price_button9.setVisible(true);
            this.prodData = trousersList.get(8);
            text_button9.setText(prodData.getProduct_name());
            price_button9.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image9.setImage(image);

            check33.setVisible(false);
            check34.setVisible(false);
            check35.setVisible(false);
            check36.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
                check36.setVisible(true);
                check36.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_trousers10(List<Trousers> trousersList){
        try{
            image10.setVisible(true);
            text_button10.setVisible(true);
            price_button10.setVisible(true);
            this.prodData = trousersList.get(9);
            text_button10.setText(prodData.getProduct_name());
            price_button10.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image10.setImage(image);

            check37.setVisible(false);
            check38.setVisible(false);
            check39.setVisible(false);
            check40.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
                check40.setVisible(true);
                check40.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_trousers11(List<Trousers> trousersList){
        try{
            image11.setVisible(true);
            text_button11.setVisible(true);
            price_button11.setVisible(true);
            this.prodData = trousersList.get(10);
            text_button11.setText(prodData.getProduct_name());
            price_button11.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image11.setImage(image);

            check41.setVisible(false);
            check42.setVisible(false);
            check43.setVisible(false);
            check44.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
                check44.setVisible(true);
                check44.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    private List<Shoes> shoesList = new ArrayList<>();
    public void method_shoes1() {
        label.setText("Shoes");
        cart_button1.setVisible(true);
        cart_button2.setVisible(true);
        cart_button3.setVisible(true);
        cart_button4.setVisible(true);
        cart_button5.setVisible(true);
        cart_button6.setVisible(true);
        cart_button7.setVisible(true);
        cart_button8.setVisible(true);
        cart_button9.setVisible(true);
        cart_button10.setVisible(true);
        cart_button11.setVisible(true);

        String sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 112"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes1(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 113"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes2(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 114"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes3(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 115"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes4(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 116"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes5(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 117"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes6(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 118"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes7(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 119"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes8(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 120"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes9(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 121"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes10(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price, size FROM shoes WHERE product_id = 122"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String size = resultSet.getString("size");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                shoesList.add(new Shoes(name, price, image, size));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_shoes11(shoesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setData_shoes1(List<Shoes> shoesList){
        try{
            image1.setVisible(true);
            text_button1.setVisible(true);
            price_button1.setVisible(true);
            this.prodData = shoesList.get(0);
            text_button1.setText(prodData.getProduct_name());
            price_button1.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image1.setImage(image);

            check1.setVisible(false);
            check2.setVisible(false);
            check3.setVisible(false);
            check4.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check1.setVisible(true);
                check1.setText(sizesList.get(0));
                check2.setVisible(true);
                check2.setText(sizesList.get(1));
                check3.setVisible(true);
                check3.setText(sizesList.get(2));
                check4.setVisible(true);
                check4.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_shoes2(List<Shoes> shoesList){
        try{
            image2.setVisible(true);
            text_button2.setVisible(true);
            price_button2.setVisible(true);
            this.prodData = shoesList.get(1);
            text_button2.setText(prodData.getProduct_name());
            price_button2.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image2.setImage(image);

            check5.setVisible(false);
            check6.setVisible(false);
            check7.setVisible(false);
            check8.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check5.setVisible(true);
                check5.setText(sizesList.get(0));
                check6.setVisible(true);
                check6.setText(sizesList.get(1));
                check7.setVisible(true);
                check7.setText(sizesList.get(2));
                check8.setVisible(true);
                check8.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void setData_shoes3(List<Shoes> shoesList){
        try{
            image3.setVisible(true);
            text_button3.setVisible(true);
            price_button3.setVisible(true);
            this.prodData = shoesList.get(2);
            text_button3.setText(prodData.getProduct_name());
            price_button3.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image3.setImage(image);

            check9.setVisible(false);
            check10.setVisible(false);
            check11.setVisible(false);
            check12.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check9.setVisible(true);
                check9.setText(sizesList.get(0));
                check10.setVisible(true);
                check10.setText(sizesList.get(1));
                check11.setVisible(true);
                check11.setText(sizesList.get(2));
                check12.setVisible(true);
                check12.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_shoes4(List<Shoes> shoesList){
        try{
            image4.setVisible(true);
            text_button4.setVisible(true);
            price_button4.setVisible(true);
            this.prodData = shoesList.get(3);
            text_button4.setText(prodData.getProduct_name());
            price_button4.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image4.setImage(image);

            check13.setVisible(false);
            check14.setVisible(false);
            check15.setVisible(false);
            check16.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check13.setVisible(true);
                check13.setText(sizesList.get(0));
                check14.setVisible(true);
                check14.setText(sizesList.get(1));
                check15.setVisible(true);
                check15.setText(sizesList.get(2));
                check16.setVisible(true);
                check16.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_shoes5(List<Shoes> shoesList){
        try{
            image5.setVisible(true);
            text_button5.setVisible(true);
            price_button5.setVisible(true);
            this.prodData = shoesList.get(4);
            text_button5.setText(prodData.getProduct_name());
            price_button5.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image5.setImage(image);

            check17.setVisible(false);
            check18.setVisible(false);
            check19.setVisible(false);
            check20.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check17.setVisible(true);
                check17.setText(sizesList.get(0));
                check18.setVisible(true);
                check18.setText(sizesList.get(1));
                check19.setVisible(true);
                check19.setText(sizesList.get(2));
                check20.setVisible(true);
                check20.setText(sizesList.get(3));
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_shoes6(List<Shoes> shoesList){
        try{
            image6.setVisible(true);
            text_button6.setVisible(true);
            price_button6.setVisible(true);
            this.prodData = shoesList.get(5);
            text_button6.setText(prodData.getProduct_name());
            price_button6.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image6.setImage(image);

            check21.setVisible(false);
            check22.setVisible(false);
            check23.setVisible(false);
            check24.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check21.setVisible(true);
                check21.setText(sizesList.get(0));
                check22.setVisible(true);
                check22.setText(sizesList.get(1));
                check23.setVisible(true);
                check23.setText(sizesList.get(2));
                check24.setVisible(true);
                check24.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_shoes7(List<Shoes> shoesList){
        try{
            image7.setVisible(true);
            text_button7.setVisible(true);
            price_button7.setVisible(true);
            this.prodData = shoesList.get(6);
            text_button7.setText(prodData.getProduct_name());
            price_button7.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image7.setImage(image);

            check25.setVisible(false);
            check26.setVisible(false);
            check27.setVisible(false);
            check28.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check25.setVisible(true);
                check25.setText(sizesList.get(0));
                check26.setVisible(true);
                check26.setText(sizesList.get(1));
                check27.setVisible(true);
                check27.setText(sizesList.get(2));
                check28.setVisible(true);
                check28.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_shoes8(List<Shoes> shoesList){
        try{
            image8.setVisible(true);
            text_button8.setVisible(true);
            price_button8.setVisible(true);
            this.prodData = shoesList.get(7);
            text_button8.setText(prodData.getProduct_name());
            price_button8.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image8.setImage(image);

            check29.setVisible(false);
            check30.setVisible(false);
            check31.setVisible(false);
            check32.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check29.setVisible(true);
                check29.setText(sizesList.get(0));
                check30.setVisible(true);
                check30.setText(sizesList.get(1));
                check31.setVisible(true);
                check31.setText(sizesList.get(2));
                check32.setVisible(true);
                check32.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_shoes9(List<Shoes> shoesList){
        try{
            image9.setVisible(true);
            text_button9.setVisible(true);
            price_button9.setVisible(true);
            this.prodData = shoesList.get(8);
            text_button9.setText(prodData.getProduct_name());
            price_button9.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image9.setImage(image);

            check33.setVisible(false);
            check34.setVisible(false);
            check35.setVisible(false);
            check36.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check33.setVisible(true);
                check33.setText(sizesList.get(0));
                check34.setVisible(true);
                check34.setText(sizesList.get(1));
                check35.setVisible(true);
                check35.setText(sizesList.get(2));
                check36.setVisible(true);
                check36.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_shoes10(List<Shoes> shoesList){
        try{
            image10.setVisible(true);
            text_button10.setVisible(true);
            price_button10.setVisible(true);
            this.prodData = shoesList.get(9);
            text_button10.setText(prodData.getProduct_name());
            price_button10.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image10.setImage(image);

            check37.setVisible(false);
            check38.setVisible(false);
            check39.setVisible(false);
            check40.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check37.setVisible(true);
                check37.setText(sizesList.get(0));
                check38.setVisible(true);
                check38.setText(sizesList.get(1));
                check39.setVisible(true);
                check39.setText(sizesList.get(2));
                check40.setVisible(true);
                check40.setText(sizesList.get(3));
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_shoes11(List<Shoes> shoesList){
        try{
            image11.setVisible(true);
            text_button11.setVisible(true);
            price_button11.setVisible(true);
            this.prodData = shoesList.get(10);
            text_button11.setText(prodData.getProduct_name());
            price_button11.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image11.setImage(image);

            check41.setVisible(false);
            check42.setVisible(false);
            check43.setVisible(false);
            check44.setVisible(false);
            String size = prodData.getProduct_size();
            String[] sizeArray = size.split(", ");
            List<String> sizesList = new ArrayList<>();
            sizesList.addAll(Arrays.asList(sizeArray));
            if(sizesList.size() == 1){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
            }
            if(sizesList.size() == 2) {
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
            }
            if(sizesList.size() == 3){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
            }
            if(sizesList.size() == 4){
                check41.setVisible(true);
                check41.setText(sizesList.get(0));
                check42.setVisible(true);
                check42.setText(sizesList.get(1));
                check43.setVisible(true);
                check43.setText(sizesList.get(2));
                check44.setVisible(true);
                check44.setText(sizesList.get(3));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    private List<Accesories> accesoriesList = new ArrayList<>();
    public void method_accesories1() {
        label.setText("Accesories");
        cart_button1.setVisible(true);
        cart_button2.setVisible(true);
        cart_button3.setVisible(true);
        cart_button4.setVisible(true);
        cart_button5.setVisible(true);
        cart_button6.setVisible(true);
        cart_button7.setVisible(true);
        cart_button8.setVisible(true);
        cart_button9.setVisible(true);
        cart_button10.setVisible(true);
        cart_button11.setVisible(true);

        String sql = "SELECT name, image, price FROM accesories WHERE product_id = 142"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories1(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 143"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories2(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 125"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories3(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 126"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories4(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 127"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories5(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 128"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories6(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 129"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories7(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 130"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories8(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 131"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories9(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 132"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories10(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //------------------------------------

        sql = "SELECT name, image, price FROM accesories WHERE product_id = 133"; // Query to fetch required columns
        try (
                Connection connection = Database.connectDB();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Iterate through the result set and populate productList with fetched data
            while (resultSet.next()) {
                String image = resultSet.getString("image");
                String price = resultSet.getString("price");
                String name = resultSet.getString("name");

                // Create a Product object and add it to the list
                accesoriesList.add(new Accesories(name, price, image));
            }

            // Now productList contains the data retrieved from the database
            // You can use this data to update your FXML elements
            setData_accesories11(accesoriesList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setData_accesories1(List<Accesories> accesoriesList){
        try{
            image1.setVisible(true);
            text_button1.setVisible(true);
            price_button1.setVisible(true);
            this.prodData = accesoriesList.get(0);
            text_button1.setText(prodData.getProduct_name());
            price_button1.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image1.setImage(image);
            check1.setVisible(false);
            check2.setVisible(false);
            check3.setVisible(false);
            check4.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_accesories2(List<Accesories> accesoriesList){
        try{
            image2.setVisible(true);
            text_button2.setVisible(true);
            price_button2.setVisible(true);
            this.prodData = accesoriesList.get(1);
            text_button2.setText(prodData.getProduct_name());
            price_button2.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image2.setImage(image);
            check5.setVisible(false);
            check6.setVisible(false);
            check7.setVisible(false);
            check8.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void setData_accesories3(List<Accesories> accesoriesList){
        try{
            image3.setVisible(true);
            text_button3.setVisible(true);
            price_button3.setVisible(true);
            this.prodData = accesoriesList.get(2);
            text_button3.setText(prodData.getProduct_name());
            price_button3.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image3.setImage(image);
            check9.setVisible(false);
            check10.setVisible(false);
            check11.setVisible(false);
            check12.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_accesories4(List<Accesories> accesoriesList){
        try{
            image4.setVisible(true);
            text_button4.setVisible(true);
            price_button4.setVisible(true);
            this.prodData = accesoriesList.get(3);
            text_button4.setText(prodData.getProduct_name());
            price_button4.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image4.setImage(image);
            check13.setVisible(false);
            check14.setVisible(false);
            check15.setVisible(false);
            check16.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_accesories5(List<Accesories> accesoriesList){
        try{
            image5.setVisible(true);
            text_button5.setVisible(true);
            price_button5.setVisible(true);
            this.prodData = accesoriesList.get(4);
            text_button5.setText(prodData.getProduct_name());
            price_button5.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image5.setImage(image);
            check17.setVisible(false);
            check18.setVisible(false);
            check19.setVisible(false);
            check20.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_accesories6(List<Accesories> accesoriesList){
        try{
            image6.setVisible(true);
            text_button6.setVisible(true);
            price_button6.setVisible(true);
            this.prodData = accesoriesList.get(5);
            text_button6.setText(prodData.getProduct_name());
            price_button6.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image6.setImage(image);
            check21.setVisible(false);
            check22.setVisible(false);
            check23.setVisible(false);
            check24.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_accesories7(List<Accesories> accesoriesList){
        try{
            image7.setVisible(true);
            text_button7.setVisible(true);
            price_button7.setVisible(true);
            this.prodData = accesoriesList.get(6);
            text_button7.setText(prodData.getProduct_name());
            price_button7.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image7.setImage(image);
            check25.setVisible(false);
            check26.setVisible(false);
            check27.setVisible(false);
            check28.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_accesories8(List<Accesories> accesoriesList){
        try{
            image8.setVisible(true);
            text_button8.setVisible(true);
            price_button8.setVisible(true);
            this.prodData = accesoriesList.get(7);
            text_button8.setText(prodData.getProduct_name());
            price_button8.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image8.setImage(image);
            check29.setVisible(false);
            check30.setVisible(false);
            check31.setVisible(false);
            check32.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_accesories9(List<Accesories> accesoriesList){
        try{
            image9.setVisible(true);
            text_button9.setVisible(true);
            price_button9.setVisible(true);
            this.prodData = accesoriesList.get(8);
            text_button9.setText(prodData.getProduct_name());
            price_button9.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image9.setImage(image);
            check33.setVisible(false);
            check34.setVisible(false);
            check35.setVisible(false);
            check36.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_accesories10(List<Accesories> accesoriesList){
        try{
            image10.setVisible(true);
            text_button10.setVisible(true);
            price_button10.setVisible(true);
            this.prodData = accesoriesList.get(9);
            text_button10.setText(prodData.getProduct_name());
            price_button10.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image10.setImage(image);
            check37.setVisible(false);
            check38.setVisible(false);
            check39.setVisible(false);
            check40.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setData_accesories11(List<Accesories> accesoriesList){
        try{
            image11.setVisible(true);
            text_button11.setVisible(true);
            price_button11.setVisible(true);
            this.prodData = accesoriesList.get(10);
            text_button11.setText(prodData.getProduct_name());
            price_button11.setText(prodData.getProduct_price() + "$");
            InputStream stream = new FileInputStream(prodData.getProduct_image());
            Image image = new Image(stream);
            //Creating the image view
            image11.setImage(image);
            check41.setVisible(false);
            check42.setVisible(false);
            check43.setVisible(false);
            check44.setVisible(false);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

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

    /*
    public void createNewOrder(Integer order_id){
        try {
            // Establish the database connection
            connect = Database.connectDB();

            // Check if the connection is successfully established
            if (connect != null) {
                String insertData = "INSERT INTO order (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                    //LocalDateTime currentDate = LocalDateTime.now();
                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                    getUserId();
                    //prepare.setTimestamp(1, timestamp);
                    prepare.setInt(1, data1.getProduct_id());
                    prepare.setString(2, size);
                    prepare.setInt(3, data.getUser_id());
                    prepare.setString(4, name);
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
        }
    }*/


    DataSingleton2 data1 = DataSingleton2.getInstance();
    public void product1(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        getUserId();
        String name = null;
        if(data.getUsername() == null){
            alert.errorMessage("You have to log in first!");
        } else {
            if (label.getText() == "Jackets") {
                data1.setProduct_id(57);

                String select = "SELECT name FROM product where product_id = 57";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }

                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 57"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = null;
                        Integer count = 0;
                        if (check1.isSelected()) {
                            size = check1.getText();
                            count++;
                        }

                        if (check2.isSelected()) {
                            size = check2.getText();
                            count++;
                        }

                        if (check3.isSelected()) {
                            size = check3.getText();
                            count++;
                        }

                        if (check4.isSelected()) {
                            size = check4.getText();
                            count++;
                        }

                        if (!check1.isSelected() && !check2.isSelected() && !check3.isSelected() && !check4.isSelected())
                            alert.errorMessage("Please select one size!");
                        if (count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }

                        // Create a Product object and add it to the list

                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        if (count == 1) {
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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


                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


            if (label.getText() == "Sweatshirts") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    data1.setProduct_id(68);
                    String select = "SELECT name FROM product where product_id = 68";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 68"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");
                            getUserId();
                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            // data1.setSize(size);
                            //data1.setPrice(price);
                            String size = null;
                            Integer count = 0;
                            if (check1.isSelected()) {
                                size = check1.getText();
                                count++;
                            }

                            if (check2.isSelected()) {
                                size = check2.getText();
                                count++;
                            }

                            if (check3.isSelected()) {
                                size = check3.getText();
                                count++;
                            }

                            if (check4.isSelected()) {
                                size = check4.getText();
                                count++;
                            }
                            if (!check1.isSelected() && !check2.isSelected() && !check3.isSelected() && !check4.isSelected())
                                alert.errorMessage("Please select one size!");
                            if (count > 1) {
                                alert.errorMessage("Please select only one size!");
                            }
                            if (count == 1) {
                                alert.successMessage("The item has been added successfully to the cart!");
                                Product product = new Product(name, size, color, price, image);
                                DataSingleton2.getInstance().addToCart(product);


                                Connection connect = null;


                                try {
                                    // Establish the database connection
                                    connect = Database.connectDB();

                                    // Check if the connection is successfully established
                                    if (connect != null) {
                                        String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                        try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                            //LocalDateTime currentDate = LocalDateTime.now();
                                            //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                            getUserId();
                                            //prepare.setTimestamp(1, timestamp);
                                            prepare.setInt(1, data1.getProduct_id());
                                            prepare.setString(2, size);
                                            prepare.setInt(3, data.getUser_id());
                                            prepare.setString(4, name);
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
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (label.getText() == "Sweaters") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    data1.setProduct_id(79);
                    String select = "SELECT name FROM product where product_id = 79";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT  image, price, color FROM sweater WHERE product_id = 79"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            //data1.setPrice(price);
                            String size = null;
                            Integer count = 0;
                            if (check1.isSelected()) {
                                size = check1.getText();
                                count++;
                            }

                            if (check2.isSelected()) {
                                size = check2.getText();
                                count++;
                            }

                            if (check3.isSelected()) {
                                size = check3.getText();
                                count++;
                            }

                            if (check4.isSelected()) {
                                size = check4.getText();
                                count++;
                            }
                            if (!check1.isSelected() && !check2.isSelected() && !check3.isSelected() && !check4.isSelected())
                                alert.errorMessage("Please select one size!");
                            if (count > 1) {
                                alert.errorMessage("Please select only one size!");
                            }
                            if (count == 1) {
                                alert.successMessage("The item has been added successfully to the cart!");
                                Product product = new Product(name, size, color, price, image);
                                DataSingleton2.getInstance().addToCart(product);


                                Connection connect = null;


                                try {
                                    // Establish the database connection
                                    connect = Database.connectDB();

                                    // Check if the connection is successfully established
                                    if (connect != null) {
                                        String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                        try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                            //LocalDateTime currentDate = LocalDateTime.now();
                                            //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                            getUserId();
                                            //prepare.setTimestamp(1, timestamp);
                                            prepare.setInt(1, data1.getProduct_id());
                                            prepare.setString(2, size);
                                            prepare.setInt(3, data.getUser_id());
                                            prepare.setString(4, name);
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
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (label.getText() == "Tshirts") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    data1.setProduct_id(90);
                    String select = "SELECT name FROM product where product_id = 90";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT image, price, color FROM tshirt WHERE product_id = 90"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            // data1.setPrice(price);
                            String size = null;
                            Integer count = 0;
                            if (check1.isSelected()) {
                                size = check1.getText();
                                count++;
                            }

                            if (check2.isSelected()) {
                                size = check2.getText();
                                count++;
                            }

                            if (check3.isSelected()) {
                                size = check3.getText();
                                count++;
                            }

                            if (check4.isSelected()) {
                                size = check4.getText();
                                count++;
                            }
                            if (!check1.isSelected() && !check2.isSelected() && !check3.isSelected() && !check4.isSelected())
                                alert.errorMessage("Please select one size!");
                            if (count > 1) {
                                alert.errorMessage("Please select only one size!");
                            }
                            if (count == 1) {
                                alert.successMessage("The item has been added successfully to the cart!");
                                Product product = new Product(name, size, color, price, image);
                                DataSingleton2.getInstance().addToCart(product);

                                Connection connect = null;


                                try {
                                    // Establish the database connection
                                    connect = Database.connectDB();

                                    // Check if the connection is successfully established
                                    if (connect != null) {
                                        String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                        try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                            //LocalDateTime currentDate = LocalDateTime.now();
                                            //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                            getUserId();
                                            //prepare.setTimestamp(1, timestamp);
                                            prepare.setInt(1, data1.getProduct_id());
                                            prepare.setString(2, size);
                                            prepare.setInt(3, data.getUser_id());
                                            prepare.setString(4, name);
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
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (label.getText() == "Trousers") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    data1.setProduct_id(101);
                    String select = "SELECT name FROM product where product_id = 101";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT image, price, color FROM trousers WHERE product_id = 101"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            //data1.setPrice(price);
                            String size = null;
                            Integer count = 0;
                            if (check1.isSelected()) {
                                size = check1.getText();
                                count++;
                            }

                            if (check2.isSelected()) {
                                size = check2.getText();
                                count++;
                            }

                            if (check3.isSelected()) {
                                size = check3.getText();
                                count++;
                            }

                            if (check4.isSelected()) {
                                size = check4.getText();
                                count++;
                            }
                            if (!check1.isSelected() && !check2.isSelected() && !check3.isSelected() && !check4.isSelected())
                                alert.errorMessage("Please select one size!");
                            if (count > 1) {
                                alert.errorMessage("Please select only one size!");
                            }
                            if (count == 1) {
                                alert.successMessage("The item has been added successfully to the cart!");
                                Product product = new Product(name, size, color, price, image);
                                DataSingleton2.getInstance().addToCart(product);
                                Connection connect = null;


                                try {
                                    // Establish the database connection
                                    connect = Database.connectDB();

                                    // Check if the connection is successfully established
                                    if (connect != null) {
                                        String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                        try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                            //LocalDateTime currentDate = LocalDateTime.now();
                                            //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                            getUserId();
                                            //prepare.setTimestamp(1, timestamp);
                                            prepare.setInt(1, data1.getProduct_id());
                                            prepare.setString(2, size);
                                            prepare.setInt(3, data.getUser_id());
                                            prepare.setString(4, name);
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
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (label.getText() == "Shoes") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    data1.setProduct_id(112);
                    String select = "SELECT name FROM product where product_id = 112";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT image, price, color FROM shoes WHERE product_id = 112"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            //data1.setPrice(price);
                            String size = null;
                            Integer count = 0;
                            if (check1.isSelected()) {
                                size = check1.getText();
                                count++;
                            }

                            if (check2.isSelected()) {
                                size = check2.getText();
                                count++;
                            }

                            if (check3.isSelected()) {
                                size = check3.getText();
                                count++;
                            }

                            if (check4.isSelected()) {
                                size = check4.getText();
                                count++;
                            }
                            if (!check1.isSelected() && !check2.isSelected() && !check3.isSelected() && !check4.isSelected())
                                alert.errorMessage("Please select one size!");
                            if (count > 1) {
                                alert.errorMessage("Please select only one size!");
                            }
                            if (count == 1) {
                                alert.successMessage("The item has been added successfully to the cart!");
                                Product product = new Product(name, size, color, price, image);
                                DataSingleton2.getInstance().addToCart(product);

                                Connection connect = null;


                                try {
                                    // Establish the database connection
                                    connect = Database.connectDB();

                                    // Check if the connection is successfully established
                                    if (connect != null) {
                                        String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                        try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                            //LocalDateTime currentDate = LocalDateTime.now();
                                            //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                            getUserId();
                                            //prepare.setTimestamp(1, timestamp);
                                            prepare.setInt(1, data1.getProduct_id());
                                            prepare.setString(2, size);
                                            prepare.setInt(3, data.getUser_id());
                                            prepare.setString(4, name);
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
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (label.getText() == "Accesories") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    alert.successMessage("The item has been added successfully to the cart!");
                    data1.setProduct_id(123);
                    String select = "SELECT name FROM product where product_id = 123";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 123"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");
                            String size = resultSet.getString("size");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            //data1.setPrice(price);
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
            }


    public void product2(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        getUserId();
        String name = null;
        if(label.getText() == "Jackets") {
            if(data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(58);
                String select = "SELECT name FROM product where product_id = 58";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 58"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check5.isSelected()){
                            size = check5.getText();
                            count++;
                        }

                        if(check6.isSelected()){
                            size = check6.getText();
                            count++;
                        }

                        if(check7.isSelected()){
                            size = check7.getText();
                            count++;
                        }

                        if(check8.isSelected()){
                            size = check8.getText();
                            count++;
                        }
                        if(!check5.isSelected() && !check6.isSelected() && !check7.isSelected() && !check8.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if(data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(69);
                String select = "SELECT name FROM product where product_id = 69";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 69"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check5.isSelected()){
                            size = check5.getText();
                            count++;
                        }

                        if(check6.isSelected()){
                            size = check6.getText();
                            count++;
                        }

                        if(check7.isSelected()){
                            size = check7.getText();
                            count++;
                        }

                        if(check8.isSelected()){
                            size = check8.getText();
                            count++;
                        }
                        if(!check5.isSelected() && !check6.isSelected() && !check7.isSelected() && !check8.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweaters") {
            if(data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(80);
                String select = "SELECT name FROM product where product_id = 80";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweater WHERE product_id = 80"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check5.isSelected()){
                            size = check5.getText();
                            count++;
                        }

                        if(check6.isSelected()){
                            size = check6.getText();
                            count++;
                        }

                        if(check7.isSelected()){
                            size = check7.getText();
                            count++;
                        }

                        if(check8.isSelected()){
                            size = check8.getText();
                            count++;
                        }
                        if(!check5.isSelected() && !check6.isSelected() && !check7.isSelected() && !check8.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Tshirts") {
            if(data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(91);
                String select = "SELECT name FROM product where product_id = 91";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM tshirt WHERE product_id = 91"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check5.isSelected()){
                            size = check5.getText();
                            count++;
                        }

                        if(check6.isSelected()){
                            size = check6.getText();
                            count++;
                        }

                        if(check7.isSelected()){
                            size = check7.getText();
                            count++;
                        }

                        if(check8.isSelected()){
                            size = check8.getText();
                            count++;
                        }
                        if(!check5.isSelected() && !check6.isSelected() && !check7.isSelected() && !check8.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Trousers") {
            if(data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(102);
                String select = "SELECT name FROM product where product_id = 102";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM trousers WHERE product_id = 102"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check5.isSelected()){
                            size = check5.getText();
                            count++;
                        }

                        if(check6.isSelected()){
                            size = check6.getText();
                            count++;
                        }

                        if(check7.isSelected()){
                            size = check7.getText();
                            count++;
                        }

                        if(check8.isSelected()){
                            size = check8.getText();
                            count++;
                        }
                        if(!check5.isSelected() && !check6.isSelected() && !check7.isSelected() && !check8.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Shoes") {
            if(data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(113);
                String select = "SELECT name FROM product where product_id = 113";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM shoes WHERE product_id = 113"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check5.isSelected()){
                            size = check5.getText();
                            count++;
                        }

                        if(check6.isSelected()){
                            size = check6.getText();
                            count++;
                        }

                        if(check7.isSelected()){
                            size = check7.getText();
                            count++;
                        }

                        if(check8.isSelected()){
                            size = check8.getText();
                            count++;
                        }
                        if(!check5.isSelected() && !check6.isSelected() && !check7.isSelected() && !check8.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Accesories") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {
                alert.successMessage("The item has been added successfully to the cart!");
                data1.setProduct_id(124);
                String select = "SELECT name FROM product where product_id = 124";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 124"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = resultSet.getString("size");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        // data1.setPrice(price);
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void product3(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        getUserId();
        String name = null;
        if(label.getText() == "Jackets") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(59);
                String select = "SELECT name FROM product where product_id = 59";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 59"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check9.isSelected()){
                            size = check9.getText();
                            count++;
                        }

                        if(check10.isSelected()){
                            size = check10.getText();
                            count++;
                        }

                        if(check11.isSelected()){
                            size = check11.getText();
                            count++;
                        }

                        if(check12.isSelected()){
                            size = check12.getText();
                            count++;
                        }
                        if(!check9.isSelected() && !check10.isSelected() && !check11.isSelected() && !check12.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
            data1.setProduct_id(70);
                String select = "SELECT name FROM product where product_id = 70";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 70"; // Query to fetch required columns
            try (
                    Connection connection = Database.connectDB();
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(sql)) {

                // Iterate through the result set and populate productList with fetched data
                while (resultSet.next()) {
                    String image = resultSet.getString("image");
                    String price = resultSet.getString("price");
                    String color = resultSet.getString("color");

                    // Create a Product object and add it to the list
                    //data1.setName(name);
                    //data1.setColor(color);
                    //data1.setImage(image);
                    //data1.setSize(size);
                   // data1.setPrice(price);
                    String size = null;
                    Integer count = 0;
                    if(check9.isSelected()){
                        size = check9.getText();
                        count++;
                    }

                    if(check10.isSelected()){
                        size = check10.getText();
                        count++;
                    }

                    if(check11.isSelected()){
                        size = check11.getText();
                        count++;
                    }

                    if(check12.isSelected()){
                        size = check12.getText();
                        count++;
                    }
                    if(!check9.isSelected() && !check10.isSelected() && !check11.isSelected() && !check12.isSelected())
                        alert.errorMessage("Please select one size!");
                    if(count > 1) {
                        alert.errorMessage("Please select only one size!");
                    }
                    if(count == 1){
                        alert.successMessage("The item has been added successfully to the cart!");
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            }
        }

        if(label.getText() == "Sweaters") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(81);
                String select = "SELECT name FROM product where product_id = 81";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM sweater WHERE product_id = 81"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check9.isSelected()){
                            size = check9.getText();
                            count++;
                        }

                        if(check10.isSelected()){
                            size = check10.getText();
                            count++;
                        }

                        if(check11.isSelected()){
                            size = check11.getText();
                            count++;
                        }

                        if(check12.isSelected()){
                            size = check12.getText();
                            count++;
                        }
                        if(!check9.isSelected() && !check10.isSelected() && !check11.isSelected() && !check12.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Tshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(92);
                String select = "SELECT name FROM product where product_id = 92";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM tshirt WHERE product_id = 92"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check9.isSelected()){
                            size = check9.getText();
                            count++;
                        }

                        if(check10.isSelected()){
                            size = check10.getText();
                            count++;
                        }

                        if(check11.isSelected()){
                            size = check11.getText();
                            count++;
                        }

                        if(check12.isSelected()){
                            size = check12.getText();
                            count++;
                        }
                        if(!check9.isSelected() && !check10.isSelected() && !check11.isSelected() && !check12.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

        if(label.getText() == "Trousers") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(103);
                String select = "SELECT name FROM product where product_id = 103";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM trousers WHERE product_id = 103"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check9.isSelected()){
                            size = check9.getText();
                            count++;
                        }

                        if(check10.isSelected()){
                            size = check10.getText();
                            count++;
                        }

                        if(check11.isSelected()){
                            size = check11.getText();
                            count++;
                        }

                        if(check12.isSelected()){
                            size = check12.getText();
                            count++;
                        }
                        if(!check9.isSelected() && !check10.isSelected() && !check11.isSelected() && !check12.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Shoes") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(114);
                String select = "SELECT name FROM product where product_id = 114";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM shoes WHERE product_id = 114"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check9.isSelected()){
                            size = check9.getText();
                            count++;
                        }

                        if(check10.isSelected()){
                            size = check10.getText();
                            count++;
                        }

                        if(check11.isSelected()){
                            size = check11.getText();
                            count++;
                        }

                        if(check12.isSelected()){
                            size = check12.getText();
                            count++;
                        }
                        if(!check9.isSelected() && !check10.isSelected() && !check11.isSelected() && !check12.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Accesories") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {
                alert.successMessage("The item has been added successfully to the cart!");
                data1.setProduct_id(125);
                String select = "SELECT name FROM product where product_id = 125";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 125"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = resultSet.getString("size");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void product4(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        getUserId();
        String name = null;
        if(label.getText() == "Jackets") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(60);
                String select = "SELECT name FROM product where product_id = 60";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 60"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check13.isSelected()){
                            size = check13.getText();
                            count++;
                        }

                        if(check14.isSelected()){
                            size = check14.getText();
                            count++;
                        }

                        if(check15.isSelected()){
                            size = check15.getText();
                            count++;
                        }

                        if(check16.isSelected()){
                            size = check16.getText();
                            count++;
                        }
                        if(!check13.isSelected() && !check14.isSelected() && !check15.isSelected() && !check16.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(71);
                String select = "SELECT name FROM product where product_id = 71";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 71"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check13.isSelected()){
                            size = check13.getText();
                            count++;
                        }

                        if(check14.isSelected()){
                            size = check14.getText();
                            count++;
                        }

                        if(check15.isSelected()){
                            size = check15.getText();
                            count++;
                        }

                        if(check16.isSelected()){
                            size = check16.getText();
                            count++;
                        }
                        if(!check13.isSelected() && !check14.isSelected() && !check15.isSelected() && !check16.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweaters") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(82);
                String select = "SELECT name FROM product where product_id = 82";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweater WHERE product_id = 82"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check13.isSelected()){
                            size = check13.getText();
                            count++;
                        }

                        if(check14.isSelected()){
                            size = check14.getText();
                            count++;
                        }

                        if(check15.isSelected()){
                            size = check15.getText();
                            count++;
                        }

                        if(check16.isSelected()){
                            size = check16.getText();
                            count++;
                        }
                        if(!check13.isSelected() && !check14.isSelected() && !check15.isSelected() && !check16.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Tshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(93);
                String select = "SELECT name FROM product where product_id = 93";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM tshirt WHERE product_id = 93"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check13.isSelected()){
                            size = check13.getText();
                            count++;
                        }

                        if(check14.isSelected()){
                            size = check14.getText();
                            count++;
                        }

                        if(check15.isSelected()){
                            size = check15.getText();
                            count++;
                        }

                        if(check16.isSelected()){
                            size = check16.getText();
                            count++;
                        }
                        if(!check13.isSelected() && !check14.isSelected() && !check15.isSelected() && !check16.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Trousers") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {
                data1.setProduct_id(104);
                String select = "SELECT name FROM product where product_id = 104";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM trousers WHERE product_id = 104"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check13.isSelected()){
                            size = check13.getText();
                            count++;
                        }

                        if(check14.isSelected()){
                            size = check14.getText();
                            count++;
                        }

                        if(check15.isSelected()){
                            size = check15.getText();
                            count++;
                        }

                        if(check16.isSelected()){
                            size = check16.getText();
                            count++;
                        }
                        if(!check13.isSelected() && !check14.isSelected() && !check15.isSelected() && !check16.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Shoes") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(115);
                String select = "SELECT name FROM product where product_id = 115";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM shoes WHERE product_id = 115"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check13.isSelected()){
                            size = check13.getText();
                            count++;
                        }

                        if(check14.isSelected()){
                            size = check14.getText();
                            count++;
                        }

                        if(check15.isSelected()){
                            size = check15.getText();
                            count++;
                        }

                        if(check16.isSelected()){
                            size = check16.getText();
                            count++;
                        }
                        if(!check13.isSelected() && !check14.isSelected() && !check15.isSelected() && !check16.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Accesories") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {
                alert.successMessage("The item has been added successfully to the cart!");
                data1.setProduct_id(126);
                String select = "SELECT name FROM product where product_id = 126";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 126"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = resultSet.getString("size");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void product5(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        getUserId();
        String name = null;
        if(label.getText() == "Jackets") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(61);
                String select = "SELECT name FROM product where product_id = 61";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 61"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check17.isSelected()){
                            size = check17.getText();
                            count++;
                        }

                        if(check18.isSelected()){
                            size = check18.getText();
                            count++;
                        }

                        if(check19.isSelected()){
                            size = check19.getText();
                            count++;
                        }

                        if(check20.isSelected()){
                            size = check20.getText();
                            count++;
                        }
                        if(!check17.isSelected() && !check18.isSelected() && !check19.isSelected() && !check20.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(72);
                String select = "SELECT name FROM product where product_id = 72";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 72"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        ///data1.setColor(color);
                        // data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check17.isSelected()){
                            size = check17.getText();
                            count++;
                        }

                        if(check18.isSelected()){
                            size = check18.getText();
                            count++;
                        }

                        if(check19.isSelected()){
                            size = check19.getText();
                            count++;
                        }

                        if(check20.isSelected()){
                            size = check20.getText();
                            count++;
                        }
                        if(!check17.isSelected() && !check18.isSelected() && !check19.isSelected() && !check20.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweaters") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(83);
                String select = "SELECT name FROM product where product_id = 83";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweater WHERE product_id = 83"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        // data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check17.isSelected()){
                            size = check17.getText();
                            count++;
                        }

                        if(check18.isSelected()){
                            size = check18.getText();
                            count++;
                        }

                        if(check19.isSelected()){
                            size = check19.getText();
                            count++;
                        }

                        if(check20.isSelected()){
                            size = check20.getText();
                            count++;
                        }
                        if(!check17.isSelected() && !check18.isSelected() && !check19.isSelected() && !check20.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Tshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(94);
                String select = "SELECT name FROM product where product_id = 94";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM tshirt WHERE product_id = 94"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check17.isSelected()){
                            size = check17.getText();
                            count++;
                        }

                        if(check18.isSelected()){
                            size = check18.getText();
                            count++;
                        }

                        if(check19.isSelected()){
                            size = check19.getText();
                            count++;
                        }

                        if(check20.isSelected()){
                            size = check20.getText();
                            count++;
                        }
                        if(!check17.isSelected() && !check18.isSelected() && !check19.isSelected() && !check20.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Trousers") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(105);
                String select = "SELECT name FROM product where product_id = 105";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM trousers WHERE product_id = 105"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check17.isSelected()){
                            size = check17.getText();
                            count++;
                        }

                        if(check18.isSelected()){
                            size = check18.getText();
                            count++;
                        }

                        if(check19.isSelected()){
                            size = check19.getText();
                            count++;
                        }

                        if(check20.isSelected()){
                            size = check20.getText();
                            count++;
                        }
                        if(!check17.isSelected() && !check18.isSelected() && !check19.isSelected() && !check20.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Shoes") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(116);
                String select = "SELECT name FROM product where product_id = 116";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM shoes WHERE product_id = 116"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check17.isSelected()){
                            size = check17.getText();
                            count++;
                        }

                        if(check18.isSelected()){
                            size = check18.getText();
                            count++;
                        }

                        if(check19.isSelected()){
                            size = check19.getText();
                            count++;
                        }

                        if(check20.isSelected()){
                            size = check20.getText();
                            count++;
                        }
                        if(!check17.isSelected() && !check18.isSelected() && !check19.isSelected() && !check20.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Accesories") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {
                alert.successMessage("The item has been added successfully to the cart!");
                data1.setProduct_id(127);
                String select = "SELECT name FROM product where product_id = 127";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 127"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = resultSet.getString("size");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void product6(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        getUserId();
        String name = null;
        if(label.getText() == "Jackets") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(62);
                String select = "SELECT name FROM product where product_id = 62";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 62"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check21.isSelected()){
                            size = check21.getText();
                            count++;
                        }

                        if(check22.isSelected()){
                            size = check22.getText();
                            count++;
                        }

                        if(check23.isSelected()){
                            size = check23.getText();
                            count++;
                        }

                        if(check24.isSelected()){
                            size = check24.getText();
                            count++;
                        }
                        if(!check21.isSelected() && !check22.isSelected() && !check23.isSelected() && !check24.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {
                data1.setProduct_id(73);
                String select = "SELECT name FROM product where product_id = 73";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 73"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check21.isSelected()){
                            size = check21.getText();
                            count++;
                        }

                        if(check22.isSelected()){
                            size = check22.getText();
                            count++;
                        }

                        if(check23.isSelected()){
                            size = check23.getText();
                            count++;
                        }

                        if(check24.isSelected()){
                            size = check24.getText();
                            count++;
                        }
                        if(!check21.isSelected() && !check22.isSelected() && !check23.isSelected() && !check24.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                }
            }
        }

            if (label.getText() == "Sweaters") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to logg in first!");
                } else {
                    data1.setProduct_id(84);
                    String select = "SELECT name FROM product where product_id = 84";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT image, price, color FROM sweater WHERE product_id = 84"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            //data1.setPrice(price);
                            String size = null;
                            Integer count = 0;
                            if(check21.isSelected()){
                                size = check21.getText();
                                count++;
                            }

                            if(check22.isSelected()){
                                size = check22.getText();
                                count++;
                            }

                            if(check23.isSelected()){
                                size = check23.getText();
                                count++;
                            }

                            if(check24.isSelected()){
                                size = check24.getText();
                                count++;
                            }
                            if(!check21.isSelected() && !check22.isSelected() && !check23.isSelected() && !check24.isSelected())
                                alert.errorMessage("Please select one size!");
                            if(count > 1) {
                                alert.errorMessage("Please select only one size!");
                            }
                            if(count == 1){
                                alert.successMessage("The item has been added successfully to the cart!");
                                Product product = new Product(name, size, color, price, image);
                                DataSingleton2.getInstance().addToCart(product);

                                Connection connect = null;


                                try {
                                    // Establish the database connection
                                    connect = Database.connectDB();

                                    // Check if the connection is successfully established
                                    if (connect != null) {
                                        String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                        try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                            //LocalDateTime currentDate = LocalDateTime.now();
                                            //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                            getUserId();
                                            //prepare.setTimestamp(1, timestamp);
                                            prepare.setInt(1, data1.getProduct_id());
                                            prepare.setString(2, size);
                                            prepare.setInt(3, data.getUser_id());
                                            prepare.setString(4, name);
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
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (label.getText() == "Tshirts") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    data1.setProduct_id(95);
                    String select = "SELECT name FROM product where product_id = 95";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT  image, price, color FROM tshirt WHERE product_id = 95"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            //data1.setPrice(price);
                            String size = null;
                            Integer count = 0;
                            if(check21.isSelected()){
                                size = check21.getText();
                                count++;
                            }

                            if(check22.isSelected()){
                                size = check22.getText();
                                count++;
                            }

                            if(check23.isSelected()){
                                size = check23.getText();
                                count++;
                            }

                            if(check24.isSelected()){
                                size = check24.getText();
                                count++;
                            }
                            if(!check21.isSelected() && !check22.isSelected() && !check23.isSelected() && !check24.isSelected())
                                alert.errorMessage("Please select one size!");
                            if(count > 1) {
                                alert.errorMessage("Please select only one size!");
                            }
                            if(count == 1){
                                alert.successMessage("The item has been added successfully to the cart!");
                                Product product = new Product(name, size, color, price, image);
                                DataSingleton2.getInstance().addToCart(product);

                                Connection connect = null;


                                try {
                                    // Establish the database connection
                                    connect = Database.connectDB();

                                    // Check if the connection is successfully established
                                    if (connect != null) {
                                        String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                        try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                            //LocalDateTime currentDate = LocalDateTime.now();
                                            //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                            getUserId();
                                            //prepare.setTimestamp(1, timestamp);
                                            prepare.setInt(1, data1.getProduct_id());
                                            prepare.setString(2, size);
                                            prepare.setInt(3, data.getUser_id());
                                            prepare.setString(4, name);
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
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (label.getText() == "Trousers") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    data1.setProduct_id(106);
                    String select = "SELECT name FROM product where product_id = 106";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT image, price, color FROM trousers WHERE product_id = 106"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            //data1.setPrice(price);
                            String size = null;
                            Integer count = 0;
                            if(check21.isSelected()){
                                size = check21.getText();
                                count++;
                            }

                            if(check22.isSelected()){
                                size = check22.getText();
                                count++;
                            }

                            if(check23.isSelected()){
                                size = check23.getText();
                                count++;
                            }

                            if(check24.isSelected()){
                                size = check24.getText();
                                count++;
                            }
                            if(!check21.isSelected() && !check22.isSelected() && !check23.isSelected() && !check24.isSelected())
                                alert.errorMessage("Please select one size!");
                            if(count > 1) {
                                alert.errorMessage("Please select only one size!");
                            }
                            if(count == 1){
                                alert.successMessage("The item has been added successfully to the cart!");
                                Product product = new Product(name, size, color, price, image);
                                DataSingleton2.getInstance().addToCart(product);

                                Connection connect = null;


                                try {
                                    // Establish the database connection
                                    connect = Database.connectDB();

                                    // Check if the connection is successfully established
                                    if (connect != null) {
                                        String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                        try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                            //LocalDateTime currentDate = LocalDateTime.now();
                                            //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                            getUserId();
                                            //prepare.setTimestamp(1, timestamp);
                                            prepare.setInt(1, data1.getProduct_id());
                                            prepare.setString(2, size);
                                            prepare.setInt(3, data.getUser_id());
                                            prepare.setString(4, name);
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
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (label.getText() == "Shoes") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    data1.setProduct_id(117);
                    String select = "SELECT name FROM product where product_id = 117";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT image, price, color FROM shoes WHERE product_id = 117"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            //data1.setPrice(price);
                            String size = null;
                            Integer count = 0;
                            if(check21.isSelected()){
                                size = check21.getText();
                                count++;
                            }

                            if(check22.isSelected()){
                                size = check22.getText();
                                count++;
                            }

                            if(check23.isSelected()){
                                size = check23.getText();
                                count++;
                            }

                            if(check24.isSelected()){
                                size = check24.getText();
                                count++;
                            }
                            if(!check21.isSelected() && !check22.isSelected() && !check23.isSelected() && !check24.isSelected())
                                alert.errorMessage("Please select one size!");
                            if(count > 1) {
                                alert.errorMessage("Please select only one size!");
                            }
                            if(count == 1){
                                alert.successMessage("The item has been added successfully to the cart!");
                                Product product = new Product(name, size, color, price, image);
                                DataSingleton2.getInstance().addToCart(product);

                                Connection connect = null;


                                try {
                                    // Establish the database connection
                                    connect = Database.connectDB();

                                    // Check if the connection is successfully established
                                    if (connect != null) {
                                        String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                        try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                            //LocalDateTime currentDate = LocalDateTime.now();
                                            //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                            getUserId();
                                            //prepare.setTimestamp(1, timestamp);
                                            prepare.setInt(1, data1.getProduct_id());
                                            prepare.setString(2, size);
                                            prepare.setInt(3, data.getUser_id());
                                            prepare.setString(4, name);
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
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (label.getText() == "Accesories") {
                if (data.getUsername() == null) {
                    alert.errorMessage("You have to log in first!");
                } else {
                    alert.successMessage("The item has been added successfully to the cart!");
                    data1.setProduct_id(128);
                    String select = "SELECT name FROM product where product_id = 128";
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(select)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            name = resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 128"; // Query to fetch required columns
                    try (
                            Connection connection = Database.connectDB();
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql)) {

                        // Iterate through the result set and populate productList with fetched data
                        while (resultSet.next()) {
                            String image = resultSet.getString("image");
                            String price = resultSet.getString("price");
                            String color = resultSet.getString("color");
                            String size = resultSet.getString("size");

                            // Create a Product object and add it to the list
                            //data1.setName(name);
                            //data1.setColor(color);
                            //data1.setImage(image);
                            //data1.setSize(size);
                            //data1.setPrice(price);
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    public void product7(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        getUserId();
        String name = null;
        if(label.getText() == "Jackets") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(63);
                String select = "SELECT name FROM product where product_id = 63";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 63"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check25.isSelected()){
                            size = check25.getText();
                            count++;
                        }

                        if(check26.isSelected()){
                            size = check26.getText();
                            count++;
                        }

                        if(check27.isSelected()){
                            size = check27.getText();
                            count++;
                        }

                        if(check28.isSelected()){
                            size = check28.getText();
                            count++;
                        }
                        if(!check25.isSelected() && !check26.isSelected() && !check27.isSelected() && !check28.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to lo in first!");
            }
            else {
                data1.setProduct_id(74);
                String select = "SELECT name FROM product where product_id = 74";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 74"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check25.isSelected()){
                            size = check25.getText();
                            count++;
                        }

                        if(check26.isSelected()){
                            size = check26.getText();
                            count++;
                        }

                        if(check27.isSelected()){
                            size = check27.getText();
                            count++;
                        }

                        if(check28.isSelected()){
                            size = check28.getText();
                            count++;
                        }
                        if(!check25.isSelected() && !check26.isSelected() && !check27.isSelected() && !check28.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweaters") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(85);
                String select = "SELECT name FROM product where product_id = 85";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweater WHERE product_id = 85"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check25.isSelected()){
                            size = check25.getText();
                            count++;
                        }

                        if(check26.isSelected()){
                            size = check26.getText();
                            count++;
                        }

                        if(check27.isSelected()){
                            size = check27.getText();
                            count++;
                        }

                        if(check28.isSelected()){
                            size = check28.getText();
                            count++;
                        }
                        if(!check25.isSelected() && !check26.isSelected() && !check27.isSelected() && !check28.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Tshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(96);
                String select = "SELECT name FROM product where product_id = 96";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM tshirt WHERE product_id = 96"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check25.isSelected()){
                            size = check25.getText();
                            count++;
                        }

                        if(check26.isSelected()){
                            size = check26.getText();
                            count++;
                        }

                        if(check27.isSelected()){
                            size = check27.getText();
                            count++;
                        }

                        if(check28.isSelected()){
                            size = check28.getText();
                            count++;
                        }
                        if(!check25.isSelected() && !check26.isSelected() && !check27.isSelected() && !check28.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Trousers") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(107);
                String select = "SELECT name FROM product where product_id = 107";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM trousers WHERE product_id = 107"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check25.isSelected()){
                            size = check25.getText();
                            count++;
                        }

                        if(check26.isSelected()){
                            size = check26.getText();
                            count++;
                        }

                        if(check27.isSelected()){
                            size = check27.getText();
                            count++;
                        }

                        if(check28.isSelected()){
                            size = check28.getText();
                            count++;
                        }
                        if(!check25.isSelected() && !check26.isSelected() && !check27.isSelected() && !check28.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Shoes") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(118);
                String select = "SELECT name FROM product where product_id = 118";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM shoes WHERE product_id = 118"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check25.isSelected()){
                            size = check25.getText();
                            count++;
                        }

                        if(check26.isSelected()){
                            size = check26.getText();
                            count++;
                        }

                        if(check27.isSelected()){
                            size = check27.getText();
                            count++;
                        }

                        if(check28.isSelected()){
                            size = check28.getText();
                            count++;
                        }
                        if(!check25.isSelected() && !check26.isSelected() && !check27.isSelected() && !check28.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);
                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Accesories") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                alert.successMessage("The item has been added successfully to the cart!");
                data1.setProduct_id(129);
                String select = "SELECT name FROM product where product_id = 129";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 129"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = resultSet.getString("size");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void product8(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        String name = null;
        if(label.getText() == "Jackets") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(64);
                String select = "SELECT name FROM product where product_id = 64";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 64"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check29.isSelected()){
                            size = check29.getText();
                            count++;
                        }

                        if(check30.isSelected()){
                            size = check30.getText();
                            count++;
                        }

                        if(check31.isSelected()){
                            size = check31.getText();
                            count++;
                        }

                        if(check32.isSelected()){
                            size = check32.getText();
                            count++;
                        }
                        if(!check29.isSelected() && !check30.isSelected() && !check31.isSelected() && !check32.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {
                data1.setProduct_id(75);
                String select = "SELECT name FROM product where product_id = 75";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 75"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check29.isSelected()){
                            size = check29.getText();
                            count++;
                        }

                        if(check30.isSelected()){
                            size = check30.getText();
                            count++;
                        }

                        if(check31.isSelected()){
                            size = check31.getText();
                            count++;
                        }

                        if(check32.isSelected()){
                            size = check32.getText();
                            count++;
                        }
                        if(!check29.isSelected() && !check30.isSelected() && !check31.isSelected() && !check32.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweaters") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(86);
                String select = "SELECT name FROM product where product_id = 86";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweater WHERE product_id = 86"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check29.isSelected()){
                            size = check29.getText();
                            count++;
                        }

                        if(check30.isSelected()){
                            size = check30.getText();
                            count++;
                        }

                        if(check31.isSelected()){
                            size = check31.getText();
                            count++;
                        }

                        if(check32.isSelected()){
                            size = check32.getText();
                            count++;
                        }
                        if(!check29.isSelected() && !check30.isSelected() && !check31.isSelected() && !check32.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Tshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(97);
                String select = "SELECT name FROM product where product_id = 97";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM tshirt WHERE product_id = 97"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check29.isSelected()){
                            size = check29.getText();
                            count++;
                        }

                        if(check30.isSelected()){
                            size = check30.getText();
                            count++;
                        }

                        if(check31.isSelected()){
                            size = check31.getText();
                            count++;
                        }

                        if(check32.isSelected()){
                            size = check32.getText();
                            count++;
                        }
                        if(!check29.isSelected() && !check30.isSelected() && !check31.isSelected() && !check32.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Trousers") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(108);
                String select = "SELECT name FROM product where product_id = 108";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM trousers WHERE product_id = 108"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check29.isSelected()){
                            size = check29.getText();
                            count++;
                        }

                        if(check30.isSelected()){
                            size = check30.getText();
                            count++;
                        }

                        if(check31.isSelected()){
                            size = check31.getText();
                            count++;
                        }

                        if(check32.isSelected()){
                            size = check32.getText();
                            count++;
                        }
                        if(!check29.isSelected() && !check30.isSelected() && !check31.isSelected() && !check32.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Shoes") {

            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(119);
                String select = "SELECT name FROM product where product_id = 119";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM shoes WHERE product_id = 119"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                       String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check29.isSelected()){
                            size = check29.getText();
                            count++;
                        }

                        if(check30.isSelected()){
                            size = check30.getText();
                            count++;
                        }

                        if(check31.isSelected()){
                            size = check31.getText();
                            count++;
                        }

                        if(check32.isSelected()){
                            size = check32.getText();
                            count++;
                        }
                        if(!check29.isSelected() && !check30.isSelected() && !check31.isSelected() && !check32.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Accesories") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                alert.successMessage("The item has been added successfully to the cart!");
                data1.setProduct_id(130);
                String select = "SELECT name FROM product where product_id = 130";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 130"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = resultSet.getString("size");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void product9(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        String name = null;
        if(label.getText() == "Jackets") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(65);
                String select = "SELECT name FROM product where product_id = 65";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 65"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check33.isSelected()){
                            size = check33.getText();
                            count++;
                        }

                        if(check34.isSelected()){
                            size = check34.getText();
                            count++;
                        }

                        if(check35.isSelected()){
                            size = check35.getText();
                            count++;
                        }

                        if(check36.isSelected()){
                            size = check36.getText();
                            count++;
                        }
                        if(!check33.isSelected() && !check34.isSelected() && !check35.isSelected() && !check36.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(76);
                String select = "SELECT name FROM product where product_id = 76";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 76"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check33.isSelected()){
                            size = check33.getText();
                            count++;
                        }

                        if(check34.isSelected()){
                            size = check34.getText();
                            count++;
                        }

                        if(check35.isSelected()){
                            size = check35.getText();
                            count++;
                        }

                        if(check36.isSelected()){
                            size = check36.getText();
                            count++;
                        }
                        if(!check33.isSelected() && !check34.isSelected() && !check35.isSelected() && !check36.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweaters") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(87);
                String select = "SELECT name FROM product where product_id = 87";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweater WHERE product_id = 87"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check33.isSelected()){
                            size = check33.getText();
                            count++;
                        }

                        if(check34.isSelected()){
                            size = check34.getText();
                            count++;
                        }

                        if(check35.isSelected()){
                            size = check35.getText();
                            count++;
                        }

                        if(check36.isSelected()){
                            size = check36.getText();
                            count++;
                        }
                        if(!check33.isSelected() && !check34.isSelected() && !check35.isSelected() && !check36.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Tshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(98);
                String select = "SELECT name FROM product where product_id = 98";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT  image, price, color FROM tshirt WHERE product_id = 98"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check33.isSelected()){
                            size = check33.getText();
                            count++;
                        }

                        if(check34.isSelected()){
                            size = check34.getText();
                            count++;
                        }

                        if(check35.isSelected()){
                            size = check35.getText();
                            count++;
                        }

                        if(check36.isSelected()){
                            size = check36.getText();
                            count++;
                        }
                        if(!check33.isSelected() && !check34.isSelected() && !check35.isSelected() && !check36.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Trousers") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {
                data1.setProduct_id(109);
                String select = "SELECT name FROM product where product_id = 109";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM trousers WHERE product_id = 109"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check33.isSelected()){
                            size = check33.getText();
                            count++;
                        }

                        if(check34.isSelected()){
                            size = check34.getText();
                            count++;
                        }

                        if(check35.isSelected()){
                            size = check35.getText();
                            count++;
                        }

                        if(check36.isSelected()){
                            size = check36.getText();
                            count++;
                        }
                        if(!check33.isSelected() && !check34.isSelected() && !check35.isSelected() && !check36.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Shoes") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(120);
                String select = "SELECT name FROM product where product_id = 120";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM shoes WHERE product_id = 120"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check33.isSelected()){
                            size = check33.getText();
                            count++;
                        }

                        if(check34.isSelected()){
                            size = check34.getText();
                            count++;
                        }

                        if(check35.isSelected()){
                            size = check35.getText();
                            count++;
                        }

                        if(check36.isSelected()){
                            size = check36.getText();
                            count++;
                        }
                        if(!check33.isSelected() && !check34.isSelected() && !check35.isSelected() && !check36.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Accesories") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                alert.successMessage("The item has been added successfully to the cart!");
                data1.setProduct_id(131);
                String select = "SELECT name FROM product where product_id = 131";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 131"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = resultSet.getString("size");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void product10(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        String name = null;
        if(label.getText() == "Jackets") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(66);
                String select = "SELECT name FROM product where product_id = 66";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 66"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check37.isSelected()){
                            size = check37.getText();
                            count++;
                        }

                        if(check38.isSelected()){
                            size = check38.getText();
                            count++;
                        }

                        if(check39.isSelected()){
                            size = check39.getText();
                            count++;
                        }

                        if(check40.isSelected()){
                            size = check40.getText();
                            count++;
                        }
                        if(!check37.isSelected() && !check38.isSelected() && !check39.isSelected() && !check40.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(77);
                String select = "SELECT name FROM product where product_id = 77";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 77"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check37.isSelected()){
                            size = check37.getText();
                            count++;
                        }

                        if(check38.isSelected()){
                            size = check38.getText();
                            count++;
                        }

                        if(check39.isSelected()){
                            size = check39.getText();
                            count++;
                        }

                        if(check40.isSelected()){
                            size = check40.getText();
                            count++;
                        }
                        if(!check37.isSelected() && !check38.isSelected() && !check39.isSelected() && !check40.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweaters") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(88);
                String select = "SELECT name FROM product where product_id = 88";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweater WHERE product_id = 88"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        // data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check37.isSelected()){
                            size = check37.getText();
                            count++;
                        }

                        if(check38.isSelected()){
                            size = check38.getText();
                            count++;
                        }

                        if(check39.isSelected()){
                            size = check39.getText();
                            count++;
                        }

                        if(check40.isSelected()){
                            size = check40.getText();
                            count++;
                        }
                        if(!check37.isSelected() && !check38.isSelected() && !check39.isSelected() && !check40.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Tshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(99);
                String select = "SELECT name FROM product where product_id = 99";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM tshirt WHERE product_id = 99"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check37.isSelected()){
                            size = check37.getText();
                            count++;
                        }

                        if(check38.isSelected()){
                            size = check38.getText();
                            count++;
                        }

                        if(check39.isSelected()){
                            size = check39.getText();
                            count++;
                        }

                        if(check40.isSelected()){
                            size = check40.getText();
                            count++;
                        }
                        if(!check37.isSelected() && !check38.isSelected() && !check39.isSelected() && !check40.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Trousers") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
            data1.setProduct_id(110);
                String select = "SELECT name FROM product where product_id = 110";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            String sql = "SELECT image, price, color FROM trousers WHERE product_id = 110"; // Query to fetch required columns
            try (
                    Connection connection = Database.connectDB();
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(sql)) {

                // Iterate through the result set and populate productList with fetched data
                while (resultSet.next()) {
                    String image = resultSet.getString("image");
                    String price = resultSet.getString("price");
                    String color = resultSet.getString("color");
                    // Create a Product object and add it to the list
                    //data1.setName(name);
                    //data1.setColor(color);
                    //data1.setImage(image);
                    //data1.setSize(size);
                    //data1.setPrice(price);
                    String size = null;
                    Integer count = 0;
                    if(check37.isSelected()){
                        size = check37.getText();
                        count++;
                    }

                    if(check38.isSelected()){
                        size = check38.getText();
                        count++;
                    }

                    if(check39.isSelected()){
                        size = check39.getText();
                        count++;
                    }

                    if(check40.isSelected()){
                        size = check40.getText();
                        count++;
                    }
                    if(!check37.isSelected() && !check38.isSelected() && !check39.isSelected() && !check40.isSelected())
                        alert.errorMessage("Please select one size!");
                    if(count > 1) {
                        alert.errorMessage("Please select only one size!");
                    }
                    if(count == 1){
                        alert.successMessage("The item has been added successfully to the cart!");
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            }
        }

        if(label.getText() == "Shoes") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(121);
                String select = "SELECT name FROM product where product_id = 121";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM shoes WHERE product_id = 121"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check37.isSelected()){
                            size = check37.getText();
                            count++;
                        }

                        if(check38.isSelected()){
                            size = check38.getText();
                            count++;
                        }

                        if(check39.isSelected()){
                            size = check39.getText();
                            count++;
                        }

                        if(check40.isSelected()){
                            size = check40.getText();
                            count++;
                        }
                        if(!check37.isSelected() && !check38.isSelected() && !check39.isSelected() && !check40.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Accesories") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                alert.successMessage("The item has been added successfully to the cart!");
                data1.setProduct_id(132);
                String select = "SELECT name FROM product where product_id = 132";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 132"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = resultSet.getString("size");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void product11(ActionEvent event){
        AlertMessages alert = new AlertMessages();
        String name = null;
        if(label.getText() == "Jackets") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(67);
                String select = "SELECT name FROM product where product_id = 67";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM jacket WHERE product_id = 67"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check41.isSelected()){
                            size = check41.getText();
                            count++;
                        }

                        if(check42.isSelected()){
                            size = check42.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }
                        if(!check41.isSelected() && !check42.isSelected() && !check43.isSelected() && !check44.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweatshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(78);
                String select = "SELECT name FROM product where product_id = 78";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweatshirt WHERE product_id = 78"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        // data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check41.isSelected()){
                            size = check41.getText();
                            count++;
                        }

                        if(check42.isSelected()){
                            size = check42.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }
                        if(!check41.isSelected() && !check42.isSelected() && !check43.isSelected() && !check44.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Sweaters") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(89);
                String select = "SELECT name FROM product where product_id = 89";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM sweater WHERE product_id = 89"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check41.isSelected()){
                            size = check41.getText();
                            count++;
                        }

                        if(check42.isSelected()){
                            size = check42.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }
                        if(!check41.isSelected() && !check42.isSelected() && !check43.isSelected() && !check44.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Tshirts") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {

                data1.setProduct_id(100);
                String select = "SELECT name FROM product where product_id = 100";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM tshirt WHERE product_id = 100"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check41.isSelected()){
                            size = check41.getText();
                            count++;
                        }

                        if(check42.isSelected()){
                            size = check42.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }
                        if(!check41.isSelected() && !check42.isSelected() && !check43.isSelected() && !check44.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Trousers") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(111);
                String select = "SELECT name FROM product where product_id = 111";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM trousers WHERE product_id = 111"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check41.isSelected()){
                            size = check41.getText();
                            count++;
                        }

                        if(check42.isSelected()){
                            size = check42.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }
                        if(!check41.isSelected() && !check42.isSelected() && !check43.isSelected() && !check44.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Shoes") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            }
            else {
                data1.setProduct_id(122);
                String select = "SELECT name FROM product where product_id = 122";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color FROM shoes WHERE product_id = 122"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        String size = null;
                        Integer count = 0;
                        if(check41.isSelected()){
                            size = check41.getText();
                            count++;
                        }

                        if(check42.isSelected()){
                            size = check42.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }

                        if(check43.isSelected()){
                            size = check43.getText();
                            count++;
                        }
                        if(!check41.isSelected() && !check42.isSelected() && !check43.isSelected() && !check44.isSelected())
                            alert.errorMessage("Please select one size!");
                        if(count > 1) {
                            alert.errorMessage("Please select only one size!");
                        }
                        if(count == 1){
                            alert.successMessage("The item has been added successfully to the cart!");
                            Product product = new Product(name, size, color, price, image);
                            DataSingleton2.getInstance().addToCart(product);

                            Connection connect = null;


                            try {
                                // Establish the database connection
                                connect = Database.connectDB();

                                // Check if the connection is successfully established
                                if (connect != null) {
                                    String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                    try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                        //LocalDateTime currentDate = LocalDateTime.now();
                                        //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                        getUserId();
                                        //prepare.setTimestamp(1, timestamp);
                                        prepare.setInt(1, data1.getProduct_id());
                                        prepare.setString(2, size);
                                        prepare.setInt(3, data.getUser_id());
                                        prepare.setString(4, name);
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
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if(label.getText() == "Accesories") {
            if (data.getUsername() == null) {
                alert.errorMessage("You have to log in first!");
            } else {
                alert.successMessage("The item has been added successfully to the cart!");
                data1.setProduct_id(133);
                String select = "SELECT name FROM product where product_id = 133";
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(select)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        name = resultSet.getString("name");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String sql = "SELECT image, price, color, size FROM accesories WHERE product_id = 133"; // Query to fetch required columns
                try (
                        Connection connection = Database.connectDB();
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {

                    // Iterate through the result set and populate productList with fetched data
                    while (resultSet.next()) {
                        String image = resultSet.getString("image");
                        String price = resultSet.getString("price");
                        String color = resultSet.getString("color");
                        String size = resultSet.getString("size");

                        // Create a Product object and add it to the list
                        //data1.setName(name);
                        //data1.setColor(color);
                        //data1.setImage(image);
                        //data1.setSize(size);
                        //data1.setPrice(price);
                        Product product = new Product(name, size, color, price, image);
                        DataSingleton2.getInstance().addToCart(product);

                        Connection connect = null;


                        try {
                            // Establish the database connection
                            connect = Database.connectDB();

                            // Check if the connection is successfully established
                            if (connect != null) {
                                String insertData = "INSERT INTO order_items (product_id, size, user_id, product_name) VALUES (?, ?, ?, ?)";
                                try (PreparedStatement prepare = connect.prepareStatement(insertData)) {
                                    //LocalDateTime currentDate = LocalDateTime.now();
                                    //java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(currentDate);
                                    getUserId();
                                    //prepare.setTimestamp(1, timestamp);
                                    prepare.setInt(1, data1.getProduct_id());
                                    prepare.setString(2, size);
                                    prepare.setInt(3, data.getUser_id());
                                    prepare.setString(4, name);
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
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(data.getUsername() != null)
            welcome.setText("Welcome " + data.getUsername());
        else
            welcome.setText("Welcome");
    }

}
