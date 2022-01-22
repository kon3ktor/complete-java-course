package com.expert.streams.collect;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectToApp {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "pineapple",
                "watermelon", "banana", "kiwi", "apple", "kiwi");

        Set<String> availableFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("w"))
                .collect(Collectors.toSet());
        System.out.println("Available fruits:");
        System.out.println(availableFruits);

        Collection<String> fruitBoxes = fruits.stream()
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("Fruit boxes: ");
        System.out.println(fruitBoxes);

        Map<String, String> fruitNamesWithUppercase = fruits.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), String::toUpperCase));
        System.out.println("Fruit names with uppercase:");
        System.out.println(fruitNamesWithUppercase);

    }
}
