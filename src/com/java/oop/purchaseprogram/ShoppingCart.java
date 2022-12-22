package com.java.oop.purchaseprogram;

import java.util.*;

public class ShoppingCart {
    private List<LineItems> products = new ArrayList<>();

    public void addProduct(LineItems product){
        products.add(product);
    }
    public int getTotal(){
        return products.stream().mapToInt(LineItems::getPrice).sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
