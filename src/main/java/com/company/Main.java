package com.company;

import com.company.domain.MyDate;
import com.company.domain.address.Address;
import com.company.domain.address.Locality;
import com.company.domain.documents.CertificateOfBirth;
import com.company.domain.documents.Passport;
import com.company.domain.users.Adult;
import com.company.domain.users.Client;
import com.company.domain.users.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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

    public static void main(String[] args) throws SQLException {

        User user = User.authorization("petrov.p", "123");
        System.out.println(user.getFirstName());
        ArrayList<Adult> adults = Adult.selectAllAdults();
        for (Adult adult:adults
             ) {
            System.out.println(adult.getFirstName() + " " + adult.getLastName());
        }
    }
}
