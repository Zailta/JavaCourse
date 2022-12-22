package com.java.oop.purchaseprogram;

import java.util.Optional;

public class Customer {
    private  final String customerName;
    private CreditCard creditCard;

    public Customer(String customerName, long ccNumber  ) {
        this.customerName = customerName;
        this.creditCard = new CreditCard(ccNumber);
    }
    public Optional<Order> checkout(ShoppingCart cart){
        Optional <Payment> payment = creditCard.makePayment(cart.getTotal());
        return payment.map(value -> new Order(this, cart, value));
    }
    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
