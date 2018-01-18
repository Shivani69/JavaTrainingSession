package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while loop:
		//if no incremental/decremental counter is given, while loop will generate infinite loop
		//printing 1 to 10
		int i =1;//initialization
		while(i<=10) {//conditional
			System.out.println(i);
			i =i+1;//incremental or decremental
		}
		
		System.out.println("****************");
		
		//2. for loop:
		//j++ means increase the value of j by adding one to the counter.or j= j+1
		//printing 1 to 10
		 
		for(int j=1;j<=10; j++) {//initialization, conditional and then incrementation/decrementation
			System.out.println(j);
		}
		System.out.println("@@@@@@@@@");
		
		//printing 10 to 1
        for(int k=10;k>=-10; k--) {
        	System.out.println(k);
        }
	}

}
