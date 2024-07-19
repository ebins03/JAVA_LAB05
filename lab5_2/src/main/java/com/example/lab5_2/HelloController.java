package com.example.lab5_2;

import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    public void parseJSON() {
        String jsonString = "{\"productID\":\"102\",\"productName\":Laptop,\"orderDate\":\"17/07/2024,\",\"manufacturer\":Lenovo\"}";

        Gson gson = new Gson();

        Product product = gson.fromJson(jsonString, Product.class);

        System.out.println("Product ID: " + product.productID);
        System.out.println("Product Name: " + product.productName);
        System.out.println("Order Date: " + product.orderDate);
        System.out.println("Manufacturer: " + product.manufacturer);


        String jsonOutput = gson.toJson(product);
        System.out.println("The output for JSON " + jsonOutput);


    }
}