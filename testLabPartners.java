//import java.util.*;

public class testLabPartners {

	public static void main(String[] args){
		
		Name student1 = new Name("Jane","Doe");
		Name student2 = new Name("What","Who");
		Integer number = new Integer((int) (Math.random()*10));
		
		OrderedPair<Name> labPartners = new OrderedPair<Name>(student1, student2);
		
		System.out.println(labPartners);

		
		Pairs<Name,Integer> nameAndNumber = new Pairs<Name,Integer>(student1, number);
		
		System.out.println(nameAndNumber);
	}
}
