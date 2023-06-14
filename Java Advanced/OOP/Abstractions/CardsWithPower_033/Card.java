package OOP.Abstractions.CardsWithPower_033;

public class Card {
    enum Rank{
        ACE (14),TWO (2), THREE (3), FOUR (4), FIVE (5), SIX (6), SEVEN (7),
        EIGHT (8), NINE (9), TEN (10), JACK (11), QUEEN (12), KING (13);
        int rankPower;

        Rank(int rankPower) {
            this.rankPower = rankPower;
        }
    }

    enum Suit{
        CLUBS (0), DIAMONDS (13), HEARTS (26), SPADES (39);
        int suitPower;

        Suit(int suitPower) {
            this.suitPower = suitPower;
        }
    }

    Rank rank;
    Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
