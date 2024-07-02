package com.edlumens.java.oop.banking;

public class BankingSystem {
    public static void main(String[] args) {
        // Creating instances of different types of accounts
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 5000, 2.5);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 10000, 2000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FDA001", 20000, 12, 5.0);

        // Depositing and withdrawing from Savings Account
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(1000);

        // Displaying balance of Savings Account
        savingsAccount.displayBalance();

        // Depositing and withdrawing from Current Account
        currentAccount.deposit(3000);
        currentAccount.withdraw(15000);

        // Displaying balance of Current Account
        currentAccount.displayBalance();

        // Closing Fixed Deposit Account
        fixedDepositAccount.closeFixedDeposit();
    }
}
