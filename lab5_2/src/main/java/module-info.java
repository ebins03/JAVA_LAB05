module com.example.lab5_ {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.lab5_2 to javafx.fxml;
    exports com.example.lab5_2;
}