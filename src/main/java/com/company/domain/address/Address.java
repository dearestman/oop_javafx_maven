package com.company.domain.address;

public class Address {
    private int addressId;
    private Locality addressLocality;
    private String addressStreet;
    private String addressHouse;
    private String addressExtension;
    private String addressApartment;

    public Address(int addressId, Locality addressLocality, String addressStreet, String addressHouse, String addressExtension, String addressApartment) {
        this.addressId = addressId;
        this.addressLocality = addressLocality;
        this.addressStreet = addressStreet;
        this.addressHouse = addressHouse;
        this.addressExtension = addressExtension;
        this.addressApartment = addressApartment;
    }

    public Address(int addressId, Locality addressLocality, String addressStreet, String addressHouse) {
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
}

