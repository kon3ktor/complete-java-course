package com.expert.sets.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {

    public static void main(String[] args) {

        Set<String> carBrands = new HashSet<>();
        carBrands.add("Toyota");
        carBrands.add("Nissan");
        carBrands.add("Ford");
        carBrands.add("Kia");
        carBrands.add("Toyota");

        carBrands.clear();
        carBrands.remove("Ford");
        System.out.println(carBrands);
        System.out.println("Kia is in the set: " + carBrands.contains("Kia"));
        System.out.println("The size of the set: " + carBrands.size());

        System.out.println();
        System.out.println("We have the following car brands:");
        for(String carBrand : carBrands) {
            System.out.println("-" + carBrand.toUpperCase());
        }

    }
}
