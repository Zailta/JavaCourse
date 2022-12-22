package com.java.oop.purchaseprogram;

import java.util.*;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
    public int getTotal(){
        return products.stream().mapToInt(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
