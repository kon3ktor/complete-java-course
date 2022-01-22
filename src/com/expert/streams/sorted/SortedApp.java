package com.expert.streams.sorted;

import com.expert.streams.filtering.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class SortedApp {
    public static void main(String[] args) {
        List<Integer> lotteryNumbers = List.of(34, 54, 2, 64, 11);
        System.out.println(lotteryNumbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));


        List<Product> cereals = List.of(
                new Product("Captain Crunch", "ABC", 9.99, 4.7),
                new Product("Fruity Oatmeal", "Old Oat", 6.99, 4.2),
                new Product("Cinnamon Loops", "ABC", 7.59, 4.5),
                new Product("Lucky Puffs", "Logs", 8.59, 4.6),
                new Product("Barn Flakes", "Old Oat", 5.09, 4.0),
                new Product("Golden Cookies", "ABC", 9.99, 4.8)
        );
        cereals.stream()
                .sorted(Comparator.comparing(Product::getPrice)
                        .thenComparing(Product::getName).reversed())
                .forEach(System.out::println);


    }
}
