package com.expert.streams.peek;

import com.expert.streams.collect.Item;

import java.util.List;
import java.util.stream.Collectors;

public class PeekApp {

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

        List<Item> filteredFruitBoxes = fruitBoxes.stream()
                .filter(fruitBox -> fruitBox.getQuantity() > 10)
                .peek(fruitBox -> System.out.println("Quantity filtered: " + fruitBox))
                .filter(fruitBox -> fruitBox.getPrice() < 10)
                .peek(fruitBox -> System.out.println("Price filtered: " + fruitBox))
                .peek(fruitBox -> fruitBox.setPrice(fruitBox.getPrice() + 5))
                .collect(Collectors.toList());

        System.out.println("Filtered list:");
        System.out.println(filteredFruitBoxes);

    }
}
