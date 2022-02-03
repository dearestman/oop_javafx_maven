package com.company;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button clientButton;

    @FXML
    private Button orderButton;

    @FXML
    private Button tourButton;

    @FXML
    void initialize() {
        assert clientButton != null : "fx:id=\"clientButton\" was not injected: check your FXML file 'main.fxml'.";
        assert orderButton != null : "fx:id=\"orderButton\" was not injected: check your FXML file 'main.fxml'.";
        assert tourButton != null : "fx:id=\"tourButton\" was not injected: check your FXML file 'main.fxml'.";

    }

}
