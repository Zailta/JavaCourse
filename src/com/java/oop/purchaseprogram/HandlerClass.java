package com.java.oop.purchaseprogram;

public class HandlerClass {
    public static void main(String[] args) {
    ShoppingCart cart  = new ShoppingCart();
    Product keyboard = new Product("Cosmic-Byte-CB-GK-14", 4999);
    Product mouse = new Product("Cosmic-Byte-CB-Mouse", 3999);
    cart.addProduct(keyboard);
    cart.addProduct(mouse);
        System.out.println(cart);
        System.out.println(cart.getTotal());

    }
}
