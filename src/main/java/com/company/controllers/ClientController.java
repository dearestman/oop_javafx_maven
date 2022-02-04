package com.company.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import com.company.domain.users.Client;
import com.company.domain.users.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ClientController {
    private ObservableList<Client> clientsData = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addClientButton;

    @FXML
    private Button deleteClientButton;

    @FXML
    void addClientButtonOnAction(ActionEvent event) {

    }

    @FXML
    void deleteClientButtonOnAction(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    private void initData(){

    }

}
