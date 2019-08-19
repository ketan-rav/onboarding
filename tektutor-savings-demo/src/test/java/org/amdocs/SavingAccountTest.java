package org.amdocs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.mockito.Mockito;

public class SavingAccountTest {
	private SavingsAccount account;
	private SavingsAccount accountSpy;
	
	@Before
	public void setup() {
		account = new SavingsAccount();
		//partial mocking or spying
		accountSpy = Mockito.spy (account);
	}

	@After
	public void tearDown() {
		account = null;
		accountSpy = null;
	}
	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException {
		 
		
		//partial mocking or spy 
		
		//stubbing - hard coding the response of getBalnce method
		
		Mockito.doReturn (5000.0).when(accountSpy).getBalance();
		Mockito.doNothing().when(accountSpy).updateBalanceIntoDB (Mockito.anyDouble());
		
		//code under test i.e we are testing withdraw method
		double updateBalance = accountSpy.withdraw(1000.0);
		double expectedBalance= 4000.0;
		
		assertEquals( expectedBalance, updateBalance, 0.0001);
		
		//check if getBalance method was invoked exactly 1 time within withdraw method
		Mockito.verify( accountSpy, Mockito.times(1)).getBalance();
		//check if updateBalanceIntoDB method was invoked exactly once within withdraw method
		Mockito.verify( accountSpy, Mockito.times(1)).updateBalanceIntoDB(Mockito.anyDouble());
		
	}
	@Ignore
	@Test
	public void testWithdrawWhenCurrentBalanceIsInsufficient() {
		boolean exceptionThrown = false;
		
		
		//stubbing - hard coding the response of getBalnce method
		Mockito.doReturn (500.0).when(accountSpy).getBalance();
		
		//stubbing - hard coding the response of updateBalanceIntoDB method
		Mockito.doNothing().when(accountSpy).updateBalanceIntoDB (Mockito.anyDouble());
		
		//code under test i.e we are testing withdraw method
		try {
			accountSpy.withdraw(10000.00);
		}
		catch(InsufficientBalanceException e) {
			exceptionThrown = true;
		}
		boolean expectedResponse = true;
		
		assertEquals( expectedResponse, exceptionThrown);
		
		//check if getBalance method was invoked exactly 1 time within withdraw method
		Mockito.verify( accountSpy, Mockito.times(1)).getBalance();
		//check if updateBalanceIntoDB method was never invoked within withdraw method
		Mockito.verify( accountSpy, Mockito.times(0)).updateBalanceIntoDB(Mockito.anyDouble());
		
	}
}
