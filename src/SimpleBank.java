import java.util.Scanner;

public class SimpleBank {

    static double balance = 0;

    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        Scanner sc= new Scanner(System.in);

        System.out.println("===== Welcome to the Simple Bank =====");
        System.out.println("1 - Deposit");
        System.out.println("2 - withdraw");
        System.out.println("3 - show balance ");
        System.out.println("4 - quit");
        System.out.println("choose one option: ");

        int option = sc.nextInt();

        if (option == 1){
            System.out.println("Enter the amount to deposit: ");
            double value = sc.nextDouble();
            deposit(value);
            menu();
        }
        else if (option == 2) {
            System.out.println("Enter the amount to withdraw");
            double value = sc.nextDouble();
            withdraw(value);
            menu();
        }
        else if (option == 3) {
            showBalance();
            menu();
        }
        else if (option == 4) {
            System.out.println("leaving...");
        }
        else {
            System.out.println("Invalid option!");
            menu();
        }
    }

    public static void deposit(double value){
        balance += value;
        System.out.println("the deposit was successfully completed");
    }
    public static void withdraw(double value){
        if (value > balance){
            System.out.println("Insufficient balance!");
        }
        else {
            balance -= value;
            System.out.println("Whithdraw was successfully completed");
        }
    }
    public static void showBalance(){
        System.out.println("Your balance actually is: $ " + balance);
    }

}
