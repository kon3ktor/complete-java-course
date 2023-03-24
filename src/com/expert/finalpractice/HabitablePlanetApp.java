package com.expert.finalpractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HabitablePlanetApp {

    private static final String SOLID = "solid";
    private static final int AVERAGE_EARTH_TEMPERATURE = 15;
    private static final double EARTH_SUN_DISTANCE_IN_LIGHT_YEARS = 0.00001581;

    public static void main(String[] args) {
        ArrayList<Planet> planets = PlanetRepository.getPlanets();

        System.out.println("The number of planets in the database: " + planets.stream().distinct().count());

        Optional<Planet> theBiggest = planets.stream()
                .max(Comparator.comparing(Planet::getSize));
        System.out.println("The biggest planet is " + theBiggest.get().getName()
                + " with " + theBiggest.get().getSize() + "kms.");

        Optional<Planet> theColdest = planets.stream()
                .min(Comparator.comparing(Planet::getTemperature));
        System.out.println("The coldest planet is " + theColdest.get().getName()
                + " with " + theColdest.get().getTemperature() + "°C.");

        Optional<Planet> theHottest = planets.stream()
                .max(Comparator.comparing(Planet::getTemperature));
        System.out.println("The hottest planet is " + theHottest.get().getName()
                + " with " + theHottest.get().getTemperature() + "°C.");

        System.out.println("The top 10 most habitable planets:");
        planets.stream()
                .filter(planet -> SOLID.equals(planet.getType()))
                .sorted(Comparator.comparing((Planet p) -> Math.abs(p.getTemperature() - AVERAGE_EARTH_TEMPERATURE))
                        .thenComparing(Planet::getDistanceFromEarth))
                .limit(10)
                .forEach(System.out::println);

        System.out.println("The planet that is at the same distance from its closest star as the Earth from the Sun:");
        planets.stream()
                .sorted(Comparator.comparing(p -> Math.abs(p.getClosestStarDistance() - EARTH_SUN_DISTANCE_IN_LIGHT_YEARS)))
                .limit(1)
                .forEach(System.out::println);
    }
}
