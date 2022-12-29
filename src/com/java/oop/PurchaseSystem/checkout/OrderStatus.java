package com.java.oop.PurchaseSystem.checkout;

import com.java.oop.PurchaseSystem.customerDetails.CustomerDetails;
import com.java.oop.PurchaseSystem.payments.PaymentMethod;

import java.util.Optional;
import java.util.UUID;

public class OrderStatus {
    private CustomerDetails customerDetails;
    private ShoppingCart cart;
    private PaymentMethod paymentMethod;
    private String OrderStatus;
    public OrderStatus (CustomerDetails customerDetails, ShoppingCart cart, PaymentMethod paymentMethod, String OrderStatus) {
        this.customerDetails = customerDetails;
        this.cart = cart;
        this.paymentMethod = paymentMethod;
        this.OrderStatus = OrderStatus;
    }

    public  OrderStatus orderStatus(CustomerDetails customer, ShoppingCart cart, PaymentMethod paymentMethod) {
        Optional<UUID> makepayment = paymentMethod.makepayment(paymentMethod);
        if (!(makepayment.isEmpty())){
            return new OrderStatus(customerDetails, cart, paymentMethod, "Success!");
        }
        return new OrderStatus(customerDetails, cart, paymentMethod, "failure!");

    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "customerDetails=" + customerDetails +
                ", \ncart=" + cart +
                ", \npaymentMethod=" + paymentMethod +
                ", \nOrderStatus='" + OrderStatus + '\'' +
                '}';
    }
}
