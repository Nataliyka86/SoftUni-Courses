package ConditionalStatements.More.Exercises;

import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double purchase = magnolias * 3.25 + hyacinths * 4.00 + roses * 3.50 + cactus * 8.00;
        double purchaseWithoutTax = purchase - (purchase * 0.05);

        if (purchaseWithoutTax>=giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(purchaseWithoutTax-giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(giftPrice-purchaseWithoutTax));
        }


    }
}
