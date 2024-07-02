package com.edlumens.java.oop.banking;

class FixedDepositAccount extends Account {
    private int tenureMonths; // Tenure of fixed deposit in months
    private double interestRate; // Interest rate applicable

    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths, double interestRate) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited into Fixed Deposit Account.");
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawal not allowed from Fixed Deposit Account before maturity.");
    }

    // Additional method specific to Fixed Deposit Account
    public void closeFixedDeposit() {
        balance += calculateInterest();
        System.out.println("Fixed Deposit Account closed. Final amount: $" + balance);
    }

    // Calculate interest accrued at maturity
    private double calculateInterest() {
        return balance * interestRate * (tenureMonths / 12.0);
    }
}
