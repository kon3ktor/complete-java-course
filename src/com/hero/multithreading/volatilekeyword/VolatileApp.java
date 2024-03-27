package com.hero.multithreading.volatilekeyword;

public class VolatileApp {

    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount(1000);
        BalanceReader balanceReader = new BalanceReader(bankAccount);
        balanceReader.start();

        BalanceReader anotherBalanceReader = new BalanceReader(bankAccount);
        anotherBalanceReader.start();

        bankAccount.deposit(1000);
        bankAccount.deposit(2000);
        bankAccount.deposit(3000);
        bankAccount.deposit(2500);
        bankAccount.deposit(1500);

        System.out.println("Final balance: $" + bankAccount.getBalance());
    }
}