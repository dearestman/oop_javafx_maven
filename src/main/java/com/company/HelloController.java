package com.company;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.company.domain.users.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField passwordFieldPassword;

    @FXML
    private Text textError;

    @FXML
    private TextField textFieldLogin;

    @FXML
    private Label welcomeText;

    @FXML
    void onButtonSingIn(ActionEvent event) throws SQLException {
        User user = User.authorization(textFieldLogin.getText(),passwordFieldPassword.getText());
        

    }

    @FXML
    void initialize() {
        assert passwordFieldPassword != null : "fx:id=\"passwordFieldPassword\" was not injected: check your FXML file 'authorization.fxml'.";
        assert textError != null : "fx:id=\"textError\" was not injected: check your FXML file 'authorization.fxml'.";
        assert textFieldLogin != null : "fx:id=\"textFieldLogin\" was not injected: check your FXML file 'authorization.fxml'.";
        assert welcomeText != null : "fx:id=\"welcomeText\" was not injected: check your FXML file 'authorization.fxml'.";

    }

}
