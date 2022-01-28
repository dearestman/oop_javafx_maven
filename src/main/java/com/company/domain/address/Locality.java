package com.company.domain.address;

import com.company.Database;
import com.company.domain.users.Operator;
import com.company.domain.users.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class Locality {
    private int localityId;
    private String country;
    private String region;
    private String inhabitedLocality; //населенынй пункт

    public Locality(int localityId, String country, String region, String inhabitedLocality) {
        this.localityId = localityId;
        this.country = country;
        this.region = region;
        this.inhabitedLocality = inhabitedLocality;
    }

    public int getLocalityId() {
        return localityId;
    }

    public void setLocalityId(int localityId) {
        this.localityId = localityId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getInhabitedLocality() {
        return inhabitedLocality;
    }

    public void setInhabitedLocality(String inhabitedLocality) {
        this.inhabitedLocality = inhabitedLocality;
    }

    public static void insertLocality(String country, String region, String inhabitedLocality) throws SQLException {

            try {
                Connection con = Database.getConnection();
                Statement stmt = con.createStatement();
                String rs = "INSERT INTO \"Localities\" (country, region, inhabited) " +
                        "VALUES ('"+country+"', '"+region+"', '"+inhabitedLocality+"')";

                stmt.executeUpdate(rs);
                stmt.close();
                con.close();
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }

    }

    public static ArrayList<Locality> selectAllLocalities(){
        ArrayList<Locality> localities = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("" +
                        "SELECT * " +
                        "FROM \"Localities\" ");

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String country = rs.getString("country");
                    String region = rs.getString("region");
                    String inhabited = rs.getString("inhabited");
                    Locality locality = new Locality(id,country,region,inhabited);
                    localities.add(locality);
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return localities;
    }

    public static void deleteLocality(int localityId){
        try {
            Connection con = Database.getConnection();
            Statement stmt = con.createStatement();
            String rs = "DELETE FROM \"Localities\" " +
                    "WHERE id="+localityId+"";

            stmt.executeUpdate(rs);
            stmt.close();
            con.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
