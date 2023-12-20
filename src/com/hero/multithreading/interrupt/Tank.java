package com.hero.multithreading.interrupt;

public class Tank {

    private int capacity;
    private int currentLevel = 0;

    public Tank(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void pumpWater(int pumpingRate) throws InterruptedException {
        if (currentLevel + pumpingRate > capacity) {
            System.out.println("Tank is full. Waiting for consumption...");
            wait();
        }

        currentLevel += pumpingRate;
        System.out.println("Pumping " + pumpingRate + " liters of water. Current level: " + currentLevel);
    }

    public synchronized void consumeWater(int amount) {
        if ( amount <= currentLevel) {
            currentLevel -= amount;
            System.out.println("Consuming " + amount + "liter(s) of water. Current level: " + currentLevel);
            notify();
        }

    }

}
