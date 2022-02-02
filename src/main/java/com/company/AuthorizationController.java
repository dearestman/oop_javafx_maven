package com.company;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.company.domain.users.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AuthorizationController {

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
    void onButtonSingIn(ActionEvent event) throws SQLException, IOException {
        User user = User.authorization(textFieldLogin.getText(), passwordFieldPassword.getText());
        if (user==null){
            textError.setVisible(true);
            textFieldLogin.setText("");
            passwordFieldPassword.setText("");
        }else {
            textError.setVisible(false);
            textFieldLogin.setText("");
            passwordFieldPassword.setText("");

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("hello-view.fxml"));
            loader.load();

            Parent root  = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        }
    }

    @FXML
    void initialize() {
        assert passwordFieldPassword != null : "fx:id=\"passwordFieldPassword\" was not injected: check your FXML file 'authorization.fxml'.";
        assert textError != null : "fx:id=\"textError\" was not injected: check your FXML file 'authorization.fxml'.";
        assert textFieldLogin != null : "fx:id=\"textFieldLogin\" was not injected: check your FXML file 'authorization.fxml'.";
        assert welcomeText != null : "fx:id=\"welcomeText\" was not injected: check your FXML file 'authorization.fxml'.";

    }

}
