package com.edlumens.java.oop.banking;

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited into Current Account.");
    }

    @Override
    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn from Current Account.");
        } else {
            System.out.println("Insufficient funds (including overdraft) in Current Account.");
        }
    }
}
