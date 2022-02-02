package entities;

import Exceptions.TransactionException;

public abstract class Account {
	protected static int DEFAULT_BRANCH = 1;
	protected Integer number;
	protected Integer branch;
	protected String holder;
	protected Double balance;
	
	
	public Account() {
		
	}
	
	public Account(String holder, Double balance) {
		this.holder = holder;
		this.balance = balance;
	}
	
	
	
	public Integer getNumber() {
		return number;
	}
	
	public Integer getBranch() {
		return branch;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	

	public void withdraw(Double amount) throws TransactionException {
		if(amount<balance) {
			this.balance -= amount;
		}else {
			throw new TransactionException("You don't have enough balance for this transaction.");
		}
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void transfer(Double amount, Account account) throws TransactionException {
		this.withdraw(amount);
		account.deposit(amount);
		
	}
}
