package org.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class RPNCalculatorTest {
	
	private RPNCalculator rpnCalculator;
	private double expectedResult,actualResult;
	
	@BeforeClass
	public static void initOnce() {
		System.out.println("Before class method");
	}
	@AfterClass
	public static void tearDown() {
		System.out.println("After Class method");
	}
	@Before
	public void init() {
		System.out.println("Before method");
		rpnCalculator = new RPNCalculator();
		actualResult = expectedResult = 0.0;
	}
	@After
	public void cleanUp() {
		rpnCalculator = null;
		System.out.println("After method");
	}
	@Category(SmokeTest.class)
	@Test
	public void testSimpleAddition() {
		
		
		System.out.println("Test addition");
		actualResult = rpnCalculator.evaluate( "10 15 +" );
		expectedResult = 25.0;
		
		assertEquals(expectedResult, actualResult, 0.0001 );
		
	    actualResult = rpnCalculator.evaluate( "10 115 +" );
	    expectedResult = 125.0;
		
		assertEquals(expectedResult, actualResult, 0.0001 );
		
	}
	@Test
	public void testSimpleSubtraction() {
		
		System.out.println("Test subtraction");
		actualResult = rpnCalculator.evaluate( "100 15 -" );
		expectedResult = 85.0;
		
		assertEquals(expectedResult, actualResult, 0.0001 );
		
	    actualResult = rpnCalculator.evaluate( "10 5 -" );
	    expectedResult = 5.0;
		
		assertEquals(expectedResult, actualResult, 0.0001 );
		
	}
	@Test
	public void testSimpleMultiplication() {
		
		System.out.println("Test multiplication");
		
		actualResult = rpnCalculator.evaluate( "100 15 *" );
		expectedResult = 1500.0;
		
		assertEquals(expectedResult, actualResult, 0.0001 );
		
	    actualResult = rpnCalculator.evaluate( "10 5 *" );
	    expectedResult = 50.0;
		
		assertEquals(expectedResult, actualResult, 0.0001 );
		
	}
	@Test
	public void testSimpleDivision() {
		
		
		System.out.println("Test Division");
		actualResult = rpnCalculator.evaluate( "150 15 /" );
		expectedResult = 10.0;
		
		assertEquals(expectedResult, actualResult, 0.0001 );
		
	    actualResult = rpnCalculator.evaluate( "10 5 /" );
	    expectedResult = 2.0;
		
		assertEquals(expectedResult, actualResult, 0.0001 );
		
	}
	@Test
	public void testComplexRPNExpression() {
		
		System.out.println("Test complex");
		
		actualResult = rpnCalculator.evaluate( "10 10 + 100 20 / *" );
		expectedResult = 100.0;
		
		assertEquals(expectedResult, actualResult, 0.0001 );
		
	    
		
	}


}
