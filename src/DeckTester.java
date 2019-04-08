/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
		int[] pointValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		Deck d = new Deck(ranks, suits, pointValues);

	

		System.out.println(d.toString());
		d.shuffle();
		System.out.println(d.toString());
	}
}
