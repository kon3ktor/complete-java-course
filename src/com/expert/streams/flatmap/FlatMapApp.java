package com.expert.streams.flatmap;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapApp {

    public static void main(String[] args) {
        Integer[][] lotteryNumbers = new Integer[][]{
                {5, 23, 54, 60, 22},
                {15, 2, 34, 77, 81},
                {5, 7, 89, 63, 52},
        };
        Set<Integer> lotteryNumbersSet = Stream.of(lotteryNumbers)
                .flatMap(Stream::of)
                .collect(Collectors.toSet());
        System.out.println("The lottery numbers in the last 3 weeks: " + lotteryNumbersSet);


        List<List<String>> fruits = List.of(
                List.of("apple", "banana", "lemon"),
                List.of("plum", "mango", "kiwi"));
        List<String> fruitsList = fruits.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("Available fruits: " + fruitsList);

        List<CarDealership> carDealerships = List.of(
                new CarDealership("Brand New Dealership", List.of("Dodge", "Ford", "Ferrari")),
                new CarDealership("Total Car Ltd.", List.of("Kia", "Toyota", "Ford")),
                new CarDealership("Crashed Dealership", List.of("Ford", "Lexus", "Ferrari")));
        List<String> availableCarBrands = carDealerships.stream()
                .map(CarDealership::getCarBrands)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Available car brands: " + availableCarBrands);

    }

}
