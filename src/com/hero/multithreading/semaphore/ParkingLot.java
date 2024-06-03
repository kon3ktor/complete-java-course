package com.hero.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class ParkingLot {

    private final Semaphore spots;

    public ParkingLot(int numberOfSpots) {
        spots = new Semaphore(numberOfSpots);
    }

    public void park() {
        try {
            spots.acquire();
            System.out.println("Car parked. Available spots: " + spots.availablePermits());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Car left. Available spots: " + spots.availablePermits());
            spots.release();
        }

    }

}
