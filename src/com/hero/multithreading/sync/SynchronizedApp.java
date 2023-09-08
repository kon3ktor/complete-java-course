package com.hero.multithreading.sync;

public class SynchronizedApp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread withdrawalMom = new Thread(() -> account.withdraw(800));
        Thread withdrawalDad = new Thread(() -> account.withdraw(400));

        withdrawalMom.start();
        withdrawalDad.start();


    }
}
