package com.expert.finalpractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HabitablePlanetApp {

    public static void main(String[] args) {
        ArrayList<Planet> planets = PlanetRepository.getPlanets();

        System.out.println("The number of planets in the database: " + planets.stream().distinct().count());
        Optional<Planet> theBiggest = planets.stream()
                .max(Comparator.comparing(Planet::getSize));
        System.out.println("The biggest planet is " + theBiggest.get().getName() +
                " with " + theBiggest.get().getSize() + "kms.");

        Optional<Planet> theColdest = planets.stream()
                .min(Comparator.comparing(Planet::getTemperature));
        System.out.println("The coldest planet is " + theColdest.get().getName() +
                " with " + theColdest.get().getTemperature() + "°C.");

        Optional<Planet> theHottest = planets.stream()
                .max(Comparator.comparing(Planet::getTemperature));
        System.out.println("The hottest planet is " + theHottest.get().getName() +
                " with " + theHottest.get().getTemperature() + "°C.");

        System.out.println("The top 10 most habitable planets: ");
        int averageEarthTemperature = 15;
        List<Planet> top10planets = planets.stream()
                .filter(planet -> "solid".equals(planet.getType()))
                .sorted(Comparator.comparing((Planet p1) -> Math.abs(p1.getTemperature() - averageEarthTemperature))
                        .thenComparing(Planet::getDistanceFromEarth))
                .limit(10)
                .collect(Collectors.toList());
        top10planets.forEach(System.out::println);


        System.out.println("The planet that is at the same distance from its closest star as Earth:");
        double earthSunDistanceInLightYears = 0.00001581;
        planets.stream()
                .sorted(Comparator.comparing(p -> Math.abs(p.getClosestStarDistance() - earthSunDistanceInLightYears)))
                .limit(1)
                .forEach(System.out::println);




    }
}
