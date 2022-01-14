package com.company.domain.users;

import com.company.domain.pricelist.Hotel;
import com.company.domain.address.Locality;
import com.company.domain.pricelist.Price;
import com.company.domain.pricelist.Tour;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public class Operator extends User implements UserRights {

    @Override
    public int getUserRight() {
        return super.getUserRight()+2;
    }




    public Operator(int userID, String firstName, String lastName, String patronymic, LocalDate birthday, String login, String password) {
        super(userID, firstName, lastName, patronymic, birthday, login, password);
    }

    //    #################
    //      Hotel
    //    #################
    public void insertHotel(String hotelName, Locality locality) throws SQLException {

    }

    public void updateHotel(int hotelId, String hotelName, Locality locality) throws SQLException {

    }

    public void deleteHotel(int hotelId) throws SQLException {

    }


    public List<Hotel> getAllHotels() throws SQLException {

        return null;
    }

    public  List<Hotel> getAllHotelsInLocality(Locality locality){
        return null;
    }
    //    #################
    //      Hotel
    //    #################



    //    #################
    //      Locality
    //    #################
    public void insertLocality(String localityName) throws SQLException {

    }

    public void updateLocality(int localityId, String localityName) throws SQLException {

    }

    public void deleteLocality(int localityId) throws SQLException {

    }


    public List<Locality> getAllLocalities() throws SQLException {

        return null;
    }
    //    #################
    //      Locality
    //    #################



    //    #################
    //      Tour
    //    #################
    public void insertTour(String tourName, List<Locality> tourLocalities) throws SQLException {

    }

    public void updateTour(int tourId, String tourName, List<Locality> tourLocalities) throws SQLException {

    }

    public void deleteTour(int toruId) throws SQLException {

    }

    public List<Tour> getAllTours() throws SQLException {

        return null;
    }
    //    #################
    //      Tour
    //    #################



    //    #################
    //      Price
    //    #################
    public void insertPrice(Tour tour, double priceTour) throws SQLException {

    }

    public void updatePrice(int priceId, Tour tour, double tourPrice) throws SQLException {

    }

    public void deletePrice(int priceId) throws SQLException {

    }

    public List<Price> getToursOnDate(Tour tour, Date tourDate) throws SQLException {

        return null;
    }

    public List<Price> getAllToursOnDate(Date tourDate) throws SQLException {

        return null;
    }


    //    #################
    //      Price
    //    #################





}
