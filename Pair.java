
public class Pair<T extends Comparable<? super T>> implements Comparable<Pair<T>> {
	
	private T item1, item2;
	
	public Pair(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T getItem1() {
		return item1;
	}
	public T getItem2() {
		return item2;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	
	@Override
	public String toString() {
		return item1.toString() + "\t" + item2.toString();
	}
	
	public boolean sameItems() {
		return item1.equals(item2);
		// return item1==item2; INCORRECT! tests for aliases, not logical equivalence
	}
	
	/*Question 1: Pair Modification A- equals Method
	Add an equals method to the Pair class from the Module 2 Lecture Code. 
	Two Pair objects are logically equivalent if their two objects are logically equivalent (ignoring order). 
	For example, using this definition, the Pair (1,2)  would be equal to the Pair (2,1). 
	Post only the equals method (do not post the rest of the class that was unchanged).	
	*/
	@Override
	public boolean equals(Object obj){
		
		if (obj instanceof Pair<?>){
			Pair<?> another = (Pair<?>) obj;

			return((this.item1.equals(another.item1) || this.item1.equals(another.item2) ||
					this.item1==another.item1 ||this.item1 == another.item2) && 
					(this.item2.equals(another.item1) || this.item2.equals(another.item2) || 
					this.item1==another.item1 || this.item2==another.item2));	// the == is not necessary.

			/*
			other student's best way to do is,
			
			boolean sameItem1 = this.item1.equals(otherPair.item1) || this.item1.equals(otherPair.item2);
        	boolean sameItem2 = this.item2.equals(otherPair.item2) || this.item2.equals(otherPair.item1);

        	return sameItem1 && sameItem2;
			 */
		}
		else
			return false;
	}
	
//	//Question 2: Question 2: Pair Modification B- compareTo Method
//	Modify the Pair class  from the Module 2 Lecture Code so that Pair implements Comparable. 
//	(Use the class header and method header below.) Implement the compareTo method. 
//	Order Pairs by the first and then second item in the Pair. 
//	public class Pair<T extends Comparable<? super T>> implements Comparable<Pair<T>> 
//	public int compareTo(Pair<T> pair)
//	(Note: with the definition of equals and compareTo required here, 
//	two Pair objects can be equal but compareTo would not return 0! 
//	This is rare, but it does happen! See here (Links to an external site.)Links to an external site. 
//	for the description of this on the API page and here (Links to an external site.)Links to an external site. for an example.)

	@Override
	public int compareTo(Pair<T> other){
		if(this.item1.compareTo(other.item1)==0)
			return this.item2.compareTo(other.item2);
		else return this.item1.compareTo(other.item1);
	}

	
}
