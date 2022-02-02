package application;

import Exceptions.TransactionException;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) throws TransactionException {
		
		try {
			BusinessAccount y = new BusinessAccount("Bob", 1000.0, 2000.0);
			Account z = new SavingsAccount("Bill", 1000.0, 0.01);
			
			y.transfer(100.0, z);
			
			System.out.println("Your account number: "+ y.getNumber());
			System.out.println("Your branch: "+ y.getBranch());
			System.out.println("Your balance: "+ y.getBalance());
			System.out.println();
			System.out.println();
			System.out.println("Your account number: "+ z.getNumber());
			System.out.println("Your branch: "+ z.getBranch());
			System.out.println("Your balance: "+ z.getBalance());
			
		} catch (TransactionException e) {
			System.out.println("Error on transaction: " + e.getMessage());
		}
		
	}

}
