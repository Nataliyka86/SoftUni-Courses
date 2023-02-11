package BankAccount2_03;

public class BankAccount {


    private static double interestRate = 0.02;
    private static int bankAccount = 0;
    private int id;
    private double balance;

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterestRate(int years) {
        return interestRate * years * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public BankAccount() {
        this.id = ++bankAccount;
        this.balance = 0;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static int getBankAccount() {
        return bankAccount;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}

