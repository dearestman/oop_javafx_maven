package com.company.domain.documents;

import java.time.LocalDate;

public class CertificateOfBirth extends Document{

    private int documentId;
    private String sertificateOfBirthSerial;
    private String sertificateOfBirthNumber;

    public String getSertificateOfBirthSerial() {
        return sertificateOfBirthSerial;
    }

    public CertificateOfBirth(int documentId, LocalDate dateOfIssue, String issuedBy, String sertificateOfBirthSerial, String sertificateOfBirthNumber) {
        super(documentId, dateOfIssue, issuedBy);
        this.sertificateOfBirthSerial = sertificateOfBirthSerial;
        this.sertificateOfBirthNumber = sertificateOfBirthNumber;
    }


    @Override
    public int getDocumentId() {
        return documentId;
    }

    @Override
    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public void setSertificateOfBirthSerial(String sertificateOfBirthSerial) {
        this.sertificateOfBirthSerial = sertificateOfBirthSerial;
    }

    public String getSertificateOfBirthNumber() {
        return sertificateOfBirthNumber;
    }

    public void setSertificateOfBirthNumber(String sertificateOfBirthNumber) {
        this.sertificateOfBirthNumber = sertificateOfBirthNumber;
    }


}
