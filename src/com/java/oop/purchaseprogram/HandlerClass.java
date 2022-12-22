package com.java.oop.purchaseprogram;

import java.util.Optional;

public class HandlerClass {
    public static void main(String[] args) {
    ShoppingCart cart  = new ShoppingCart();
    Product keyboard = Catalogue.getProductFromCatalogue("CosmicBye-CBGK-14");
    Product phone = Catalogue.getProductFromCatalogue("Google-Pixel 7 Pro");
    Product mouse = Catalogue.getProductFromCatalogue("CosmicByte-CBGK-Mouse2");

    cart.addProduct(new LineItems(keyboard, 1));
    cart.addProduct(new LineItems(phone, 2));
    cart.addProduct(new LineItems(mouse, 5));

        Customer customer = new Customer("Mohammad Manaan Bhat", 5125280228067670L);
       Optional<Order> order = customer.checkout(cart);
        System.out.println(customer);
        System.out.println(order);
        System.out.println(cart.getTotal());


    }
}
