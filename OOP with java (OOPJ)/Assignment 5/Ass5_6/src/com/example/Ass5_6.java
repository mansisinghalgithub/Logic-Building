package com.example;

import java.util.Scanner;

public class Ass5_6 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        String[] accountHolders = new String[100];
        int[] accountNumbers = new int[100];
        double[] accountBalances = new double[100];
        int accountCount = 0;

        while (true) {
            System.out.println("Enter 'a' to create new account");
            System.out.println("Enter 'b' to deposit money into an account");
            System.out.println("Enter 'c' to withdraw money from an account");
            System.out.println("Enter 'd' to display the account balance");
            System.out.println("Enter 'e' to display the account holder's information");
            System.out.println("Enter 'q' to quit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    createAccount(scanner, accountHolders, accountNumbers, accountBalances, accountCount);
                    accountCount++;
                    break;
                case "b":
                    depositMoney(scanner, accountNumbers, accountBalances);
                    break;
                case "c":
                    withdrawMoney(scanner, accountNumbers, accountBalances);
                    break;
                case "d":
                    displayAccountBalance(scanner, accountNumbers, accountBalances);
                    break;
                case "e":
                    displayAccountInformation(scanner, accountNumbers, accountHolders, accountBalances);
                    break;
                case "q":
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void createAccount(Scanner scanner, String[] accountHolders, int[] accountNumbers,
                                      double[] accountBalances, int index) {
        System.out.println("Enter account holder's name: ");
        accountHolders[index] = scanner.nextLine();

        // Generate account number (simple increment)
        accountNumbers[index] = 1000 + index;

        // Initial account balance is zero
        accountBalances[index] = 0;

        System.out.println("Account created successfully.");
    }

    private static void depositMoney(Scanner scanner, int[] accountNumbers, double[] accountBalances) {
        System.out.println("Enter account number: ");
        int accountNumber = Integer.parseInt(scanner.nextLine());

        int index = findAccountIndex(accountNumbers, accountNumber);
        if (index != -1) {
            System.out.println("Enter amount to deposit: ");
            double amount = Double.parseDouble(scanner.nextLine());

            accountBalances[index] += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney(Scanner scanner, int[] accountNumbers, double[] accountBalances) {
        System.out.println("Enter account number: ");
        int accountNumber = Integer.parseInt(scanner.nextLine());

        int index = findAccountIndex(accountNumbers, accountNumber);
        if (index != -1) {
            System.out.println("Enter amount to withdraw: ");
            double amount = Double.parseDouble(scanner.nextLine());

            if (accountBalances[index] >= amount) {
                accountBalances[index] -= amount;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void displayAccountBalance(Scanner scanner, int[] accountNumbers, double[] accountBalances) {
        System.out.println("Enter account number: ");
        int accountNumber = Integer.parseInt(scanner.nextLine());

        int index = findAccountIndex(accountNumbers, accountNumber);
        if (index != -1) {
            System.out.println("Account balance: $" + accountBalances[index]);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void displayAccountInformation(Scanner scanner, int[] accountNumbers, String[] accountHolders,
                                                  double[] accountBalances) {
        System.out.println("Enter account number: ");
        int accountNumber = Integer.parseInt(scanner.nextLine());

        int index = findAccountIndex(accountNumbers, accountNumber);
        if (index != -1) {
            System.out.println("Account holder's name: " + accountHolders[index]);
            System.out.println("Account balance: $" + accountBalances[index]);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static int findAccountIndex(int[] accountNumbers, int accountNumber) {
        for (int i = 0; i < accountNumbers.length; i++) {
            if (accountNumbers[i] == accountNumber) {
                return i;
            }
        }
        return -1; // Account not found
    }
}
	



