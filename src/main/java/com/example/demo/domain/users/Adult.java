package com.example.demo.domain.users;

import com.example.demo.Database;
import com.example.demo.domain.MyDate;
import com.example.demo.domain.address.Address;
import com.example.demo.domain.address.Locality;
import com.example.demo.domain.documents.Document;
import com.example.demo.domain.documents.Passport;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class Adult extends Client{


    private Passport clientPassport;
    public Adult(int userID, String firstName, String lastName, String patronymic,
                 LocalDate birthday, String login, String password,
                 String clientTelephone, String clientMail, Passport clientPassport) {
        super(userID, firstName, lastName, patronymic, birthday,
                login, password, clientTelephone, clientMail);
        this.clientPassport = clientPassport;
    }
    public Document checkUserDocument(){
        System.out.println("У данного клиента паспорт");
        return this.clientPassport;
    }



    public Passport getClientPassport() {
        return clientPassport;
    }

    public void setClientPassport(Passport clientPassport) {
        this.clientPassport = clientPassport;
    }

    //SQL


    public static ArrayList<Adult> selectAllAdults(){
        ArrayList<Adult> adults = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("" +
                        "SELECT * " +
                        "FROM \"Users\" " +
                        "JOIN \"Documents\" ON \"Users\".document=\"Documents\".id " +
                        "JOIN \"Addresses\" ON \"Documents\".\"addressRegistration\"=\"Addresses\".id " +
                        "JOIN \"Localities\" ON \"Addresses\".locality=\"Localities\".id");


                while (rs.next()) {

                    int localityId = rs.getInt("locality");
                    String country = rs.getString("country");
                    String region = rs.getString("region");
                    String inhabited = rs.getString("inhabited");
                    Locality locality = new Locality(localityId,country,region,inhabited);

                    int addressId = rs.getInt("addressRegistration");
                    String street = rs.getString("street");
                    String house = rs.getString("house");
                    String extension = rs.getString("extension");
                    String apartment = rs.getString("apartment");
                    Address addressRegistration = new Address(addressId,street,house,extension,apartment,locality);

                    int documentId = rs.getInt("document");
                    String dateOfIssue = rs.getString("dateOfIssue");
                    LocalDate localDateOfIssue = MyDate.covertStringToLocalDate(dateOfIssue,"yyyy-MM-dd");
                    String issuedBy = rs.getString("issuedBy");
                    String documentType = rs.getString("documentType");
                    String serial = rs.getString("serial");
                    String number = rs.getString("number");
                    Passport passport = new Passport(documentId,localDateOfIssue,issuedBy,serial,number,addressRegistration);


                    int clientId = rs.getInt("id");
                    String firstName = rs.getString("firstName");
                    String lastName = rs.getString("lastName");
                    String patronymic = rs.getString("patronymic");
                    String birthday = rs.getString("birthday");
                    LocalDate localBirthday = MyDate.covertStringToLocalDate(birthday,"yyyy-MM-dd");
                    String login = rs.getString("login");
                    String password = rs.getString("password");
                    String telephone = rs.getString("telephone");
                    String mail = rs.getString("mail");

                    Adult adult = new Adult(clientId,firstName,lastName, patronymic,
                                    localBirthday, login, password, telephone, mail, passport);
                    int typeOfUser = 3;

                    adults.add(adult);


                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return adults;
    }


    //SQL
}
