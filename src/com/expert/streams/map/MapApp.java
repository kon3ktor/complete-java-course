package com.expert.streams.map;

import com.expert.streams.filtering.Product;

import java.util.List;
import java.util.stream.Collectors;

public class MapApp {
    public static void main(String[] args) {
        List<String> names = List.of("aladdin", "clara", "Cesar", "polly");
        List<String> namesCapitalized = names.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .collect(Collectors.toList());
        System.out.println("Capitalized names:");
        System.out.println(namesCapitalized);

        List<Product> cereals = List.of(
                new Product("Captain Crunch", "ABC", 9.99, 4.7),
                new Product("Fruity Oatmeal", "Old Oat", 6.99, 4.2),
                new Product("Cinnamon Loops", "ABC", 7.59, 4.5),
                new Product("Lucky Puffs", "Logs", 8.59, 4.6),
                new Product("Barn Flakes", "Old Oat", 5.09, 4.0),
                new Product("Golden Cookies", "ABC", 9.99, 4.8)
        );
        List<String> cerealNames = cereals.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
        System.out.println("Cereal names: ");
        System.out.println(cerealNames);

        List<Product> increasedPriceCereals = cereals.stream()
                .map(product -> new Product(
                        product.getName(),
                        product.getBrand(),
                        product.getPrice() * 1.2,
                        product.getRating()
                ))
                .collect(Collectors.toList());
        System.out.println("Increased cereal prices:");
        System.out.println(increasedPriceCereals);

    }
}
