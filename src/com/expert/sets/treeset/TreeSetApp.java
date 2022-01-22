package com.expert.sets.treemap;

import java.util.TreeSet;

public class TreeSetApp {

    public static void main(String[] args) {

        TreeSet<String> carBrands = new TreeSet<>();
        carBrands.add("Toyota");
        carBrands.add("Nissan");
        carBrands.add("Ford");
        carBrands.add("Kia");
        carBrands.add("Lexus");
        carBrands.add("Volvo");
        carBrands.add("Seat");
        carBrands.add("Fiat");
        System.out.println("Our original set of car brands: " + carBrands);

        System.out.println();
        System.out.println("Lower function returns the following: " + carBrands.lower("Lexus"));
        System.out.println("Floor function returns the following: " + carBrands.floor("Lexus"));
        System.out.println("Higher function returns the following: " + carBrands.higher("Lexus"));
        System.out.println("Ceiling function returns the following: " + carBrands.ceiling("Lexus"));

        System.out.println();
        System.out.println("Tail set: " + carBrands.tailSet("Lexus"));
        System.out.println("Head set: " + carBrands.headSet("Lexus"));
        System.out.println("Sub set: " + carBrands.subSet("Lexus", "Toyota"));

        System.out.println();
        System.out.println("The first element: " + carBrands.first());
        System.out.println("The last element: " + carBrands.last());
        System.out.println("The pollFirst element: " + carBrands.pollFirst());
        System.out.println("The pollLast element: " + carBrands.pollLast());
        System.out.println("The set after pollFirst and pollLast: " + carBrands);

        System.out.println();
        System.out.println("The set in descending order: " + carBrands.descendingSet());





    }
}
