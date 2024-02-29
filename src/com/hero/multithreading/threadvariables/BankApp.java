package com.hero.multithreading.threadvariables;

public class BankApp {

    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        new Thread(transaction).start();
        new Thread(transaction).start();
    }
}
