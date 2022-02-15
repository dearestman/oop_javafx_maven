package com.example.demo;

import com.example.demo.domain.users.Adult;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ClientsController implements Initializable {

    @FXML
    private Button addClientButton;

    @FXML
    private TableView<TestUser> clientsTable;

    @FXML
    private Button deleteClientbutton;

    @FXML
    private TableColumn<TestUser, String> firstNameColumn;

    @FXML
    private Label helloField;

    @FXML
    private TableColumn<TestUser, String> lastNameColumn;

    @FXML
    private TableColumn<TestUser, String> patronymicColumn;

    @FXML
    void addClientButtonOnAction(ActionEvent event) {

    }

    @FXML
    void deleteClientButtonOnAction(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<TestUser,String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<TestUser,String>("lastName"));
        patronymicColumn.setCellValueFactory(new PropertyValueFactory<TestUser,String>("patronymic"));
        clientsTable.setItems(returnObsList());
    }

    private ObservableList<TestUser> returnObsList(){
        ArrayList<Adult> clients = Adult.selectAllAdults();
        ObservableList<TestUser> list = FXCollections.observableArrayList();
        for (Adult client:clients
             ) {
            list.add(new TestUser(client.getFirstName(),client.getLastName(),client.getPatronymic()));
        }
        return list;
    }
}
