package OOPConceptPart2;

public class TestCar {

	// this is called static polymorphism ---compile time polymorphism 
	// during compile time, java compiler will check if there are common methods, which method to choose.
	//polymorphism -- one to many.
	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("*********************");
		
		// A parent cannot access all child class methods it can only access its own methods
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("*********************");
		
		//Top Casting
		Car c1 = new BMW();// child class object can be referred by parent class reference variable--- dynamic polymorphism
		// Run time ----polymorphism
		//only overridden methods and parent class methods can be accessed through dynamic polymorphism.
		c1.start();
		c1.stop();
		c1.engine();
		c1.refuel();
		
		//Down Casting
		// parent class cannot be referred by child class variables
		// we can cast it , but it will give an exception car class can not be casted to BMW class at run time.
		BMW b1=(BMW)new Car();// Class Cast exception
		
	}
	

}
