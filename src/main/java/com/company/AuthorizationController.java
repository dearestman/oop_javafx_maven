package com.company;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.company.controllers.MainController;
import com.company.domain.animations.Shake;
import com.company.domain.users.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.Node;

public class AuthorizationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button singUpButton;

    @FXML
    void singIn(ActionEvent event) throws IOException, SQLException {
        User user = User.authorization(loginField.getText(),passwordField.getText());
        if (user==null || loginField.getText().equals("") || passwordField.getText().equals("")){
            Shake userLoginAnimation = new Shake(loginField);
            Shake userPasswordAnimation = new Shake(passwordField);
            userLoginAnimation.playAnim();
            userPasswordAnimation.playAnim();

        } else {

            singUpButton.getScene().getWindow().hide();
            MainController.setAuthorizedUser(user);
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("main.fxml"));

            loader.load();

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.showAndWait();


        }


    }


    @FXML
    void initialize() {

    }

}
