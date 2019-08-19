package org.amdocs;

public class Subscriber implements IObserver {
	private String name;
	public Subscriber(String name) {
		this.name=name;
	}
	public void update(String message) {
			System.out.println("subscriber "+name+"recieved--->"+message);
		}

	}


