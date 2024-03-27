package com.hero.multithreading.volatilekeyword;

public class BankAccount {

    private volatile double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += amount;
        System.out.println("$" + amount + " added to the balance.");
    }

}
