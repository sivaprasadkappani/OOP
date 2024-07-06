package com.edlumens.java.oop.banking;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account[] accounts = new Account[10]; // Array to hold up to 10 accounts
		int count = 0;
		double totalBalance = 0.0;
		double interestRate = 8.1;

		System.out.println("Enter account details (name, number, balance), or 'exit' to finish:");

		while (true) {
			System.out.print("Exit? Type Y / N ");
			String name = scanner.nextLine();
			if (name.equalsIgnoreCase("Y")) {
				break;
			}

			System.out.print("Enter account number: ");
			String number = scanner.nextLine();

			System.out.print("Enter balance amount: ");
			double balance = Double.parseDouble(scanner.nextLine());

			// Create SavingsAccount object
			SavingsAccount account = new SavingsAccount(number, balance, interestRate);
			accounts[count] = account;
			totalBalance += balance;
			count++;

			System.out.println("Account added successfully.\n");
		}

		// Display all accounts
		System.out.println("\nAll Accounts:");
		for (int i = 0; i < count; i++) {
			displayAccountDetails(accounts[i]);
		}

		// Display total balance
		System.out.println("Total Balance in all accounts: " + totalBalance);

		scanner.close();
	}

	private static void displayAccountDetails(Account account) {
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("-------------------------");

	}

}