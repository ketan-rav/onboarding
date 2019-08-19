package org.amdocs;

import java.util.ArrayList;

public class PaperWala implements IObservable {
	private ArrayList<IObserver> subscribers;
	private String name;
	public PaperWala(String name) {
		this.name = name;
		subscribers = new ArrayList<IObserver>();
	}

	public void addSubscriber(IObserver observer) {
		// TODO Auto-generated method stub
		subscribers.add(observer);
	}

	public void removeSubscriber(IObserver observer) {
		// TODO Auto-generated method stub
subscribers.remove(observer);
	}

	public void notifyAllSubscribers(String message) {
		// TODO Auto-generated method stub
		for( IObserver customer : subscribers )
			customer.update(message);
	}

}
