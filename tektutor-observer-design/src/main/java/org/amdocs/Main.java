package org.amdocs;

public class Main {
	public static void main(String[] args) {
		PaperWala paperWala=new PaperWala("Pune paperwala pvt. ltd.");
		paperWala.addSubscriber(new Subscriber("ramesh"));
		paperWala.addSubscriber(new Subscriber("rishi"));
		paperWala.addSubscriber(new Subscriber("rahul"));
		paperWala.notifyAllSubscribers("Times Of India");
	}
}
