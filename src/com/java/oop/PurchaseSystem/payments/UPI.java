package com.java.oop.PurchaseSystem.payments;

import java.util.Optional;
import java.util.UUID;

public class UPI implements PaymentMethod {
    private long upiNumber;

    public UPI(long upiNumber) {
        this.upiNumber = upiNumber;

    }
    @Override
    public Optional<UUID> makepayment(PaymentMethod paymentMethod) {
        if(Math.random()>0.3){
            return Optional.of(UUID.randomUUID());
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "UPI{" +
                "upiNumber=" + upiNumber +

                '}';
    }
}
