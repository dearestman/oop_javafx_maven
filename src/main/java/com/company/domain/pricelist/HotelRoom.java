package com.company.domain.pricelist;

public class HotelRoom {
    private int hotelRoomId;
    private String hotelRoomNumber;
    private int hotelRoomStars; //необходимо сделать перечесление 1,2,3,4,5,0
    private Hotel hotelRoomHotel;
    private String hotelRoomTypeOfFood; //необходимо сделать перечесление: Все включено, завтрак, завтрак и ужин, трехразовое питание)

    public HotelRoom(int hotelRoomId, String hotelRoomNumber, int hotelRoomStars, Hotel hotelRoomHotel, String hotelRoomTypeOfFood) {
        this.hotelRoomId = hotelRoomId;
        this.hotelRoomNumber = hotelRoomNumber;
        this.hotelRoomStars = hotelRoomStars;
        this.hotelRoomHotel = hotelRoomHotel;
        this.hotelRoomTypeOfFood = hotelRoomTypeOfFood;
    }

    public int getHotelRoomId() {
        return hotelRoomId;
    }

    public void setHotelRoomId(int hotelRoomId) {
        this.hotelRoomId = hotelRoomId;
    }

    public String getHotelRoomNumber() {
        return hotelRoomNumber;
    }

    public void setHotelRoomNumber(String hotelRoomNumber) {
        this.hotelRoomNumber = hotelRoomNumber;
    }

    public int getHotelRoomStars() {
        return hotelRoomStars;
    }

    public void setHotelRoomStars(int hotelRoomStars) {
        this.hotelRoomStars = hotelRoomStars;
    }

    public Hotel getHotelRoomHotel() {
        return hotelRoomHotel;
    }

    public void setHotelRoomHotel(Hotel hotelRoomHotel) {
        this.hotelRoomHotel = hotelRoomHotel;
    }

    public String getHotelRoomTypeOfFood() {
        return hotelRoomTypeOfFood;
    }

    public void setHotelRoomTypeOfFood(String hotelRoomTypeOfFood) {
        this.hotelRoomTypeOfFood = hotelRoomTypeOfFood;
    }
}
