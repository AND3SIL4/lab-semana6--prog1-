package classes;

import java.util.Random;

public class Account {
    private final int accountNumber;
    public String bankName;
    public String customerName;
    private final int idCustomer;
    private int balance;

    //Set the constructor values
    public Account(String customerName, int idCustomer) {
        this.accountNumber = new Random().nextInt(100);
        this.bankName = "Wells Fargo";
        this.customerName = customerName;
        this.idCustomer = idCustomer;
        this.balance = 0;
    }

    //Method to manage the deposit
    public void deposit(int amount) {
        if (amount > 0) this.balance = amount;
    }

    //Method to manage the withdraw
    public void withdraw(int amount) {
        if (amount < this.balance && amount > 0) this.balance -= amount;
        else System.out.println("Withdraw failed");
    }

    //Account statement
    public void accountStatement() {
        System.out.println("*******************************");
        System.out.println("Bank name: " + this.bankName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Customer data: " + this.idCustomer + " " + this.customerName);
        System.out.println("Account Balance: " + this.balance);
        System.out.println("*******************************");
    }
}
