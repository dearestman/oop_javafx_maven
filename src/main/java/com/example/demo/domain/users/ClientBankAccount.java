package com.example.demo.domain.users;

public class ClientBankAccount {




    private double balance;
    private Client client;

    public ClientBankAccount() {
    }

    public ClientBankAccount(double balance, Client client) {
        this.balance = balance;
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void topUpBalance(int money){
        this.balance+=money;
    }
    public void topDownBalance(int money){
        this.balance-=money;
    }
}
