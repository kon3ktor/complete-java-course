package com.intermediate.defaultvalues;

public class Car {
    private byte numberOfSeats;
    private short horsepower;
    private int price;
    private long registrationNumber;

    private float fuelConsumption;
    private double preciseFuelConsumption;

    private boolean isDamaged;
    private char energyEfficiencyCategory;
    private String color;

    private Boolean hasElectricEngine;
    private Engine engine;

    public void getDetails() {
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Price: " + price);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Fuel consumption: " + fuelConsumption);
        System.out.println("Precise fuel consumption: " + preciseFuelConsumption);
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);
        System.out.println("Car's color: " + color);
        System.out.println("This car has electric engine: " + hasElectricEngine);
        System.out.println("The engine this car has is: " + engine);
    }
}
