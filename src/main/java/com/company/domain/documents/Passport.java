package com.company.domain.documents;

import com.company.domain.address.Address;

import java.time.LocalDate;

public class Passport extends Document{
    private String passportSerial;
    private String passportNumber;
    private Address addressRegistration;

    public Passport(int documentId, LocalDate dateOfIssue, String issuedBy, String passportSerial, String passportNumber, Address addressRegistration) {
        super(documentId, dateOfIssue, issuedBy);
        this.passportSerial = passportSerial;
        this.passportNumber = passportNumber;
        this.addressRegistration = addressRegistration;
    }

    public String getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Address getAddressRegistration() {
        return addressRegistration;
    }

    public void setAddressRegistration(Address addressRegistration) {
        this.addressRegistration = addressRegistration;
    }
}
