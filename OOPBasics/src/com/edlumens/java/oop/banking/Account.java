package com.edlumens.java.oop.banking;

abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract methods to be implemented by subclasses
    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    // Concrete method
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int compareTo(SavingsAccount other) {
		// TODO Auto-generated method stub
		return other.getAccountNumber().compareTo( this.getAccountNumber());
	}
    
}
