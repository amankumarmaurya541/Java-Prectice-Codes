package Assignment30;

import java.util.Scanner;

public class Assignment30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Mini Bank.");
        System.out.print("Enter account holder name: ");
        String holderName = sc.nextLine();

        System.out.print("Enter account number: ");
        double accountNumber = sc.nextDouble();

        System.out.print("Enter starting balance: ");
        double balance = sc.nextDouble();

        int choice = 0;
        while (choice != 4) {

            System.out.println("===== Banking Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("========================");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Amount For Deposit: ");
                double amount = sc.nextDouble();
                balance += amount;
                System.out.println(amount + " deposited successfully.");

            } else if (choice == 2) {
                System.out.print("Enter Amount To Withdraw: ");
                double amount = sc.nextDouble();
                if (amount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    balance -= amount;
                    System.out.println(amount + " withdrawn successfully.");
                }

            } else if (choice == 3) {
                System.out.println("Available Balance: " + balance);

            } else if (choice == 4) {
                System.out.println("Thank you, " + holderName + "! Goodbye!");

            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }
}