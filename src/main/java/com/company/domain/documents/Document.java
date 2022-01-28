package com.company.domain.documents;

import com.company.Database;
import com.company.domain.address.Address;
import com.company.domain.address.Locality;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Document {
    private int documentId;
    private LocalDate dateOfIssue;
    private String issuedBy;

    public Document(int documentId, LocalDate dateOfIssue, String issuedBy) {
        this.documentId = documentId;
        this.dateOfIssue = dateOfIssue;
        this.issuedBy = issuedBy;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

}
