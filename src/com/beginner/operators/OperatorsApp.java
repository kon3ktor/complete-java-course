package com.beginner.operators;

public class OperatorsApp {
    public static void main(String[] args) {
        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 1000000;
        boolean isDamaged = true;


        System.out.println("Price: €" + price);
        int priceIncreased = price + 1000;
        System.out.println("Increased price: €" + priceIncreased);
        int priceDecreased = price - 1000;
        System.out.println("Decreased price: €" + priceDecreased);
        int priceTwoCars = price * 2;
        System.out.println("Two car's price: €" + priceTwoCars);
        int dodgesYouCanBuy = moneyInTheBank / price;
        System.out.println("Dodged you can buy for you money: " + dodgesYouCanBuy);
        int moneyRemain = moneyInTheBank % price;
        System.out.println("Money I'll have after buying " + dodgesYouCanBuy + " Dodge Challenger: €" + moneyRemain);
        System.out.println();

        int priceNegative = -14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign: €" + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with minus sign: €" + priceNegativeWithMinusSign);

        int priceOneEuroIncrease = ++price;
        System.out.println("Price after one € price increase: €" + priceOneEuroIncrease);
        System.out.println("Original price after one € price increase: €" + price);
        int priceOneEuroDecrease = --price;
        System.out.println("Price after one € price decrease: €" + priceOneEuroDecrease);
        System.out.println("Original price after one € price decrease: €" + price);

        System.out.println("The car is damaged: " + !isDamaged);
        System.out.println();

        System.out.println("Car's price equals to the money in the bank: " + (price == moneyInTheBank));
        System.out.println("Car's price not equals to the money in the bank: " + (price != moneyInTheBank));
        System.out.println("Car's price greater than the money in the bank: " + (price > moneyInTheBank));
        System.out.println("Car's price lesser than the money in the bank: " + (price < moneyInTheBank));
        System.out.println("Car's price greater than or equals to the money in the bank: " + (price >= moneyInTheBank));
        System.out.println("Car's price lesser than or equals to the money in the bank: " + (price <= moneyInTheBank));
        System.out.println("Car's model variable is a String: " + (carModel instanceof String));
        System.out.println();


        String damagedText = !isDamaged ? "The car is damaged." : "The car isn't damaged.";
        System.out.println(damagedText);
        System.out.println();

        String worthSeeingMessage = !isDamaged || price < 20000 ? "It's worth seeing the car." : "It's not worth seeing the car.";
        System.out.println(worthSeeingMessage);
        String worthRepairing = isDamaged && price < 15000 ? "It's worth repairing the car." : "It's not worth repairing the car.";
        System.out.println(worthRepairing);
        System.out.println();

        price += 1000;
        System.out.println("Increased price: €" + price);
        price -= 1000;
        System.out.println("Decreased price: €" + price);
        price *= 2;
        System.out.println("Doubled price: €" + price);
        price /= 2;
        System.out.println("Half price: €" + price);
        price %= 10000;
        System.out.println("Remained price: €" + price);
    }
}
