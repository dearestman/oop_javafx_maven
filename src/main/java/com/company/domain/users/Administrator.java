package com.company.domain.users;


import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public class Administrator extends User implements UserRights{

    @Override
    public int getUserRight() {
        return super.getUserRight()+1;
    }

    public Administrator(int userID, String firstName, String lastName, String patronymic, LocalDate birthday, String login, String password) {
        super(userID, firstName, lastName, patronymic, birthday, login, password);
    }



    //    #################
//      User
//    #################
//    public void insertUSer(String firstName, String lastName, Date birthday, String login, String password) throws SQLException {
    public void insertUSer(String firstName, String lastName, Date birthday, String login, String password) throws SQLException {

    }

    public void updateUser(int userId, String firstName, String lastName, Date birthday, String login, String password) throws SQLException {

    }

    public void deleteUser(int userId) throws SQLException {

    }


    public List<User> getAllUsers(){
        return null;
    }



    //    #################
    //      User
    //    #################

}
