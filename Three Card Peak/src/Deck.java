import java.util.*;


public class Deck {
	private ArrayList <Card> deck;
	private final int MAX_SUIT = 4;
	private final int MAX_NUM = 13;
	
	public Deck () {
		deck = new ArrayList <Card> ();
		for (int i = 1; i <= MAX_SUIT; i++) {
			for (int j = 1; j <= MAX_NUM; j++) {
				Card newCard = new Card (j, i);
				deck.add (newCard);
			}
		}
	}
	
	public void shuffleDeck () {
		Collections.shuffle (deck);
	}
	
	public Card drawCard () {
		Card newCard = new Card (deck.get (0));
		Collections.rotate (deck, -1);
		return newCard;
	}
}
