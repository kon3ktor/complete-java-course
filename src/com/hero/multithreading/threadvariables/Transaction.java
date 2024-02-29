package com.hero.multithreading.threadvariables;

import java.util.Random;

public class Transaction implements Runnable {
    private double balance;

    @Override
    public void run() {
        balance = new Random().nextDouble() * 100;
        double transactionAmount = new Random().nextDouble() * 100;
        System.out.println("Balance: " + balance + " Transaction amount: " + transactionAmount);

    }
}
