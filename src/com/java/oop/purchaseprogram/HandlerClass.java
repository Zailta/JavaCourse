package com.java.oop.purchaseprogram;

import java.util.Optional;

public class HandlerClass {
    public static void main(String[] args) {
    ShoppingCart cart  = new ShoppingCart();
    Product keyboard = new Product("Cosmic-Byte-CB-GK-14", 4999);
    Product mouse = new Product("Cosmic-Byte-CB-Mouse", 3999);

    cart.addProduct(new LineItems(keyboard, 1));
    cart.addProduct(new LineItems(mouse, 5));

        Customer customer = new Customer("Mohammad Manaan Bhat", 5125280228067670L);
       Optional<Order> order = customer.checkout(cart);
        System.out.println(customer);
        System.out.println(order);
        System.out.println(cart.getTotal());


    }
}
