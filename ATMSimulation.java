// write a java project to build ATM Machine Simulation Features : PIN verification, Show balance, Deposit/Withdraw, Exit
import java.util.Scanner;

public class ATMSimulation {
    private static final int PIN = 1234; // predefined PIN
    private static double balance = 1000.0; // initial balance
    private static boolean isAuthenticated = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM Machine Simulation!");

        // PIN verification
        while (!isAuthenticated) {
            System.out.print("Please enter your PIN: ");
            int enteredPin = scanner.nextInt();
            if (enteredPin == PIN) {
                isAuthenticated = true;
                System.out.println("PIN verified successfully!");
            }
            else {
                System.out.println("Incorrect PIN. Please try again.");
            }
        }

        // ATM operations
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Successfully deposited $%.2f. New balance: $%.2f%n", depositAmount, balance);
                    }
                    else {
                        System.out.println("Deposit amount must be positive.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("Successfully withdrew $%.2f. New balance: $%.2f%n", withdrawAmount, balance);
                    }
                    else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds for this withdrawal.");
                    }
                    else {
                        System.out.println("Withdrawal amount must be positive.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}