package entities;

public class BusinessAccount extends Account {
	private static int SEQUENCE = 1000;
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
	
	
	public BusinessAccount(String holder, Double balance, Double loanLimit) {
		super(holder, balance);
		super.branch = DEFAULT_BRANCH;
		super.number = ++SEQUENCE;			
		this.loanLimit = loanLimit;
	}


	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void loan(double amount) {
		if(amount<=loanLimit) {
			balance += amount - 10.0 ;
		}
	}


	
	
	

}
