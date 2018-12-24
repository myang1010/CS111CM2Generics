
public class Pairs<T, S> {
	
	private T first;
	private S second;
	
	public Pairs(T firstItem, S secondItem){
		first = firstItem;
		second = secondItem;
	}
	
	public String toString(){
		return "(" + first + ", " + second + ")";
	}

}
