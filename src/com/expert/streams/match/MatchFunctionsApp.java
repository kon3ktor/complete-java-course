package com.expert.streams.match;

import com.expert.streams.collect.Item;

import java.util.List;

public class MatchFunctionsApp {

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

        boolean isMoreExpensiveThan = fruitBoxes.stream()
                .allMatch(item -> item.getPrice() > 1);
        System.out.println("All fruit boxes are more expensive than $10: " + isMoreExpensiveThan);

        boolean isKiwiAvailable = fruitBoxes.stream()
                .anyMatch(item -> "kiwi".equals(item.getName()));
        System.out.println("Kiwi is available in the shop: " + isKiwiAvailable);

        boolean isNoneMoreExpensiveThan = fruitBoxes.stream()
                .noneMatch(item -> item.getPrice() > 10);
        System.out.println("None of the fruit boxes is more expensive than $100: " + isNoneMoreExpensiveThan);


    }

}
