package com.intermediate.inheritance.car;

public class CarsApp {

    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
        redDodgeChallenger.getDescription();
        redDodgeChallenger.startTheEngine();

        System.out.println("----------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)225, (short)717, (short)3500, 40000, 15000, false);
        blackToyotaSupra.getDescription();
        blackToyotaSupra.startTheEngine();
    }

}
