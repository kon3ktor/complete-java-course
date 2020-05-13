package com.beginner.methods;

public class FunctionApp {
    public static void main(String[] args) {
        sayHello();
        blackboardPunishment(5);
        System.out.println("The price with 10% off: " + getTenPercentOffDiscountPrice(20000));
        System.out.println("The price with 50% off: " + getDiscountPrice(20000, 50));
        System.out.println("The price with 40% off: " + getDiscountPrice(20000.75, 60));
        System.out.println(getEnergyEfficiency('b'));
        getCarDescription("Tesla Roadster", 2018, "good");
    }

    static void sayHello(){
        System.out.println("Hello!!!");
    }

    static void blackboardPunishment(int repeatNumber){
        for (int i = 1; i <= repeatNumber; i++){
            System.out.println("BEING RIGHT SUCKS!");
        }
    }

    static double getTenPercentOffDiscountPrice(int price){
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percent){
        return price * percent / 100.0;
    }

    static double getDiscountPrice(double price, int percent){
        return price * percent / 100;
    }

    static String getEnergyEfficiency(char category){
        switch (category){
            case 'A':
            case 'a':
                return "Very low energy consumption";
            case 'B':
            case 'b':
                return "Low energy consumption";
            case 'C':
            case 'c':
                return "Normal energy consumption";
            case 'D':
            case 'd':
                return "Above normal energy consumption";
            case 'E':
            case 'e':
                return "High energy consumption";
            case 'F':
            case 'f':
                return "Very high energy consumption";
            case 'G':
            case 'g':
                return "Extremely high energy consumption";
            default:
                return "not defined category";
        }
    }

    static void getCarDescription(String model, int productionYear, String condition){
        System.out.println("This car is a " + model);
        System.out.println("Production year: " + productionYear);
        System.out.println("It is in " + condition + " condition");

    }
}
