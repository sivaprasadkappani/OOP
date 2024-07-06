package com.edlumens.java.oop.banking;

class SavingsAccount extends Account 
  implements Comparable<SavingsAccount>{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited into Savings Account.");
    }

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

    /*
    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }
    */
    
   

 
	 
}
