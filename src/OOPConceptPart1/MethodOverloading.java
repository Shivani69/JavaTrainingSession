package OOPConceptPart1;

public class MethodOverloading {
//main method can also be overloaded with different input parameters or arguments
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
	    obj.sum(10);
	    obj.sum(10, 5);
	    obj.sum(10.33);
		
		
	}
	
	public static void main(int p) {
		
		
	}
	public static void main(int q, int h) {
		
	}
	
	// you cannot create a method inside a method
	//duplicate methods ---> with same name and same number of arguments or  input parameters or same data  types  is not allowed
	
//the concept of having three same methods with different arguments or input parameters and different data types within the same class is known as method overloading.
	public void sum() {//0 input parameter
		System.out.println("Sum Method ---- zero parameters");
		// two methods cannot have the same name inside a method  or with the same name
	}
	public void sum(int i) {//1 input parameter
		System.out.println("Sum Method--- 1 input params");
		System.out.println(i);
	}
	public void sum(int k, int l) {//two input parameters 
		System.out.println("sum method--- 2 input params");
		System.out.println(k+l);
		
	}
	public void sum(double d) {//1 input parameter
		System.out.println("Sum Method--- 1 input params");
		System.out.println(d);
	}
}
