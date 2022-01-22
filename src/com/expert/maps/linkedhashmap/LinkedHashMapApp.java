package com.expert.maps.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {

    public static void main(String[] args) {

        Map<String, Double> productPricesHashMap = new HashMap<>();
        productPricesHashMap.put("Chocolate bar", 1.5);
        productPricesHashMap.put("Pasta", 1.1);
        productPricesHashMap.put("Cereals", 1.7);
        productPricesHashMap.put("Apple", 0.15);

        System.out.println("HashMap:");
        for (String product : productPricesHashMap.keySet()) {
            System.out.println(product + " $" + productPricesHashMap.get(product));
        }

        Map<String, Double> productPricesLinkedHashMap = new LinkedHashMap<>();
        productPricesLinkedHashMap.put("Chocolate bar", 1.5);
        productPricesLinkedHashMap.put("Pasta", 1.1);
        productPricesLinkedHashMap.put("Cereals", 1.7);
        productPricesLinkedHashMap.put("Apple", 0.15);

        System.out.println("LinkedHashMap:");
        for (String product : productPricesLinkedHashMap.keySet()) {
            System.out.println(product + " $" + productPricesLinkedHashMap.get(product));
        }


    }
}
