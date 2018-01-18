package OOPConceptPart2;

public interface USBank {

	int min_bal =100;// this value of variables cannot be changed--- constant in nature
	
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	// only method declaration
	// no method body -- no method prototype
	// in interface we can declare variables and the variables are static by default in nature
	//value of variables will not be changed.
	// no static methods in interface.--- interface are part of object programing language and objects never have static methods.
	// no main method in interface
	// we cannot create the object of interface.
	// interface are abstract in nature.
	
}
