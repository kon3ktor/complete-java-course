package com.expert.streams.reduce;

import com.expert.streams.collect.Item;

import java.util.List;

public class ReduceApp {

    public static void main(String[] args) {

        List<Item> shoppingCart = List.of(
                new Item("strawberry", 10, 10),
                new Item("blueberry", 20, 30),
                new Item("pear", 10, 30)
        );

        double subTotal = shoppingCart.stream()
                .mapToDouble(Item::getPrice)
                .sum();
        double discount = -10;
        double totalPrice = shoppingCart.stream()
                .map(Item::getPrice)
                .reduce(discount, Double::sum);

        System.out.println("Subtotal: \t\t$" + subTotal);
        System.out.println("Discount: \t\t$" + discount);
        System.out.println("Total price: \t$" + totalPrice);


    }
}
