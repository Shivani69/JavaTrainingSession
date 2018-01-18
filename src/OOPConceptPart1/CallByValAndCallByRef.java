package OOPConceptPart1;

public class CallByValAndCallByRef {

	int p;
	int q;
	
	
	public static void main(String[] args) {
		CallByValAndCallByRef  obj = new CallByValAndCallByRef();
		int x =10;
		int y =20;
		obj.testSum(x,y);//call by value or pass by value
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	// if changes are made in the copy fields the original values will not be changed.
    public int testSum(int a, int b) {
    	a =30;
    	b= 40;
    	int c =  a+b;
    	return c;
    }
    
    //call by reference is 
    public void swap(CallByValAndCallByRef t) {
    	int temp;
    	temp = t.p; // the value of temp =50
    	t.p = t.q; // the value of t.p =60
    	t.q = temp;//t.q = 50
    }
}
