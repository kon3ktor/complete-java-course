package com.expert.streams.minmax;

import com.expert.streams.collect.Item;

import java.util.Comparator;
import java.util.List;

public class MinMaxCountApp {

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

        long numberOfBoxes = fruitBoxes.stream()
                .filter(fruitBox -> fruitBox.getQuantity() > 10)
                .count();
        System.out.println("The number of fruit boxes: " + numberOfBoxes);

        Item maxPriceFruit = fruitBoxes.stream()
                .max(Comparator.comparing(Item::getPrice))
                .get();
        System.out.println("The most expensive fruit box: " + maxPriceFruit);

        Item minPriceFruit = fruitBoxes.stream()
                .min(Comparator.comparing(Item::getPrice))
                .get();
        System.out.println("The cheapest fruit box: " + minPriceFruit);

    }
}
