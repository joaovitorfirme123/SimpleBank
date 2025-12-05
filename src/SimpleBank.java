import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

class BankAccount {

    private String userName;
    protected double balance;
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
    public String getAccountNumber(){
        return accountNumber;
    }
}

class SavingAccount extends BankAccount{

    SavingAccount(String name, double initialValue, String number){
        super(name, initialValue, number);
    }

    public void earnInterest(){
        double interest = balance * 0.05;
        balance += interest;
        System.out.printf("Interest of $%.2f applied.%n", interest);
    }

}


public class SimpleBank {

    static ArrayList<BankAccount> accounts = new ArrayList<>();
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
            System.out.println("5 - Open Account");
            System.out.println("6 - Savings Account");
            System.out.println("7 - Apply Interest");
            System.out.print("Choose one option: ");
        try {
            option = sc.nextInt();
        } catch (InputMismatchException e){
            option = 0;
            sc.nextLine();
            System.out.println("Please enter a number.");
        }


            if (option == 1){
                if (!accounts.isEmpty()) {
                    sc.nextLine();
                    System.out.print("Write number account: ");
                    String account = sc.nextLine();
                    boolean found = false;
                    for (BankAccount BA : accounts) {
                        if (BA.getAccountNumber().equals(account)) {
                            found = true;
                            System.out.print("Enter the amount to deposit: ");
                            try {
                                double amount = sc.nextDouble();
                                BA.deposit(amount);
                            } catch (InputMismatchException e) {
                                System.out.println("Error");
                                sc.nextLine();
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found");
                    }
                }
                else {
                    System.out.println("No account found");
                }

            }
            else if (option == 2) {
                if (!accounts.isEmpty()) {
                    sc.nextLine();
                    System.out.print("Write number account: ");
                    String account = sc.nextLine();
                    boolean found = false;
                    for (BankAccount BA : accounts) {
                        if (BA.getAccountNumber().equals(account)) {
                            found = true;
                            System.out.print("Enter the amount to withdraw: ");
                            try {
                                double amount = sc.nextDouble();
                                BA.withdraw(amount);
                            } catch (InputMismatchException e) {
                                System.out.println("Error");
                                sc.nextLine();
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found");
                    }
                }
                else {
                    System.out.println("No account found");
                }
            }
            else if (option == 3) {
                if (!accounts.isEmpty()) {
                    sc.nextLine();
                    System.out.print("Write number account: ");
                    String account = sc.nextLine();
                    boolean found = false;
                    for (BankAccount BA : accounts) {
                        if (BA.getAccountNumber().equals(account)) {
                            found = true;
                            System.out.printf("your balance is of $%.2f%n", BA.getBalance());
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found");
                    }
                }
                else {
                    System.out.println("No account found");
                }
            }

            else if (option == 4) {
                System.out.println("Leaving... Thank you for using Simple Bank!");
            }
            else if (option == 5) {
                try {
                    sc.nextLine();

                    System.out.println("Write your name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter the amount to first deposit");
                    double amount = sc.nextDouble();

                    sc.nextLine();

                    System.out.println("Enter a number account");
                    String accountNumber = sc.nextLine();

                    accounts.add(new BankAccount(name, amount, accountNumber));
                    System.out.println("Account created successfully!");
                }
                catch (InputMismatchException e){
                    System.out.println("Error");
                    sc.nextLine();
                }
            }
            else if (option == 6) {
                try {
                    sc.nextLine();

                    System.out.println("Write your name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter the amount to first deposit");
                    double amount = sc.nextDouble();

                    sc.nextLine();

                    System.out.println("Enter a number account");
                    String accountNumber = sc.nextLine();

                    accounts.add(new SavingAccount(name, amount, accountNumber));
                    System.out.println("Account created successfully!");
                }
                catch (InputMismatchException e){
                    System.out.println("Error");
                    sc.nextLine();
                }
            }
            else if (option == 7) {
                if (!accounts.isEmpty()) {
                    sc.nextLine();
                    System.out.print("Write number account: ");
                    String account = sc.nextLine();
                    boolean found = false;

                    for (BankAccount BA : accounts) {

                        if (BA.getAccountNumber().equals(account)) {
                            found = true;
                            if (BA instanceof SavingAccount) {
                                SavingAccount savings = (SavingAccount) BA;
                                savings.earnInterest();
                            }
                            else {
                                System.out.println("This is a standard account. Interest cannot be applied.");
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found");
                    }
                } else {
                    System.out.println("No accounts registered.");
                }
            }

            else {
                System.out.println("Invalid option! Please try again.");
            }

        } while (option != 4);
    }
}



