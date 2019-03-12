import java.util.*;


public class Game {
	public Player player;
	public Deck deck;
	public Hand hand;
	public ArrayList <Integer> result;
	
	public Game (Player newPlayer) {
		player = newPlayer;
		deck = new Deck ();
		hand = new Hand ();
		result = new ArrayList <Integer> ();
		for (int i = 0; i < 3; i++) {
			result.add (0);
		}
	}
	
	public void dealHand () {
		deck.shuffleDeck ();
		hand.drawHand (deck);
	}
	
	public void playHand () {
		compareHand (hand.getHand ());
		calculateHand (player.getBet ());
	}
	
	public int getPeak () {
		return hand.getHand ().get (1).getNumber ();
	}
	
	public String getHand () {
		return hand.toString ();
	}
	
	public void calculateHand (ArrayList <Integer> bet) {
		int ante = 0;
		int left = 0;
		int peak = 0;
		int right = 0;
		
		if (bet.get (0) == result.get (0)) {
			left = 1;
		} else {
			left = -1;
		}
		
		if (bet.get (1) == result.get (1)) {
			peak = 1;
		} else {
			peak = -1;
			ante = -1;
		}
		
		if (bet.get (2) == result.get (2)) {
			right = 1;
		} else {
			right = -1;
		}
		
		player.updateValues (ante, left, peak, right);
	}
	
	public void compareHand (ArrayList <Card> currHand) {
		int leftCard = currHand.get (0).getNumber ();
		int peakCard = currHand.get (1).getNumber ();
		int rightCard = currHand.get (2).getNumber ();
		
		if (leftCard > peakCard && leftCard > rightCard) {
			result.set (0, 3);
			if (peakCard > rightCard) {
				result.set (1, 2);
				result.set (2, 1);
			} else {
				result.set (1, 1);
				result.set (2, 2);
			}
		} else if (peakCard > leftCard && peakCard > rightCard) {
			result.set (1, 3);
			if (leftCard > rightCard) {
				result.set (0, 2);
				result.set (2, 1);
			} else {
				result.set (0, 1);
				result.set (2, 2);
			}
		} else {
			result.set (2, 3);
			if (leftCard > peakCard) {
				result.set (0, 2);
				result.set (1, 1);
			} else {
				result.set (0, 1);
				result.set (1, 2);
			}
		}
	}
}
