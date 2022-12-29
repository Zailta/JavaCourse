package com.java.oop.PurchaseSystem.Product;

public class ProductDetails {
    private String productName;
    private int price;

    public ProductDetails(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
