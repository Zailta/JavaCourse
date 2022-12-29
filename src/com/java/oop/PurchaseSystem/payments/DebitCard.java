package com.java.oop.PurchaseSystem.payments;

import java.util.Optional;
import java.util.UUID;

public class DebitCard implements PaymentMethod{
    private long dbNumber;


    public DebitCard(long dbNumber) {
        this.dbNumber = dbNumber;
    }

    @Override
    public Optional<UUID> makepayment(PaymentMethod paymentMethod) {
        if(Math.random()>0.3 && paymentMethod!=null){
            return Optional.of(UUID.randomUUID());
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "dbNumber=" + dbNumber +
                '}';
    }
}
