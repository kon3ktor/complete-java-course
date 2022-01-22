package com.expert.sets.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetOperationsApp {

    public static void main(String[] args) {

        Set<String> carBrands = new HashSet<>();
        carBrands.add("Toyota");
        carBrands.add("Nissan");
        carBrands.add("Ford");
        carBrands.add("Kia");
        System.out.println("Our original set of car brands: " + carBrands);

        Set<String> newCarBrands = new HashSet<>();
        newCarBrands.add("Lexus");
        newCarBrands.add("Volvo");
        newCarBrands.add("Seat");
        newCarBrands.add("Fiat");

        carBrands.addAll(newCarBrands);
        System.out.println("After the new cars arrived: " + carBrands);

        Set<String> leastReliableCarBrands = new HashSet<>();
        leastReliableCarBrands.add("Ford");
        leastReliableCarBrands.add("Fiat");
        leastReliableCarBrands.add("Seat");
        leastReliableCarBrands.add("Renault");

        System.out.println("All the least reliable car brands available in our dealership: "
                            + carBrands.containsAll(leastReliableCarBrands));
        //carBrands.retainAll(leastReliableCarBrands);
        //System.out.println("The least reliable brands that can be found in our dealership: "
        //                    + carBrands);

        carBrands.removeAll(leastReliableCarBrands);
        System.out.println("After the least reliable cars are sold: " + carBrands);
    }
}
