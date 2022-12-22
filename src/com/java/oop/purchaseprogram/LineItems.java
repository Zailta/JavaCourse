package com.java.oop.purchaseprogram;

public class LineItems {
    private Product product;
    private int quantity;

    public LineItems(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public  int  getPrice() {
        try {
            return product.getPrice() * quantity;
        }
        catch (Exception e){
            return 0;
        }
    }

    @Override
    public String toString() {
        return "LineItems{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
