package com.expert.streams.findfunctions;

import com.expert.streams.collect.Item;

import java.util.List;
import java.util.Optional;

public class FindFunctionsApp {

    public static void main(String[] args) {
        List<Item> fruitBoxes = List.of(
                new Item("strawberry", 10, 7.99),
                new Item("blueberry", 20, 26.99),
                new Item("pear", 10, 28.99),
                new Item("apple", 10, 3.99),
                new Item("kiwi", 10, 11.99),
                new Item("pear", 20, 9.99),
                new Item("strawberry", 20, 19.99),
                new Item("apple", 10, 15.99),
                new Item("apple", 10, 4.99)
        );

        Optional<Item> firstFruitBox = fruitBoxes.stream()
                .findFirst();
        System.out.println("The first fruit box: " + firstFruitBox.get());

        Optional<Item> anyFruitBox = fruitBoxes.stream()
                .findAny();
        System.out.println("A fruit box: " + anyFruitBox.get());

    }

}
