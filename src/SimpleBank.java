import java.util.Scanner;
import java.util.InputMismatchException;

class BankAccount {

    private String userName;
    private double balance;
    private String accountNumber;

    BankAccount(String name, double initialValue, String number) {
        userName = name;
        balance = initialValue;
        accountNumber = number;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.printf("Deposit of $%.2f completed successfully.%n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawal of $%.2f completed successfully.%n", amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public double getBalance(){
        return balance;
    }
}


public class SimpleBank {

    static BankAccount account = new BankAccount("João", 1000.0, "12345-6");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        runMenu();
    }

    public static void runMenu(){
        int option;
        do {
            System.out.println("\n===== Welcome to the Simple Bank =====");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Show Balance");
            System.out.println("4 - Quit");
            System.out.print("Choose one option: ");

            option = sc.nextInt();

            if (option == 1){
                System.out.print("Enter the amount to deposit: ");
                try {
                    double amount = sc.nextDouble();
                    account.deposit(amount);
                }
                catch (InputMismatchException e){
                    System.out.println("Error");
                    sc.nextLine();
                }
            }
            else if (option == 2) {
                System.out.print("Enter the amount to withdraw: ");

                try {
                    double amount = sc.nextDouble();
                    account.withdraw(amount);
                } catch (InputMismatchException e){
                    System.out.println("Error");
                    sc.nextLine();
                }
            }
            else if (option == 3) {
                System.out.printf("your balance is of $%.2f" , account.getBalance() );
            }
            else if (option == 4) {
                System.out.println("Leaving... Thank you for using Simple Bank!");
            }
            else {
                System.out.println("Invalid option! Please try again.");
            }

        } while (option != 4);
    }
}