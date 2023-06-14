package OOP.Abstractions.CardSuit_011;

import java.util.Scanner;

public class Main {
    public enum Card {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Card[] cards = Card.values();

        System.out.println(input + ":");
        for (Card card : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name());
        }
    }
}
