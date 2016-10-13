package Customer;

import Users.Customer;
@SuppressWarnings("unused")
public class CreditCard {
	
	private int number;
	private String expirationDate;
	private int CVS;
	
	private Customer owner;

	public CreditCard() {
		
	}

	public void print(){
		System.out.println(String.format("Number: %s - Expiration Date: %s - CVS: %s", this.number, this.expirationDate, this.CVS));
	}
	public CreditCard(int number, String expirationdate, int CVS, Customer owner) {
		this.number = number;
		this.expirationDate = expirationdate;
		this.CVS = CVS;
		
		this.owner = owner;
	}

}
