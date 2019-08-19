package org.amdocs;

import java.util.Scanner;

public class Main {
public static void displayMenu() {
		System.out.println("Main Menu");
		System.out.println("QuickSort------> 1");
		System.out.println("InsertionSort-----> 2");
		System.out.println("BubbleSort----> 3");
		System.out.println("Exit-----> 4");
		
	}
	public static int getChoice()
	{
		System.out.println("Emter ur choice");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		
	}
	public static void doWork(int choice) {
		IAlgorithm algorithm = AlgorithmFactory.getAlgorithm(choice);
		algorithm.sort();
	}
	public static void main(String[] args) {
	int choice = 0;
	while(choice !=4)
	{
		displayMenu();
		choice=getChoice();
		if (choice!=4)
			doWork(choice);
	}
	System.out.println("exited successfully");
}
}
