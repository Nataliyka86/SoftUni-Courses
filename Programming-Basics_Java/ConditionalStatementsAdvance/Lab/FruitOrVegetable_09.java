package ConditionalStatementsAdvance.Lab;

import java.util.Scanner;

public class FruitOrVegetable_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        switch (product) {
            case "apple":
            case "kiwi":
            case "cherry":
            case "banana":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;

        }

    }
}
