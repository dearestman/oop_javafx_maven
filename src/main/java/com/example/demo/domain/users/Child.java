package com.example.demo.domain.users;

import com.example.demo.domain.address.Address;
import com.example.demo.domain.documents.CertificateOfBirth;
import com.example.demo.domain.documents.Document;

import java.time.LocalDate;
import java.util.HashMap;

public class Child extends Client{


    private CertificateOfBirth certificateOfBirth;

    public Child(int userID, String firstName, String lastName, String patronymic, LocalDate birthday, String login, String password, Address clientAddress, String clientTelephone, String clientMail, CertificateOfBirth certificateOfBirth, HashMap<String,Double> clientBankAccounts) {
        super(userID, firstName, lastName, patronymic, birthday, login, password, clientTelephone, clientMail);
        this.certificateOfBirth = certificateOfBirth;
    }

    public CertificateOfBirth getCertificateOfBirth() {
        return certificateOfBirth;
    }

    public void setCertificateOfBirth(CertificateOfBirth certificateOfBirth) {
        this.certificateOfBirth = certificateOfBirth;
    }
    public Document checkUserDocument(){
        System.out.println("У данного клиента свидетельство о рождении.");
        return this.certificateOfBirth;
    }
//
//    @Override
//    public Document getUserDocument() {
//        return this.certificateOfBirth;
//    }
}
