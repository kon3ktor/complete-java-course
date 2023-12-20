package com.hero.multithreading.interrupt;

public class InterruptApp {

    public static void main(String[] args) throws InterruptedException {
        
        Tank tank = new Tank(100);
        Pump pumpOne = new Pump(tank, 15);
        Pump pumpTwo = new Pump(tank, 13);

        pumpOne.start();
        pumpTwo.start();

        Thread.sleep(5000);

        tank.consumeWater(60);
        Thread.sleep(5000);
        
        pumpOne.interrupt();
        pumpTwo.interrupt();


        pumpOne.join();
        pumpTwo.join();
        System.out.println("Pumps have been stopped.");

    }
}
