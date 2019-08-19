Feature: Decvelop a RPN calculator application in java.
	Scenario: Simple Addition
		Given Ihave deployed a soap RPNCalulator SOAP at URL "http://localhost:8080/rpncalculator-ws/services/RPNCalculator?WSDL"
		And The input is "10 15 +"
		When I invoke the SOAP API.
		Then I expect the response as "25.0"