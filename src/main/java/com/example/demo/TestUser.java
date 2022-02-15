package com.example.demo;

import javafx.beans.property.SimpleStringProperty;

public class TestUser {
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty patronymic;

    public TestUser(String firstName, String lastName, String patronymic) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.patronymic = new SimpleStringProperty(patronymic);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public String getPatronymic() {
        return patronymic.get();
    }
}
