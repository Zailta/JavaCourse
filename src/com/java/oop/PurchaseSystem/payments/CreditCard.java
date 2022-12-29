package com.java.oop.PurchaseSystem.payments;

import java.util.Optional;
import java.util.UUID;

public class CreditCard implements PaymentMethod{
    private long ccNumber;


    public CreditCard(long ccNumber) {
        this.ccNumber = ccNumber;

    }
    public Optional<UUID> makepayment(PaymentMethod paymentMethod) {
        if(Math.random()>0.3){
            return Optional.of(UUID.randomUUID());
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "ccNumber=" + ccNumber +
                '}';
    }
}
