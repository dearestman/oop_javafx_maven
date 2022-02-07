package com.company;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.company.domain.users.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController {

    private static User authorizedUser;

    public static User getAuthorizedUser() {
        return authorizedUser;
    }

    public static void setAuthorizedUser(User authorizedUser) {
        MainController.authorizedUser = authorizedUser;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button clientButton;

    @FXML
    private Label helloField;

    @FXML
    private Button orderButton;

    @FXML
    private Button tourButton;

    @FXML
    void onActionClients(ActionEvent event) throws IOException {
        clientButton.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("clients.fxml"));

        loader.load();

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.showAndWait();
    }

    @FXML
    void initialize() {

    }

}
