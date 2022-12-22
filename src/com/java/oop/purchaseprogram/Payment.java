package com.java.oop.purchaseprogram;

import java.util.UUID;

public class Payment {
    CreditCard creditCard;
    int totalCost;
    UUID randomUUID;

    public Payment(CreditCard creditCard, int totalCost, UUID randomUUID) {
        this.creditCard = creditCard;
        this.totalCost = totalCost;
        this.randomUUID = randomUUID;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditCard=" + creditCard +
                ", totalCost=" + totalCost +
                ", randomUUID=" + randomUUID +
                '}';
    }
}
