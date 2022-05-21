package com.expert.streams.collect;

import java.util.*;
import java.util.stream.Collectors;

public class CollectGroupingByApp {

    public static void main(String[] args) {
        List<Item> fruitBoxes = List.of(
                new Item("strawberry", 10, 9.99),
                new Item("blueberry", 20, 29.99),
                new Item("pear", 10, 29.99),
                new Item("apple", 10, 9.99),
                new Item("kiwi", 10, 19.99),
                new Item("pear", 10, 9.99),
                new Item("strawberry", 20, 19.99),
                new Item("apple", 10, 19.99),
                new Item("apple", 10, 9.99)
        );

        Map<Boolean, List<Item>> partitionFruitBoxes = fruitBoxes.stream()
                .collect(Collectors.partitioningBy(fruitBox -> fruitBox.getPrice() > 10));
        System.out.println("Fruit boxes cheaper and more expensive than $10:");
        System.out.println(partitionFruitBoxes);

        Map<String, List<Item>> fruitBoxesGroups = fruitBoxes.stream()
                .collect(Collectors.groupingBy(Item::getName));
        System.out.println("Fruit boxes grouped by type: ");
        System.out.println(fruitBoxesGroups);

        Map<String, Long> fruitBoxesCount = fruitBoxes.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println("Fruit boxes counted by type: ");
        System.out.println(fruitBoxesCount);

        Map<String, Long> fruitBoxesCountOrdered = new LinkedHashMap<>();
        fruitBoxesCount.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach( fruitBox -> fruitBoxesCountOrdered.put(fruitBox.getKey(), fruitBox.getValue()));
        System.out.println("Fruit boxes counted and ordered by type:");
        System.out.println(fruitBoxesCountOrdered);

    }
}
