package com.crown.service.api.entity;

public class Order {

    private String orderId;
    private String userName;

    public Order(String orderId, String userName) {
        this.orderId = orderId;
        this.userName = userName;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
