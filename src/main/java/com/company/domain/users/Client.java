package com.company.domain.users;

import com.company.Database;
import com.company.domain.address.Address;
import com.company.domain.documents.Document;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class Client extends User implements UserRights{

    @Override
    public int getUserRight() {
        return super.getUserRight()+3;
    }

    private Address clientAddress;
    private String clientTelephone;
    private String clientMail;
//    private HashMap<String,Double> ClientBankAccounts = new HashMap<String, Double>();

//    public HashMap<String, Double> getClientBankAccounts() {
//        return ClientBankAccounts;
//    }
//
//    public void setClientBankAccounts(HashMap<String, Double> clientBankAccounts) {
//        ClientBankAccounts = clientBankAccounts;
//    }

    public Client(int userID, String firstName, String lastName, String patronymic,
                  LocalDate birthday, String login, String password, Address clientAddress,
                  String clientTelephone, String clientMail) {
        super(userID, firstName, lastName, patronymic, birthday, login, password);
        this.clientAddress = clientAddress;
        this.clientTelephone = clientTelephone;
        this.clientMail = clientMail;
//        this.ClientBankAccounts=clientBankAccounts;
    }


    public static Document getClientDocument(Adult adult){
        return adult.getClientPassport();
    }
    public static Document getClientDocument(Child adult){
        return adult.getCertificateOfBirth();
    }

    public Address getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(Address clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientTelephone() {
        return clientTelephone;
    }

    public void setClientTelephone(String clientTelephone) {
        this.clientTelephone = clientTelephone;
    }

    public String getClientMail() {
        return clientMail;
    }

    public void setClientMail(String clientMail) {
        this.clientMail = clientMail;
    }


}
