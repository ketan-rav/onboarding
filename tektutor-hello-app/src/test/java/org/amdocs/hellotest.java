package org.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class hellotest {
	@Test
	public void testhello() {
	hello helo = new hello();
	String expectedResponse = "Hello Maven";
	String actualResponse= helo.sayHello();
	assertEquals (expectedResponse,actualResponse);
}
}
