package com.java.oop.purchaseprogram;

public class Customer {
    private  final String customerName;
    private CreditCard creditCard;

    public Customer(String customerName, long ccNumber  ) {
        this.customerName = customerName;
        this.creditCard = new CreditCard(ccNumber);
    }
    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
