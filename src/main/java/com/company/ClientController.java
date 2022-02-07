package com.company;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.company.domain.users.Adult;
import com.company.domain.users.TestUser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ClientController {
    private ObservableList<TestUser> usersData = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addClientButton;

    @FXML
    private Button deleteClientButton;

    @FXML
    private TableColumn<TestUser, String> documentColumn;

    @FXML
    private TableColumn<TestUser, String> firstNameColumn;

    @FXML
    private TableColumn<TestUser, String> lastNameColumn;

    @FXML
    private TableView<TestUser> tableViewsClients;

    @FXML
    void addClientButtonOnAction(ActionEvent event) {

    }

    @FXML
    void deleteClientButtonOnAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        initData();

        // устанавливаем тип и значение которое должно хранится в колонке
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<TestUser, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<TestUser, String>("lastName"));
        documentColumn.setCellValueFactory(new PropertyValueFactory<TestUser, String>("patronymic"));

        // заполняем таблицу данными
        tableViewsClients.setItems(usersData);

    }

    private void initData() {
        TestUser testUser1 = new TestUser("Stupakov", "Dmitriy", "Leonidovich");
        TestUser testUser2 = new TestUser("Stupakov", "Dmitriy", "Leonidovich");
        TestUser testUser3 = new TestUser("Stupakov", "Dmitriy", "Leonidovich");
        TestUser testUser4 = new TestUser("Stupakov", "Dmitriy", "Leonidovich");

//        ArrayList<Adult> adults = Adult.selectAllAdults();
//        for (Adult adult:adults
//        ) {
//            usersData.add(adult);
//        }

        usersData.add(testUser1);
        usersData.add(testUser2);
        usersData.add(testUser3);
        usersData.add(testUser4);
    }

}
