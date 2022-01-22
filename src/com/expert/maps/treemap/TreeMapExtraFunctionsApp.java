package com.expert.maps.treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExtraFunctionsApp {

    public static void main(String[] args) {

        TreeMap<String, Double> productPricesTreeMap = new TreeMap<>();
        productPricesTreeMap.put("Chocolate bar", 1.5);
        productPricesTreeMap.put("Pasta", 1.1);
        productPricesTreeMap.put("Cereals", 1.7);
        productPricesTreeMap.put("Apple", 0.15);
        productPricesTreeMap.put("Orange", 0.25);
        productPricesTreeMap.put("Teabox", 3.2);

        System.out.println("The first product in the map: " + productPricesTreeMap.firstKey());
        System.out.println("TreeMap:");
        for (String product : productPricesTreeMap.keySet()) {
            System.out.println(product + " $" + productPricesTreeMap.get(product));
        }
        System.out.println();
        System.out.println("Descending Map:");
        NavigableMap<String, Double> productPriceDescendingMap = productPricesTreeMap.descendingMap();
        for (String product : productPriceDescendingMap.keySet()) {
            System.out.println(product + " $" + productPriceDescendingMap.get(product));
        }

        System.out.println();
        System.out.println("Lower key: " + productPricesTreeMap.lowerKey("Pasta"));
        System.out.println("Floor key: " + productPricesTreeMap.floorKey("Pasta"));
        System.out.println("Higher key: " + productPricesTreeMap.higherKey("Pasta"));
        System.out.println("Ceiling key: " + productPricesTreeMap.ceilingKey("Pasta"));

        System.out.println();
        System.out.println("Poll first entry: " + productPricesTreeMap.pollFirstEntry());
        System.out.println("The first entry: " + productPricesTreeMap.firstEntry());
        System.out.println("The last entry: " + productPricesTreeMap.lastEntry());

        System.out.println("Lower entry: " + productPricesTreeMap.lowerEntry("Pasta"));
        System.out.println("Floor entry: " + productPricesTreeMap.floorEntry("Pasta"));
        System.out.println("Higher entry: " + productPricesTreeMap.higherEntry("Pasta"));
        System.out.println("Ceiling entry: " + productPricesTreeMap.ceilingEntry("Pasta"));

        System.out.println();
        System.out.println("Tail map: " + productPricesTreeMap.tailMap("Orange", true));
        System.out.println("Head map: " + productPricesTreeMap.headMap("Orange", true));
        System.out.println("Sub map: " + productPricesTreeMap.subMap("Orange",false, "Teabox", false));

    }
}
