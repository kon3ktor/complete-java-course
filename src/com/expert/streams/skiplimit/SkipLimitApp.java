package com.expert.streams.skiplimit;

import com.expert.streams.collect.Item;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitApp {
    public static void main(String[] args) {
        List<Item> fruitBoxes = List.of(
                new Item("strawberry", 10, 7.99),
                new Item("blueberry", 20, 26.99),
                new Item("pear", 10, 28.99),
                new Item("apple", 10, 3.99),
                new Item("kiwi", 10, 11.99),
                new Item("pear", 10, 9.99),
                new Item("strawberry", 20, 19.99),
                new Item("apple", 10, 15.99),
                new Item("apple", 10, 4.99)
        );

        List<Item> top3LeastExpensiveFruitBoxes = fruitBoxes.stream()
                .sorted(Comparator.comparing(Item::getPrice))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("The top 3 least expensive fruit boxes: " + top3LeastExpensiveFruitBoxes);

        List<Item> top3MostExpensiveFruitBoxes = fruitBoxes.stream()
                .sorted(Comparator.comparing(Item::getPrice).reversed())
                .skip(1)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("The top 3 most expensive fruit boxes: " + top3MostExpensiveFruitBoxes);

    }
}
