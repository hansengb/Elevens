/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card jeff = new Card("Ace", "Spades", 1);
		Card jefe = new Card("Queen", "Clubs", 12);
		Card jeef = new Card("Ace", "Spades", 1);

		System.out.println(jeff.matches(jeef));
		System.out.println(jefe.toString());
		System.out.println(jefe.matches(jeef));
		System.out.println(jefe.rank());
		System.out.println(jeef.suit());
		System.out.println(jeff.pointValue());
		
	}
}
