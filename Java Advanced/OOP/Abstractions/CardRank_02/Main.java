package OOP.Abstractions.CardRank_02;

public class Main {

    enum CardRank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }
    public static void main(String[] args) {
        CardRank[] values = CardRank.values();
        System.out.println("Card Ranks:");
        for (CardRank value : values) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value);
        }
    }
}
