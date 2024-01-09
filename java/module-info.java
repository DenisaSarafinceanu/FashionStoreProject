module com.example.fashionstore {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.fashionstore to javafx.fxml;
    exports com.example.fashionstore;
}