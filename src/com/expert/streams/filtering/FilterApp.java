package com.expert.streams.filtering;

import java.util.List;

public class FilterApp {

    public static void main(String[] args) {
        List<Product> cereals = List.of(
                new Product("Captain Crunch", "ABC", 9.99, 4.7),
                new Product("Fruity Oatmeal", "Old Oat", 6.99, 4.2),
                new Product("Cinnamon Loops", "ABC", 7.59, 4.5),
                new Product("Lucky Puffs", "Logs", 8.59, 4.6),
                new Product("Barn Flakes", "Old Oat", 5.09, 4.0),
                new Product("Golden Cookies", "ABC", 9.99, 4.8)
        );

        cereals.stream()
                .filter(cereal -> cereal.getPrice() < 8 && cereal.getBrand().equals("ABC"))
                .forEach(System.out::println);
    }
}
