package com.hero.multithreading.mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final Lock lock = new ReentrantLock(true);

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " - Withdrawn: $" + amount + ", New Balance: $" + balance);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            } else {
                System.out.println("Insufficient funds. Balance: $" + balance);
            }
        } finally {
            lock.unlock();
        }
    }
}
