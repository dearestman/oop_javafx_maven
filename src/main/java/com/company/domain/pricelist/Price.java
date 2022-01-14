package com.company.domain.pricelist;

import java.time.LocalDate;

public class Price {
    private int priceId;
    private Tour priceTour;
    private float priceTourPrice; // Цена за тур
    private LocalDate priceTourDate; // Цена за тур
    private int tourDuration; // Длительность тура в днях

    public Price(int priceId, Tour priceTour, float priceTourPrice, LocalDate priceTourDate, int tourDuration) {
        this.priceId = priceId;
        this.priceTour = priceTour;
        this.priceTourPrice = priceTourPrice;
        this.priceTourDate = priceTourDate;
        this.tourDuration = tourDuration;
    }

    public float getPriceTourPrice() {
        return priceTourPrice;
    }

    public void setPriceTourPrice(float priceTourPrice) {
        this.priceTourPrice = priceTourPrice;
    }

    //    public Price(int priceId, Tour priceTour, LocalDate priceTourDate, int tourDuration) {
//        this.priceId = priceId;
//        this.priceTour = priceTour;
//        this.priceTourDate = priceTourDate;
//        this.tourDuration = tourDuration;
//    }

    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    public Tour getPriceTour() {
        return priceTour;
    }

    public void setPriceTour(Tour priceTour) {
        this.priceTour = priceTour;
    }

    public LocalDate getPriceTourDate() {
        return priceTourDate;
    }

    public void setPriceTourDate(LocalDate priceTourDate) {
        this.priceTourDate = priceTourDate;
    }

    public int getTourDuration() {
        return tourDuration;
    }

    public void setTourDuration(int tourDuration) {
        this.tourDuration = tourDuration;
    }
}
