package com.java.oop.PurchaseSystem.payments;

import java.util.Optional;
import java.util.UUID;

public interface PaymentMethod {
    public Optional<UUID> makepayment(PaymentMethod paymentMethod);
}
