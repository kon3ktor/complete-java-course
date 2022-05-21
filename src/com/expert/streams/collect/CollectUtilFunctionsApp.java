package com.expert.streams.collect;

import java.util.List;
import java.util.stream.Collectors;

public class CollectUtilFunctionsApp {
    public static void main(String[] args) {
        List<String> playerNames = List.of("Azita", "Lamar", "Maui");
        List<Integer> playerDamage = List.of(12, 20, 15, 120, 30, 16, 40, 20, 100);
        List<Double> playerDamageDouble = List.of(12.0, 20.0, 15.0, 120.0, 30.0, 16.0, 40.0, 20.0, 100.0);

        System.out.println("Player names: " + String.join(", ", playerNames));
        System.out.println("Player damages: " + playerDamage.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "))
        );

        Long numberOfHits = playerDamage.stream()
                .collect(Collectors.counting());
        System.out.println("Number of hits: " + numberOfHits);

        Integer overallDamage = playerDamageDouble.stream()
                .collect(Collectors.summingInt(Double::intValue));
        System.out.println("Overall damage: " + overallDamage);

        Double overallDamageDouble = playerDamage.stream()
                .collect(Collectors.summingDouble(Integer::doubleValue));
        System.out.println("Overall damage(double): " + overallDamageDouble);

        Double averageDamage = playerDamage.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average damage: " + averageDamage);

        System.out.println("Damage statistics: " + playerDamage.stream()
                .collect(Collectors.summarizingInt(Integer::intValue))
        );

    }
}
