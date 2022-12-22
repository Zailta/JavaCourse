package com.java.oop.purchaseprogram;

import java.util.Optional;
import java.util.UUID;

public class CreditCard {
    private final long ccNumber;


    public CreditCard(long ccNumber) {
        this.ccNumber = ccNumber;
    }
    public Optional<Payment> makePayment(int totalCost){
        if(Math.random() >0.3){
            return  Optional.of(new Payment(this, totalCost, UUID.randomUUID()));
        }
        else {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "ccNumber=" + ccNumber +
                '}';
    }
}
