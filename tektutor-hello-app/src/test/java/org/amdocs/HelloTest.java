package org.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testHello() {

		Hello hello = new Hello();

		String expectedResponse = "Hello Maven";
		String actualResponse= hello.sayHello();

		assertEquals (expectedResponse,actualResponse);

	}
}
