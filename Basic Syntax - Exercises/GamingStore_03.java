package BasicSyntaxConditionalStatementsandLoops.More;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double budget = balance;
        String game = scanner.nextLine();

        while (!game.equals("Game Time")) {
            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if (balance >= 39.99) {
                        balance -= 39.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (balance >= 15.99) {
                        balance -= 15.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (balance >= 19.99) {
                        balance -= 19.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (balance >= 59.99) {
                        balance -= 59.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (balance >= 29.99) {
                        balance -= 29.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
//                case "RoverWatch Origins Edition":
//                    if (balance >= 39.99) {
//                        balance -= 39.99;
//                System.out.printf("Bought %s%n", game);
//                    } else {
//                        System.out.println("Too Expensive");
//                    }
//                    break;
                default:
                    System.out.println("Not Found");
            }
            if (balance == 0) {
                System.out.println("Out of money!");
                break;
            }
            game = scanner.nextLine();
        }
        if (game.equals("Game Time")) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", budget - balance, balance);
        }
    }
}
