import java.util.*;


public class Player {
	private int ante;
	private int left;
	private int peak;
	private int right;
	private ArrayList <Integer> bet;
	
	public Player () {
		ante = 0;
		left = 0;
		peak = 0;
		right = 0;
		bet = new ArrayList <Integer> ();
		for (int i = 0; i < 3; i ++) {
			bet.add (0);
		}
	}
	
	public int getAnte () {
		return ante;
	}

	public int getLeft () {
		return left;
	}
	
	public int getPeak () {
		return peak;
	}
	
	public int getRight () {
		return right;
	}
	
	public void setBet (int left, int peak, int right) {
		bet.set (0, left);
		bet.set (1, peak);
		bet.set (2, right);
	}
	
	public ArrayList <Integer> getBet () {
		return bet;
	}
	
	public void updateValues (int newAnte, int newLeft, int newPeak, int newRight) {
		ante += newAnte;
		left += newLeft;
		peak += newPeak;
		right += newRight;
	}
}
