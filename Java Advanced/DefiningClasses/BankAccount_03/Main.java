package BankAccount_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static final String CREATE = "Create";
    private static final String DEPOSIT = "Deposit";
    private static final String SET_INTEREST = "SetInterest";
    private static final String GET_INTEREST = "GetInterest";
    private static Map<Integer, BankAccount> accounts;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        accounts = new HashMap<>();

        while (!input.equals("End")) {
            String[] inputParts = input.split(" ");
            String command = inputParts[0];

            String result = "";
            switch (command) {
                case CREATE:
                    result = createAccount();
                    break;
                case DEPOSIT:
                    result = depositInAccount(inputParts);
                    break;
                case SET_INTEREST:
                    result = setInterest(inputParts);
                    break;
                case GET_INTEREST:
                    result = getInterest(inputParts);
                    break;
            }
            if (!result.isEmpty()) {

                System.out.println(result);
            }
            input = scanner.nextLine();
        }
    }

    private static String getInterest(String[] inputParts) {
        int id = Integer.parseInt(inputParts[1]);
        int years = Integer.parseInt(inputParts[2]);
        BankAccount bankAccount = accounts.get(id);
        if (bankAccount == null) {
            return "Account does not exist";
        } else {
            double interest = bankAccount.getInterest(years);
            return String.format("%.2f", interest);
        }
    }

    private static String setInterest(String[] inputParts) {
        double interest = Double.parseDouble(inputParts[1]);
        BankAccount.setInterestRate(interest);
        return "";
    }

    private static String depositInAccount(String[] inputParts) {
        int accountId = Integer.parseInt(inputParts[1]);
        double amount = Double.parseDouble(inputParts[2]);
        BankAccount bankAccount = accounts.get(accountId);
        if (bankAccount == null) {
            return "Account does not exist";
        }
        bankAccount.deposit(amount);
        return String.format("Deposited %d to ID%d", (int) amount, accountId);
    }

    private static String createAccount() {
        BankAccount bankAccount = new BankAccount();
        int id = bankAccount.getId();
        accounts.put(id, bankAccount);
        return String.format("Account ID%d created", id);
    }
}
