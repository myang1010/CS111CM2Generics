
public class Name {

	private String first;
	private String last;
	
	public Name(){	
	}
	
	public Name(String firstName, String lastName){
		this.first=firstName;
		this.last=lastName;
	}
	
	public void setName(String firstName, String lastName){
		setFirst(firstName);
		setLast(lastName);
	}
	
	public String getName(){
		return toString();
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
	
	public void giveLastNameTo(Name aName){
		aName.setLast(last);
	}
	
	public String toString(){
		return first + " " + last;
	}
}
