import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final int numberOfCards = 52;
    List<Card> deck = new ArrayList<>();
    public Deck() {
        createDeck();
    }
    private void createDeck(){
        for(int i = 1; i < 14; i++){
            for(int j = 0; j < 4; j++){
                deck.add(new Card(Card.Symbol.values()[j], i + 1));
            }
        }
    }
    void showDeck(){
        System.out.println(deck);
    }
}
