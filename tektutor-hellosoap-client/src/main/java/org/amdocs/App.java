package org.amdocs;

public class App {
	public static void main(String[] args) {
		HelloService service = new HelloService();
		Hello hello = service.getHello();
		
		System.out.println(hello.sayHello());
	
}
}
