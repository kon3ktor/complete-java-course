package com.intermediate.inheritance.car;

public class DodgeChallenger extends Car{


    public DodgeChallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
                           int price, int mileage, boolean isDamaged){
        super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }

    @Override
    public void startTheEngine() {
        System.out.println("A Dodge Challenger engine is started.");
    }
}
