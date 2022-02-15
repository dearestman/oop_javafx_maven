package com.example.demo.domain;

import com.example.demo.domain.pricelist.Price;
import com.example.demo.domain.users.Client;

import java.time.LocalDate;

public class Order {
    private int orderId;
    private String orderNumber;
    private Client orderClient;
    private Price orderPrice;
    private LocalDate orderDate;

    public Order(int orderId, String orderNumber, Client orderClient, Price orderPrice, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.orderClient = orderClient;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
    }



    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Client getOrderClient() {
        return orderClient;
    }

    public void setOrderClient(Client orderClient) {
        this.orderClient = orderClient;
    }

    public Price getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Price orderPrice) {
        this.orderPrice = orderPrice;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
