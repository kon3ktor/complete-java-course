package com.hero.multithreading.semaphore;

public class SemaphoreApp {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5);

        Runnable parkCar = () -> {
            for (int i = 0; i < 2; i++) {
                parkingLot.park();
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(parkCar).start();
        }
    }
}
