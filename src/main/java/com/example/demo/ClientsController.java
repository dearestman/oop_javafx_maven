package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class ClientsController {

    @FXML
    private Button addClientButton;

    @FXML
    private TableView<?> clientsTable;

    @FXML
    private Button deleteClientbutton;

    @FXML
    private ComboBox<?> filtrComboBox;

    @FXML
    private TableColumn<?, ?> firstNameColumn;

    @FXML
    private Label helloField;

    @FXML
    private TableColumn<?, ?> lastNameColumn;

    @FXML
    private TableColumn<?, ?> patronymicColumn;

    @FXML
    private TableColumn<?, ?> patronymicColumn1;

    @FXML
    private TextField searchClientField;

    @FXML
    void addClientButtonOnAction(ActionEvent event) {

    }

    @FXML
    void deleteClientButtonOnAction(ActionEvent event) {

    }

    @FXML
    void searchClientOnKeyPressed(KeyEvent event) {

    }

}
