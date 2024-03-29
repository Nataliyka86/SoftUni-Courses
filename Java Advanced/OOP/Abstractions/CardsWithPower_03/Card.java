package OOP.Abstractions.CardsWithPower_03;

public class Card {


    enum Suit{
        CLUBS (0), DIAMONDS (13), HEARTS (26), SPADES (39);
        public final int power;
        Suit(int power){
            this.power = power;
        }

    }
    enum Rank{
        ACE (14),TWO (2), THREE (3), FOUR (4), FIVE (5), SIX (6), SEVEN (7),
        EIGHT (8), NINE (9), TEN (10), JACK (11), QUEEN (12), KING (13);
       public final int power;
        Rank(int power){
            this.power = power;
        }

    }
    Rank rank;
    Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public String getName() {
    return this.rank + " of " + this.suit;
    }
    public int getPower() {
    return this.rank.power + this.suit.power;
    }
}
