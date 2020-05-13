package com.beginner.controlflow;

public class ControlFlowApp {
    public static void main(String[] args) {
        boolean isDamaged = false;
        String carColor = "purple";
        char energyEfficiencyCategory = 'Z';

        if (isDamaged) {
            System.out.println("Damaged car");
        } else {
            System.out.println("Accident free car");
        }

        if (carColor.equals("red")) {
            System.out.println("This car is red");
        } else if (carColor.equals("green")) {
            System.out.println("This car is green");
        } else if (carColor.equals("blue")) {
            System.out.println("This car is blue");
        } else {
            System.out.println("I have no idea what's the color of the car");
        }

        switch (energyEfficiencyCategory) {
            case 'A':
            case 'B':
                System.out.println("Low energy consumption");
                break;
            case 'G':
                System.out.println("Very high energy consumption");
                break;
            default:
                System.out.println("Not defined category");
        }

        {
            int numberOfOwners = 5;
            {
                numberOfOwners++;
            }
            System.out.println("Number of owners: " + numberOfOwners);
        }
    }
}
