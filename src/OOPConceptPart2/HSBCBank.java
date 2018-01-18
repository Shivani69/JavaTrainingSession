package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank { // by including two interfaces we are achieving multiple inheritance
	// if a class is implementing an interface it is mandatory  to define/override all methods of interface.	
	//Is-a relationship -- interface and class relationship
// overridden from USBank
	public void credit() {
	System.out.println("HSBC ---- credit");	
		
	}

	public void debit(){
		System.out.println("HSBC----- Debit");
	}

	public void transferMoney(){
		System.out.println("HSBC----transferMoney");
	}
	// seperate from HSBC bank
	public void educationLoan() {
		System.out.println("HSBC ----Edu Loan");
	}
	public void carLoan(){
		System.out.println("HSBC----Car loan");
	}
// brazilbank method--- overriding from brazil bank
	public void mutualFunds() {
		System.out.println("HSBC----Mutual Funds");
		
	}
}
