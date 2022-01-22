package com.expert.streams.distinct;

import com.expert.streams.filtering.Product;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctApp {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "pineapple",
                "watermelon", "banana", "kiwi", "apple", "kiwi");
        List<String> availableFruits = fruits.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Available fruits:");
        System.out.println(availableFruits);

        List<Product> cereals = List.of(
                new Product("Lucky Puffs", "Logs", 8.59, 4.6),
                new Product("Cinnamon Loops", "ABC", 7.59, 4.5),
                new Product("Cinnamon Loops", "ABC", 7.59, 4.5)
        );

        List<Product> availableCereals = cereals.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Available cereals:");
        System.out.println(availableCereals);

    }
}
