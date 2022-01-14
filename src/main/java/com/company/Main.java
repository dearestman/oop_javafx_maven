package com.company;

import com.company.domain.users.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private void testDatabase() {
//        try {
//
//            Connection con = Database.getConnection();
//            try {
//                Statement stmt = con.createStatement();
//                ResultSet rs = stmt.executeQuery("SELECT * FROM \"Users\"");
//                while (rs.next()) {
//                    String str = rs.getString("firstName") + " " +
//                            rs.getString("lastName");
//                    System.out.println("Contact:" + str);
//                }
//                rs.close();
//                stmt.close();
//            } finally {
//                con.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) {

        try {
            User user = User.authorization("petrov.p", "123");
            if (user!=null)
                System.out.println(user.getFirstName()+ " " + user.getLastName());
            else
                System.out.println("Такого пользователя не существует");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
