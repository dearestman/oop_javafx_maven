package com.company;

import com.company.domain.MyDate;
import com.company.domain.address.Address;
import com.company.domain.address.Locality;
import com.company.domain.documents.CertificateOfBirth;
import com.company.domain.documents.Passport;
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

        ArrayList<Address> addresses = Address.selectAllAddresses();
        for (Address address:addresses
             ) {
            System.out.print(address.getAddressLocality().getCountry()+ " ");
            System.out.print(address.getAddressStreet()+" ");
            System.out.print(address.getAddressHouse());
            System.out.println();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        String date = "16.08.2016";
// конвертируем String в LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);

//        Passport.insertPassport(localDate,"Отделом УФМС в г. Северодвинске","2222",
//                "3333 33", 3);

        LocalDate dateIssue = MyDate.covertStringToLocalDate("17.01.2017");
        LocalDate dateBirthday = MyDate.covertStringToLocalDate("17.06.1997");

        Client.insertClient(dateIssue,"Отделом УФМС В г. Северодвинске", "4444", "123456",
                addresses.get(1).getAddressId(),"Ступаков","Дмитрий", "Леонидович", dateBirthday,
                null,null, addresses.get(1), "89911140456", "Stupakov.dmitriy@gmail.com");


    }
}
