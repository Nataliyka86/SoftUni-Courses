package BankAccount_03;

public class BankAccount {

    private static double interestRate = 0.02;
    private static int accountsCount = 0;
    private  int id;
    private double balance;
    public BankAccount(){
        accountsCount++;
        this.id = accountsCount;
                this.balance = 0;
    }

    public double getInterest(int years){
        return  this.balance * interestRate * years;
    }
    public void deposit(double balance){
        this.balance+=balance;
    }

    public static void setInterestRate(double interest){
        interestRate = interest;
    }
    public int getId(){
        return this.id;
    }

}
