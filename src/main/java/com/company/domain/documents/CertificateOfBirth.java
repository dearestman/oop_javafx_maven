package com.company.domain.documents;

import com.company.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class CertificateOfBirth extends Document{

    private int documentId;
    private String certificateOfBirthSerial;
    private String certificateOfBirthNumber;

    public String getCertificateOfBirthSerial() {
        return certificateOfBirthSerial;
    }

    public CertificateOfBirth(int documentId, LocalDate dateOfIssue, String issuedBy, String sertificateOfBirthSerial, String certificateOfBirthNumber) {
        super(documentId, dateOfIssue, issuedBy);
        this.certificateOfBirthSerial = sertificateOfBirthSerial;
        this.certificateOfBirthNumber = certificateOfBirthNumber;
    }


    @Override
    public int getDocumentId() {
        return documentId;
    }

    @Override
    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public void setCertificateOfBirthSerial(String certificateOfBirthSerial) {
        this.certificateOfBirthSerial = certificateOfBirthSerial;
    }

    public String getCertificateOfBirthNumber() {
        return certificateOfBirthNumber;
    }

    public void setCertificateOfBirthNumber(String certificateOfBirthNumber) {
        this.certificateOfBirthNumber = certificateOfBirthNumber;
    }

    //SQL



    //SQL


}
