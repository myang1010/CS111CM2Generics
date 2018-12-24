/*
 * Question 3: Box Modification A- Box with History
Modify the Box class from the Module 2 Lecture Code. 
Add an ArrayList to keep track of the "box history"- all items that have been previously added to the box.

Post the new instance data variable, modified constructor, and the modified replaceContents method. 
 * */

import java.util.*;
public class Box<T extends Comparable<? super T>> implements Comparable<Box<T>> {
	
	private T thing;
	private int thingCount;
	
	private T[] oldThings;
	private ArrayList<T> boxHistory = new ArrayList<T>(); //Question 3
	
	public Box(T firstThing) {
		this.thing = firstThing;
		this.thingCount = 1;
		boxHistory.add(this.thing); //Question 3
		
		//oldThings = new T[5]; // not allowed
		oldThings = (T[]) (new Comparable[5]); // allowed
		
	}
	
	public T getContents() {
		return thing;
	}
	public int getCount() {
		return thingCount;
	}
	
	public void replaceContents(T newThing) {
		this.thing = newThing;
		thingCount++;
		boxHistory.add(this.thing); //Question 3
		
	}
	
	@Override
	public String toString() {
		return thing.toString() + " (item " + thingCount + ")" + " history is " +  boxHistory;
	}
	
	/*
	 * Question 4: Box Modification B- Box with History equals method
		Using the modified Box class described above in Part A, update the Box equals method. 
		Two boxes are logically equivalent if they have the same item and same history of items.
	 */
//	@Override
//	public boolean equals(Object other){
//		if (other instanceof Box<?>){
//			Box<?> another = (Box<?>) other;
//			
//			return (this.boxHistory.equals(another.boxHistory)&&this.oldThings.equals(another.oldThings));
//		}
//		else
//				return false;
//	}
	
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Box<?>) {
			Box<?> otherBox = (Box<?>) other;
			
			boolean sameThing = this.thing.equals(otherBox.thing);
			boolean sameCount = this.thingCount==otherBox.thingCount;
			
			return sameThing && sameCount;
			
		} else {
			return false;
		}
	}
	
	
	/*
	 * Question 5: Box Modification C- Box with History compareTo method
		Using the modified Box class described above in Part A, update the compareTo method. 
		Boxes should be ordered based on the current item in the box. If the current item is the same, 
		then order based on the number of times the item has been replaced. 
		If the number of replacements is also the same, then order based on the comparison of the first item in the history. 	 
	 * */
//	@Override
//	public int compareTo(Box<T> otherBox){
//		if(this.thing.equals(otherBox.thing)&&(this.thingCount==otherBox.thingCount))
//
//			return this.boxHistory.get(boxHistory.size()-1).compareTo(otherBox.boxHistory.get(boxHistory.size()-1));
//		else if(this.thing.equals(otherBox.thing))
//			return Integer.compare(this.thingCount,otherBox.thingCount);
//		else
//			return this.thing.compareTo(otherBox.thing);
//	}
	
	
	@Override
	public int compareTo(Box<T> otherBox) {
		if(this.thing.compareTo(otherBox.thing)==0) {
			return Integer.compare(this.thingCount, otherBox.thingCount);
		} else {
			return this.thing.compareTo(otherBox.thing);	
		}
	
	}

}
