/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = new String[]{"A", "B", "C"};
		String[] suits = new String[]{"Giraffes", "Lions"};
		int[] values = new int[]{2, 1, 6};
		Deck Bernard = new Deck(ranks, suits, values);
		System.out.println(Bernard.size());
		System.out.println(Bernard.isEmpty());
		System.out.println(Bernard.deal().toString());
		System.out.println(Bernard.deal().toString());
		System.out.println(Bernard.deal().toString());
		System.out.println(Bernard.deal().toString());
		System.out.println(Bernard.deal().toString());
		System.out.println(Bernard.deal().toString());
		System.out.println(Bernard.isEmpty());
	}
}
