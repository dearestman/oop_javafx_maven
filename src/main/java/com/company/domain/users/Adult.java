package com.company.domain.users;

import com.company.domain.address.Address;
import com.company.domain.documents.Document;
import com.company.domain.documents.Passport;

import java.time.LocalDate;
import java.util.HashMap;

public class Adult extends Client{


    private Passport clientPassport;
    public Adult(int userID, String firstName, String lastName, String patronymic,
                 LocalDate birthday, String login, String password, Address clientAddress,
                 String clientTelephone, String clientMail, Passport clientPassport, HashMap<String,Double> clientBankAccounts) {
        super(userID, firstName, lastName, patronymic, birthday,
                login, password, clientAddress, clientTelephone, clientMail);
        this.clientPassport = clientPassport;
    }
    public Document checkUserDocument(){
        System.out.println("У данного клиента паспорт");
        return this.clientPassport;
    }



    public Passport getClientPassport() {
        return clientPassport;
    }

    public void setClientPassport(Passport clientPassport) {
        this.clientPassport = clientPassport;
    }

//    @Override
//    public Document getUserDocument() {
//        return this.clientPassport;
//    }
}
