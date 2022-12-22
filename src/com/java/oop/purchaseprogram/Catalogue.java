package com.java.oop.purchaseprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Catalogue {
   private static Map<String , Product> catalogue = Map.of(
           "CosmicBye-CBGK-14",new Product("CosmicBye-CBGK-14", 4999),
           "Google-Pixel 7 Pro", new Product("Google-Pixel 7 Pro", 79999),
            "CosmicByte-CBGK-Mouse", new Product("CosmicByte-CBGK-Mouse", 2999),
            "USB Multi-port Hub", new Product("USB Multi-port Hub", 999),
            "Dual Charging adapter 12W", new Product("Dual Charging adapter 12W", 1999),
            "SATA Disk Transparent Cover", new Product("SATA Disk Transparent Cover", 799),
           "Empty", new Product("Result not Found", 0));

    public static Product getProductFromCatalogue(String productName){
           try {
               return catalogue.get(productName);
           }
           catch(Exception e){
               System.out.println(productName+ " is not present in teh catalogue");
               return new Product("Empty" , 0);
           }
    }
}
