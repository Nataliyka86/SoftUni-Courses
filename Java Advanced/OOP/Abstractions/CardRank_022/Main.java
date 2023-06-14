package OOP.Abstractions.CardRank_022;

import java.util.Scanner;

public class Main {

    public enum CardRank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        CardRank[] cardRanks = CardRank.values();

        System.out.println(input + ":");
        for (CardRank cardRank: cardRanks){
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }
    }
}
