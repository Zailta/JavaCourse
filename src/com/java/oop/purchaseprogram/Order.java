package com.java.oop.purchaseprogram;

public class Order {
    private Customer customerName;
    private ShoppingCart cart;
    private Payment payment;

    public Order(Customer customerName, ShoppingCart cart, Payment payment) {
        this.customerName = customerName;
        this.cart = cart;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName=" + customerName +
                ", cart=" + cart +
                ", payment=" + payment +
                '}';
    }
}
