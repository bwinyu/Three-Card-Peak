import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Player player = new Player ();
		Game game = new Game (player);
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print ("Number of hands: ");
		int numberHands = keyboard.nextInt ();
		
		for (int i = 0; i < numberHands; i++) {
			game.dealHand ();
			switch (game.getPeak ()) {
				case 2:
				case 3:
				case 4:
					player.setBet (3, 1, 3);
					break;
				case 5:
				case 6:
					player.setBet (3, 2, 3);
					break;
				case 7:
				case 8:
				case 9:
					player.setBet (1, 2, 3);
					break;
				case 10:
				case 11:
					player.setBet (1, 2, 1);
					break;
				case 12:
				case 13:
				case 1:
					player.setBet (1, 3, 1);
					break;
			}
			game.playHand ();
			System.out.println (game.getHand ());
		}
		
		int total = player.getAnte () + player.getLeft () + player.getPeak () + player.getRight ();		
		System.out.println ("Total Ante: " + player.getAnte () + " | Ante Per Hand: " + (double)player.getAnte () / numberHands);
		System.out.println ("Total Left: " + player.getLeft () + " | Left Per Hand: " + (double)player.getLeft () / numberHands);
		System.out.println ("Total Peak: " + player.getPeak () + " | Peak Per Hand: " + (double)player.getPeak () / numberHands);
		System.out.println ("Total Right: " + player.getRight () + " | Right Per Hand: " + (double)player.getRight () / numberHands);
		System.out.println ("Total Value: " + total + " | Total Per Hand: " + (double)total / numberHands);
		
		keyboard.close ();
	}
}
