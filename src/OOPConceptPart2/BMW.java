package OOPConceptPart2;

public class BMW extends Car {// has-a relationship--- class to class relationship

	//when same method is present in parent as well child class with the same name and same number of arguments 
	//it is known as Method Overriding
	public void start(){// overridden method this will be given preference
		System.out.println("BMW----start");
	}
	public void theftSafety(){
		System.out.println("BMW----theftSafety");
		
	}
}
