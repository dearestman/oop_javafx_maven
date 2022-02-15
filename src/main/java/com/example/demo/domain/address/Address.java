package com.example.demo.domain.address;

import com.example.demo.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Address {
    private int addressId;
    private Locality addressLocality;
    private String addressStreet;
    private String addressHouse;
    private String addressExtension;
    private String addressApartment;

    public Address(int addressId, String addressStreet, String addressHouse, String addressExtension, String addressApartment, Locality addressLocality) {
        this.addressId = addressId;
        this.addressLocality = addressLocality;
        this.addressStreet = addressStreet;
        this.addressHouse = addressHouse;
        this.addressExtension = addressExtension;
        this.addressApartment = addressApartment;
    }

    public Address(int addressId, String addressStreet, String addressHouse, Locality addressLocality) {
        this.addressId = addressId;
        this.addressLocality = addressLocality;
        this.addressStreet = addressStreet;
        this.addressHouse = addressHouse;
    }



    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public Locality getAddressLocality() {
        return addressLocality;
    }

    public void setAddressLocality(Locality addressLocality) {
        this.addressLocality = addressLocality;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public String getAddressExtension() {
        return addressExtension;
    }

    public void setAddressExtension(String addressExtension) {
        this.addressExtension = addressExtension;
    }

    public String getAddressApartment() {
        return addressApartment;
    }

    public void setAddressApartment(String addressApartment) {
        this.addressApartment = addressApartment;
    }

    //SQL

    public static void insertAddress(String addressStreet, String addressHouse,
                                     String addressExtension, String addressApartment,
                                     Locality addressLocality) throws SQLException {

        try {
            Connection con = Database.getConnection();
            Statement stmt = con.createStatement();
            String rs = "INSERT INTO \"Addresses\" (street, house, extension, apartment, locality) " +
                    "VALUES ('"+addressStreet+"', '"+addressHouse+"', '"+addressExtension+"', " +
                    "'"+addressApartment+"', '"+addressLocality.getLocalityId()+"')";

            stmt.executeUpdate(rs);
            stmt.close();
            con.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static ArrayList<Address> selectAllAddresses(){
        ArrayList<Address> addresses = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("" +
                        "SELECT *\n" +
                        "FROM \"Addresses\" \n" +
                        "INNER JOIN \"Localities\" ON \"Addresses\".locality = \"Localities\".id");

                while (rs.next()) {

                    int id = rs.getInt("id");
                    String street = rs.getString("street");
                    String house = rs.getString("house");
                    String extension = rs.getString("extension");
                    String apartment = rs.getString("apartment");

                    int localityId = rs.getInt("locality");
                    String country = rs.getString("country");
                    String region = rs.getString("region");
                    String inhabited = rs.getString("inhabited");
                    Locality locality = new Locality(localityId,country,region,inhabited);

                    Address address = new Address(id,street,house,extension,apartment,locality);
                    addresses.add(address);
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addresses;
    }

    public static void deleteAddress(int addressId){
        try {
            Connection con = Database.getConnection();
            Statement stmt = con.createStatement();
            String rs = "DELETE FROM \"Addresses\" " +
                    "WHERE id="+addressId+"";

            stmt.executeUpdate(rs);
            stmt.close();
            con.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //SQL
}

