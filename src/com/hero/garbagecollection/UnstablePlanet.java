package com.hero.garbagecollection;

public class UnstablePlanet {

    private String name;
    private int size;
    private String type;
    private static int numberOfUnstablePlanets = 0;

    public UnstablePlanet(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
        numberOfUnstablePlanets++;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getNumberOfUnstablePlanets() {
        return numberOfUnstablePlanets;
    }

    public static void setNumberOfUnstablePlanets(int numberOfUnstablePlanets) {
        UnstablePlanet.numberOfUnstablePlanets = numberOfUnstablePlanets;
    }

    @Override
    public String toString() {
        return "UnstablePlanet{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }

    protected void finalize(){
        System.out.println("An unstable planet object is destroyed.");
        --numberOfUnstablePlanets;
        System.out.println("Number of remaining unstable planets: " + numberOfUnstablePlanets);
    }
}
