package com.company.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TestController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label welcomeText;

    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert welcomeText != null : "fx:id=\"welcomeText\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
