package com.expert.finalpractice;

import java.util.Objects;

public class Planet {

    private String name;
    private int size;
    private double closestStarDistance;
    private int temperature;
    private String type;
    private double distanceFromEarth;

    public Planet(String name, int size, double closestStarDistance, int temperature, String type, double distanceFromEarth) {
        this.name = name;
        this.size = size;
        this.closestStarDistance = closestStarDistance;
        this.temperature = temperature;
        this.type = type;
        this.distanceFromEarth = distanceFromEarth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getClosestStarDistance() {
        return closestStarDistance;
    }

    public void setClosestStarDistance(double closestStarDistance) {
        this.closestStarDistance = closestStarDistance;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public void setDistanceFromEarth(double distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", closestStarDistance=" + closestStarDistance +
                ", temperature=" + temperature +
                ", type='" + type + '\'' +
                ", distanceFromEarth=" + distanceFromEarth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return size == planet.size && Double.compare(planet.closestStarDistance, closestStarDistance) == 0 && temperature == planet.temperature && Double.compare(planet.distanceFromEarth, distanceFromEarth) == 0 && Objects.equals(name, planet.name) && Objects.equals(type, planet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, closestStarDistance, temperature, type, distanceFromEarth);
    }
}
