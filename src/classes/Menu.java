package classes;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Java Programming to manage the bank account");
        System.out.print("What is your name?: ");
        String name = input.nextLine();
        System.out.print("What is your id: ");
        int id = input.nextInt();
        Account account = new Account(name, id);
        showMenu(input, account);
    }

    //Method to show the menu
    public static void showMenu(Scanner input, Account account) {
        boolean displayMenu = true;
        while (displayMenu) {
            System.out.println();
            System.out.println("1. Deposit money \n2. Withdraw money \n3. Account extract");
            System.out.print("Enter your choice: ");
            try {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Type the amount to deposit: ");
                        account.deposit(input.nextInt());
                        break;
                    case 2:
                        System.out.print("Type de amount to withdraw: ");
                        account.withdraw(input.nextInt());
                        break;
                    case 3:
                        account.accountStatement();
                        break;
                    case 0:
                        System.out.println("Thank you for using our program!");
                        displayMenu = false;
                }
            } catch (Exception e) {
                System.out.println("Choose a valid option");
                input.next();
            }
        }
    }
}
