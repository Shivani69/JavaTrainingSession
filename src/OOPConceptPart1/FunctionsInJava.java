package OOPConceptPart1;

public class FunctionsInJava {
//main method is a starting point of an execution
	public static void main(String[] args) {
		 FunctionsInJava obj = new  FunctionsInJava();
		//one object will be created, obj is the object reference variable, referring to this object
		 // after creating this object copy of all non static methods will be given to this object
		 
		 //it is compulsory to create an object method inorder to call all non static methods
		 
	     obj.test();
	     int l = obj.pqr();
	     System.out.println(l);
	     
	     String s1= obj.qa();
	     System.out.println(s1);
	     
	    int div = obj.division(30, 10);
	    System.out.println(div);
	    
	  //main method is void, as it never returns a value 
	}
	// non static methods
	//void does'nt return any value
	//return type = void
	public void test() {
		System.out.println("test method");
	}
	//return type = int
	public int pqr() {//no input but some output
		System.out.println("PQR method");
		int a =10;
		int b =20;
		int c =a+b;
		return c;
		
	}
	//return type = string
	public String qa() {// no input some output
		System.out.println("QA method");
		String s = "Selenium";
		return s;
	}
	
	//x,y ---> input parameters/input arguments
	//return type - int
	//if you are using return statement you can use void
	public int division(int x, int y) {
		System.out.println("division method");
		int d =x/y;
		return d;
	}
}

