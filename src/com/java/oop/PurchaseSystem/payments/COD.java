package com.java.oop.PurchaseSystem.payments;

public class COD {
    private String cash;

    public COD(String cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "COD{" +
                "cash='" + cash + '\'' +
                '}';
    }
}
