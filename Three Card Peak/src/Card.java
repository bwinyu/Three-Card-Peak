
public class Card {
	private int number;
	private String suit;
	
	public Card (int newNumber, int newSuit) {
		number = newNumber;
		switch (newSuit) {
			case 1: 
				suit = "Diamonds";
				break;
			case 2:
				suit = "Clubs";
				break;
			case 3:
				suit = "Hearts";
				break;
			case 4:
				suit = "Spades";
				break;
		}
	}
	
	public Card (Card cardCopy) {
		this.number = cardCopy.number;
		this.suit = cardCopy.suit;
	}

	public int getNumber () {
		return number;
	}
	
	public String getSuit () {
		return suit;
	}
	
	public String getCard () {
		switch (number) {
			case 1: 
				return "Ace of " + suit;
			case 11:
				return "Jack of " + suit;
			case 12:
				return "Queen of " + suit;
			case 13:
				return "King of " + suit;
			default:
				return number + " of " + suit;
		}
	}
}