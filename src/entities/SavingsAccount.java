package entities;

import Exceptions.TransactionException;

public class SavingsAccount extends Account {
	private static int SEQUENCE = 10;	
	private Double interestRate;
	
	public SavingsAccount (){
		super();
	}
	
	public SavingsAccount(String holder, Double balance, Double interestRate) {
		super(holder, balance);
		super.branch = DEFAULT_BRANCH;
		super.number = ++SEQUENCE;
		this.interestRate = interestRate;
	}
	

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += (balance * interestRate); 
	}
	
	@Override
	public void withdraw(Double amount) throws TransactionException {
		if(amount<=(this.balance+5.0)) {
			this.balance -= amount+5.0;
		}else {
			throw new TransactionException("You don't have enough balance for this withdraw.");
		}
		
	}
	
	@Override
	public void transfer(Double amount, Account account) throws TransactionException {
		if(amount<=this.balance) {
			this.balance -= amount;
			account.deposit(amount);
		}else {
			throw new TransactionException("You don't have enough balance for this transfer.");
		}
		
	}
	
	

}
