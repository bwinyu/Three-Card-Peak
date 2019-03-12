import java.util.ArrayList;


public class Hand {
	private ArrayList <Card> hand;
	
	public Hand () {
		hand = new ArrayList <Card> ();
	}
	
	public void drawHand (Deck deck) {
		for (int i = 0; i <= 2; i++) {
			if (hand.size () != 3) {
				hand.add (deck.drawCard ());
			} else {
				hand.set (i, deck.drawCard ());
			}
		}
	}
	
	public ArrayList <Card> getHand () {
		return hand;
	}
	
	public String toString () {
		return hand.get (0).getNumber () + ", " + hand.get (1).getNumber () + ", " + hand.get (2).getNumber ();
	}
}
