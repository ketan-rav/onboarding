package org.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	private String soapWSDLURL;
	private String rpnMathExpression;
	private double actualResult;
	@Given("Ihave deployed a soap RPNCalulator SOAP at URL {string}")
	public void setSOAPWSDLURL(String wsdlURL) {
	   soapWSDLURL = wsdlURL;
	}

	@Given("The input is {string}")
	public void setInput(String rpnMathExpression) {
	  this.rpnMathExpression = rpnMathExpression;
	}

	@When("I invoke the SOAP API.")
	public void invokeRPNCalculatorSOAPAPI() {
		RPNCalculatorService rpnWebService = new RPNCalculatorService();
		
		RPNCalculator rpnCalculator = rpnWebService.getRPNCalculator();
		actualResult = rpnCalculator.evaluate(rpnMathExpression);
	    
	}

	@Then("I expect the response as {string}")
	public void verifyExpectedResult(String strExpectedResult) {
		double expectedResult=Double.parseDouble(strExpectedResult);
		assertEquals( expectedResult, actualResult,0.0001);
	   
	}

}
