package com.java.oop.PurchaseSystem.Product;

public class LineItems {
    private ProductDetails product;
    private int quantity;

    public LineItems(ProductDetails product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public int getTotalPrice(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "LineItems{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}'+"\n";
    }
}
