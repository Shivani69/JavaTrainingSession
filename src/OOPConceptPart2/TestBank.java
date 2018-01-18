package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(USBank.min_bal);
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();

		// dynamic polymorphism
		// child class object can be referred by parent Interface reference variable
		// only overridden methods will be called
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
	}

}
