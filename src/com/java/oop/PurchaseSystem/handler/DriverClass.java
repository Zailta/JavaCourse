package com.java.oop.PurchaseSystem.handler;

import com.java.oop.PurchaseSystem.Product.LineItems;
import com.java.oop.PurchaseSystem.Product.ProductCatalogue;
import com.java.oop.PurchaseSystem.Product.ProductDetails;
import com.java.oop.PurchaseSystem.checkout.OrderStatus;
import com.java.oop.PurchaseSystem.checkout.ShoppingCart;
import com.java.oop.PurchaseSystem.customerDetails.Address;
import com.java.oop.PurchaseSystem.customerDetails.CustomerDetails;
import com.java.oop.PurchaseSystem.payments.DebitCard;
import com.java.oop.PurchaseSystem.payments.PaymentMethod;

import java.util.Optional;

public class DriverClass {
    public static void main(String[] args) {
        //User enters credentials
        Address address = new Address("bottashah Mohallah Lal bazar Srinagar");
        CustomerDetails customer  = new CustomerDetails("Mohammad Manaan Bhat", address);
        System.out.println(customer);
        //user selects cart Items
        ProductDetails keyboard  = ProductCatalogue.getProductFromCatalogue("CosmicBye-CBGK-14");
        ProductDetails mouse =  ProductCatalogue.getProductFromCatalogue("CosmicByte-CBGK-Mouse");
        //adding Items to cart
        ShoppingCart cart  = new ShoppingCart();
        cart.addProduct(new LineItems(keyboard,2));
        cart.addProduct(new LineItems(mouse,4));
         PaymentMethod paymentMethod = new DebitCard(5125280229061547L);
        //checkout:
        final Optional<OrderStatus> checkout = customer.checkout(cart, paymentMethod);
        System.out.println("Order Details: "+ checkout);
        //checkout:

    }
}
