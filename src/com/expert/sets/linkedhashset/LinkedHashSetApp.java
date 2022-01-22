package com.expert.sets.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {

    public static void main(String[] args) {

        Set<String> carBrands = new LinkedHashSet<>(10, 0.6f);
        carBrands.add("Toyota");
        carBrands.add("Nissan");
        carBrands.add("Ford");
        carBrands.add("Kia");
        System.out.println("Our original set of car brands: " + carBrands);

    }
}
