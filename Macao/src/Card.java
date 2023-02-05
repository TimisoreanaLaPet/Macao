import java.util.List;

public class Card {
    enum Symbol {Hearts, Spades, Clubs, Diamonds}
    private Symbol symbol;
    private int value;

    public Card(Symbol symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        return value + " of " + symbol;
    }
}
