/**
 * Question 6: Quad Class
	Write a generic class that represents a Quad, defined as a pair of Pair objects. 
	The Pair objects could hold different types (for example, a Quad could be made up of a Pair of Integers and a Pair of Strings). 
	Post the class header, instance data variables, constructor, and equals method. 
	Two Quad objects are equal if the two Pair objects are equal.
*/
import java.util.*;
public class Quad<T extends Comparable<? super T>,S extends Comparable<? super S>>{
	private Pair<T> item1;
	private Pair<S> item2;
	
	public Quad(Pair<T> item1, Pair<S> item2){
		this.item1 = item1;
		this.item2 = item2;
	}

	public Pair getItem1() {
		return item1;
	}

	public void setItem1(Pair item1) {
		this.item1 = item1;
	}

	public Pair getItem2() {
		return item2;
	}

	public void setItem2(Pair item2) {
		this.item2 = item2;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Quad<?,?>){
			Quad<?,?> otherObj = (Quad<?,?>)obj;
			boolean sameFirst = this.item1.equals(otherObj.item1) || this.item1.equals(otherObj.item2);
			boolean sameSecond = this.item2.equals(otherObj.item1) || this.item2.equals(otherObj.item2);
			return sameFirst&&sameSecond;
		}else
			return false;
	}
	
}
