//Executor class for ChildThread
package com.tnsif.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread threadOne = new Thread("First");
		Thread threadTwo = new Thread("Second");

		threadOne.start();
		//threadOne.start(); // throws IllegalStateException
		// threadOne.run(); // single threaded application 
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
}
