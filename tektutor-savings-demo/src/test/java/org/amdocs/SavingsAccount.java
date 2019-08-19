package org.amdocs;

public class SavingsAccount {
	public double getBalance() {
		System.out.println("Assume balance is retrieved from database");
		return 7000.0;
	}
	public double withdraw(double amountToBeWithdrawn)throws InsufficientBalanceException{
		
		System.out.println("Inside Withdraw method");
		
		double currentBalance = getBalance();
		
		if(amountToBeWithdrawn < currentBalance)
			currentBalance = currentBalance - amountToBeWithdrawn;
		else
			throw new InsufficientBalanceException();
		updateBalanceIntoDB(currentBalance);
		
		return currentBalance;
	}
	public void updateBalanceIntoDB(double acurrentBalance) {
		System.out.println("Asssume here balance is updated into database");
		
		
	}
}
