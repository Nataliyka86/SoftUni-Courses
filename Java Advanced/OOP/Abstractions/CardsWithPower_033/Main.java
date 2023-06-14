package OOP.Abstractions.CardsWithPower_033;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        Card.Rank cardRank = Card.Rank.valueOf(rank);
        Card.Suit cardSuit = Card.Suit.valueOf(suit);

        Card card = new Card(cardRank, cardSuit);

        System.out.printf("Card name: %s of %s; Card power: %d%n", card.rank.name(), card.suit.name(), card.rank.rankPower + card.suit.suitPower);
    }

}
