package com.java.oop.PurchaseSystem.checkout;

import com.java.oop.PurchaseSystem.Product.LineItems;
import com.java.oop.PurchaseSystem.Product.ProductDetails;
import com.java.oop.PurchaseSystem.customerDetails.CustomerDetails;
import com.java.oop.PurchaseSystem.payments.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<LineItems> product = new ArrayList<>();

    public int getTotalAmountofCartItems(){
        return product.stream().mapToInt(LineItems::getTotalPrice).sum();
    }

    public void addProduct(LineItems productsinCart) {
        product.add(productsinCart);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "product=" + product +
                '}';
    }
}
