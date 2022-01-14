package com.company.domain.address;

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
}
