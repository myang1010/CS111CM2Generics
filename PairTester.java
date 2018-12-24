
public class PairTester {

	public static void main(String[] args) {
		Pair<Integer> numberPair = new Pair<Integer>(3,4);
		Pair<Integer> numberPair2 = new Pair<Integer>(4,3);
		Pair<String> wordPair = new Pair<String>("hello", "goodbye");
		Pair<String> wordPair2 = new Pair<String>("goodbye","hello");
		
		System.out.println("numberPair and numberPair2 the same? " + numberPair.equals(numberPair2));
		System.out.println("wordPair and wordPair2 the same? " + wordPair.equals(wordPair2));
		System.out.println("wordPair and numberPair the same? " + wordPair.equals(numberPair));
		System.out.println("numberPair is smaller than numberPair2? should be a negative number " + numberPair.compareTo(numberPair2));	
		System.out.println("wordPair is bigger than wordPair2? should be a positive number " + wordPair.compareTo(wordPair2));
/*		
		//System.out.println(wordPair);
		
		// testing our sameItems method
		String s1 = new String("apple");
		String s2 = new String("apple");
		Pair<String> wordPair2 = new Pair<String>(s1, s2);
		System.out.println("wordPair2 contains the same items? " + wordPair2.sameItems());
		
		PairDifferent<Integer,String> numberWordPair = new PairDifferent<Integer,String>(2, "hello");
		PairDifferent<Integer,Integer> doubleNumberPair = new PairDifferent<Integer,Integer>(1,1);
*/
	}

}
