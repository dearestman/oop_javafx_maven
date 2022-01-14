

package com.company.domain.pricelist;

import com.company.domain.address.Address;
/**
 * Этот класс описывает структуру Отеля
 * @author Stupakov Dmitriy
 * @version 1.0
 */
public class Hotel {
    /**
     * Занчение переменных:
     * @param hotelId - это уникальный идентификатор отеля
     * @param hotelName - это название отеля
     * @param hotelAddress - это адрес отеля (используется объект класса Address)
     *
     */
    private int hotelId;
    private String hotelName;
    private Address hotelAddress;

    /**
     * Это конструктор класса Hotel с входными парамметрами:
     * @param hotelId - уникальный идентификатор отеля;
     * @param hotelName - Название отеля;
     * @param hotelAddress - Адресс отеля, объект класса Address;
     */
    public Hotel(int hotelId, String hotelName, Address hotelAddress) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
    }
        /**
         * Это конструктор класса Hotel с входными парамметрами:
         * @param hotelName - Название отеля;
         * @param hotelAddress - Адресс отеля, объект класса Address;
         */
    public Hotel( String hotelName, Address hotelAddress) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
    }

    /**
     * Геттер переменной @param hotelId
     * @return  hotelId - Униклаьный иденитфикатор отеля
     */
    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {

        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Address getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(Address hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
