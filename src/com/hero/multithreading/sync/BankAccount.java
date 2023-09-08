package com.hero.multithreading.sync;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public synchronized void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            try {
                System.out.println("3DS verification in progress.");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        }
    }
}
