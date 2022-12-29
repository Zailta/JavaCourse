package com.java.oop.PurchaseSystem.customerDetails;

import com.java.oop.PurchaseSystem.checkout.OrderStatus;
import com.java.oop.PurchaseSystem.checkout.ShoppingCart;
import com.java.oop.PurchaseSystem.payments.PaymentMethod;

import java.util.Optional;

public class CustomerDetails {
    private String CustomerName;
    private Address address;

    public CustomerDetails(String customerName, Address address) {
        CustomerName = customerName;
        this.address = address;
    }
    public Optional<OrderStatus> checkout(ShoppingCart cart, PaymentMethod paymentMethod){
        String status = "failure!";
        if(cart!=null && paymentMethod!=null)
            status ="Success!";
        return Optional.of(new OrderStatus(this, cart , paymentMethod, status));
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "CustomerName='" + CustomerName + '\'' +
                ", address=" + address +
                '}';
    }
}
