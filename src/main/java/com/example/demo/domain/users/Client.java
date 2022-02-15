package com.example.demo.domain.users;

import com.example.demo.Database;
import com.example.demo.domain.MyDate;
import com.example.demo.domain.address.Address;
import com.example.demo.domain.documents.Document;
import com.example.demo.domain.documents.Passport;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Client extends User implements UserRights{

    @Override
    public int getUserRight() {
        return super.getUserRight()+3;
    }

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
                  LocalDate birthday, String login, String password,
                  String clientTelephone, String clientMail) {
        super(userID, firstName, lastName, patronymic, birthday, login, password);
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

    public static void insertClient(LocalDate dateOfIssue, String issuedBy, String serial,
                                      String number, int addressRegistration, String firstName, String lastName, String patronymic,
                                    LocalDate birthday, String login, String password, Address clientAddress,
                                    String clientTelephone, String clientMail) throws SQLException {

        Passport.insertPassport(dateOfIssue,issuedBy,serial,number,addressRegistration);

        int passportId = Passport.getPassportId(dateOfIssue,issuedBy,serial,number,addressRegistration);
        String stringBirthday = MyDate.covertLocalDateToString(birthday);


        try {
            Connection con = Database.getConnection();
            Statement stmt = con.createStatement();
            String rs = "INSERT INTO \"Users\" (" +
                    "\"firstName\", \"lastName\", patronymic, " +
                    "birthday, login, password, \"typeOfUser\", " +
                    "address, telephone, mail, document) " +
                    "VALUES ('"+firstName+"', '"+lastName+"', '"+patronymic+"'" +
                    ", '"+birthday+"', '"+login+"', '"+password+"'" +
                    ", 2, '"+addressRegistration+"', '"+clientTelephone+"'" +
                    ", '"+clientMail+"', "+passportId+")";

            stmt.executeUpdate(rs);
            stmt.close();
            con.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
