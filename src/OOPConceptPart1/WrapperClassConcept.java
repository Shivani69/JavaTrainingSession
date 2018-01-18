package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		
		//data conversion from string to integer:
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		
		//String to Double conversion
		String y ="12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean conversion:
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String conversion
		int j = 200;
		System.out.println(j+20);
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		//if  when converting a string to integer, the string is purely not numeric on conversion user will get number format exception error.
		// in order to use the parseInt method the string must be purely numeric  
		String u = "100A";
		Integer.parseInt(u);//Number Format exception for 100A
	}

}
