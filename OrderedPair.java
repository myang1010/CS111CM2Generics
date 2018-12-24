
public class OrderedPair<T> {
	
	private T first, second;
	
	public OrderedPair(T firstItem, T secondItem){
		first = firstItem;
		second = secondItem;
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}

	@Override
	public String toString(){
		return "(" + first + ", " + second + ")";
	}
	
	public void changeOrder(){
		T temp = first;
		first = second;
		second = temp;
	}
}
