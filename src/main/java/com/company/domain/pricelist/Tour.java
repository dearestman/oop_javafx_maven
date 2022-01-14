package com.company.domain.pricelist;

import java.util.List;

public class Tour {

    private int tourId;
    private String tourName;
    private List<HotelRoom> tourHotelRooms;

    public Tour(int tourId, String tourName, List<HotelRoom> tourHotelRooms) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.tourHotelRooms = tourHotelRooms;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public List<HotelRoom> getTourHotelRooms() {
        return tourHotelRooms;
    }

    public void setTourHotelRooms(List<HotelRoom> tourHotelRooms) {
        this.tourHotelRooms = tourHotelRooms;
    }
}
