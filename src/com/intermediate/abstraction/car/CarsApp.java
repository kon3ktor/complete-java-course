package com.intermediate.abstraction.car;

public class CarsApp {

    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
        System.out.println(redDodgeChallenger.getCarName() + "'s price is $" + redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(-35000);
        System.out.println(redDodgeChallenger.getCarName() + "'s new price is $" + redDodgeChallenger.getPrice());
        System.out.println("The car is in city mode.");
        redDodgeChallenger.startTheElectricEngine();
        System.out.println("The car has " + redDodgeChallenger.getMileage() + "miles");
        redDodgeChallenger.drive(0);
        System.out.println("After driving the car, it has " + redDodgeChallenger.getMileage() + "miles");

        System.out.println("----------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)225, (short)717, (short)3500, 40000, 15000, false);
        System.out.println(blackToyotaSupra.getCarName() + "'s price is $" + blackToyotaSupra.getPrice());
        blackToyotaSupra.setPrice(32000);
        System.out.println(blackToyotaSupra.getCarName() + "'s new price is $" + blackToyotaSupra.getPrice());
        blackToyotaSupra.startTheEngine();
        System.out.println("The car has " + blackToyotaSupra.getMileage() + "miles");
        blackToyotaSupra.drive(200);
        System.out.println("After driving the car, it has " + blackToyotaSupra.getMileage() + "miles");
    }

}
