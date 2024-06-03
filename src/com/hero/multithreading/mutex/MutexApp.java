package com.hero.multithreading.mutex;

public class MutexApp {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        Runnable withdrawal = () -> {
            for (int i = 0; i < 5; i++) {
                if (i == 1 && Thread.currentThread().getName().contains("0")) {
                    Thread.yield();
                    System.out.println(Thread.currentThread().getName() + " yielded.");
                }
                bankAccount.withdraw(200);
            }
        };

        Thread mom = new Thread(withdrawal);
        Thread dad = new Thread(withdrawal);

        mom.start();
        dad.start();

    }

}
