package BankAccount2_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final String ACCOUNT_DOES_NOT_EXIST = "Account does not exist";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<Integer, BankAccount> bankMap = new HashMap<>();

        BankAccount bankAccount;

        while (!command.equals("End")) {
            String[] commandArr = command.split("\\s+");
            switch (commandArr[0]) {
                case "Create":
                    bankAccount = new BankAccount();
                    bankMap.put(bankAccount.getId(), bankAccount);
                    printCreate(bankAccount.getId());
                    break;
                case "Deposit":
                    int currentId = Integer.parseInt(commandArr[1]);
                    double currentDeposit = Double.parseDouble(commandArr[2]);
                    if (bankMap.containsKey(currentId)) {
                        bankMap.get(currentId).deposit(currentDeposit);
                        printDeposit(currentDeposit, currentId);
                    } else {
                        System.out.println(ACCOUNT_DOES_NOT_EXIST);
                    }
                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(commandArr[1]);
                    BankAccount.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    int currentIdd = Integer.parseInt(commandArr[1]);
                    int years = Integer.parseInt(commandArr[2]);
                    if (bankMap.containsKey(currentIdd)) {
                        double interest = bankMap.get(currentIdd).getInterestRate(years);
                        System.out.printf("%.2f%n", interest);
                    } else {
                        System.out.println(ACCOUNT_DOES_NOT_EXIST);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

    }

    private static void printDeposit(double currentDeposit, int id) {
        System.out.printf("Deposited %.0f to ID%d%n", currentDeposit, id);
    }

    private static void printCreate(Integer id) {
        System.out.printf("Account ID%d created%n", id);
    }
}
