package com.java.oop.PurchaseSystem.Product;

import com.java.oop.purchaseprogram.Product;

import java.util.Map;

public class ProductCatalogue {

    private static Map<String , ProductDetails> catalogue = Map.of(
            "CosmicBye-CBGK-14",new ProductDetails("CosmicBye-CBGK-14", 4999),
            "Google-Pixel 7 Pro", new ProductDetails("Google-Pixel 7 Pro", 79999),
            "CosmicByte-CBGK-Mouse", new ProductDetails("CosmicByte-CBGK-Mouse", 2999),
            "USB Multi-port Hub", new ProductDetails("USB Multi-port Hub", 999),
            "Dual Charging adapter 12W", new ProductDetails("Dual Charging adapter 12W", 1999),
            "SATA Disk Transparent Cover", new ProductDetails("SATA Disk Transparent Cover", 799),
            "Empty", new ProductDetails("Result not Found", 0));

    public static ProductDetails getProductFromCatalogue(String productName) {
        try {
            return catalogue.get(productName);
        } catch (Exception e) {
            System.out.println(productName + " is not present in teh catalogue");
            return new ProductDetails("Empty", 0);
        }
    }

}

