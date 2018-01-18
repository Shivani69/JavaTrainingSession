package OOPConceptPart1;

public class StaticAndNonStaticConcept {
//global variables --> the scope of global variables will be available across all the functions with some conditions
	String name ="Tom";//non static global variable
	static int age = 25;//static global variable
	
	public static void main(String[] args) {
		
		//how to call static methods or static variables
		//1. direct calling
		sum();
		
		//2. calling by classname:
		
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variables
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access the static variables using the object reference ? yes, but it is not a good practice.
		obj.sum();//a warning will be displayed saying that for class StaticAndNonStaticConcept should be accessed using the static way.
		
		
	}

	public void sendMail() {//non static method
		System.out.println("Send mail method");
	}
	public static void sum() {// static method
		System.out.println("Sum method");
	}
}
