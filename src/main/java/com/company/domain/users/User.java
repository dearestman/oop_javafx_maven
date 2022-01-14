/**
 * @author Stupakov Dmitriy
 * @version 1.0
 */

package com.company.domain.users;

import com.company.Database;
import com.company.domain.documents.Document;

import java.sql.*;
import java.time.LocalDate;

public abstract class User implements UserRights {
    private int userID;
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthday;
    private String login;
    private String password;
    private int typeOfUser=0;


    public User(int userID, String firstName, String lastName, String patronymic,
                LocalDate birthday, String login, String password) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.login = login;
        this.password = password;

    }

    public int getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(int typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Document checkUserDocument(){
        return null;
    }

    public static User authorization(String login, String password) throws SQLException {
        User user = null;
        try {
            Connection con = Database.getConnection();
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("" +
                        "SELECT * " +
                        "FROM \"Users\" " +
                        "WHERE login='"+login+"' AND password='"+password+"'");

                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String firstName = rs.getString("firstName");
                        String lastName = rs.getString("lastName");
                        String patronymic = rs.getString("patronymic");
                        LocalDate birthday = null;
                        int typeOfUser = rs.getInt("typeOfUser");
                        if (typeOfUser==2)
                            user = new Operator(id, firstName,lastName,patronymic,birthday,login,password);
                        else
                            user = null;
                    }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }


    @Override
    public int getUserRight() {
        return typeOfUser;
    }


}
