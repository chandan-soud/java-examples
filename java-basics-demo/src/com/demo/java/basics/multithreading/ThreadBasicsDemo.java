package com.demo.java.basics.multithreading;

/**
 * @author Chandan K Soud
 *
 */
public class ThreadBasicsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create a new thread by providing a runnable in its constructor
		Thread thread = new Thread(
				() -> System.out.println("Currently processing thread: " + Thread.currentThread().getName()
						+ ", with id: " + Thread.currentThread().getId() + ", with priority: "
						+ Thread.currentThread().getPriority() + ", in state: " + Thread.currentThread().getState()));

		// Print the thread information before starting the custom thread
		System.out.println("Before starting the custom thread, processing thread: " + Thread.currentThread().getName()
				+ ", with id: " + Thread.currentThread().getId() + ", with priority: "
				+ Thread.currentThread().getPriority() + ", in state: " + Thread.currentThread().getState());

		thread.start();

		// Print the thread information after starting the custom thread
		System.out.println("After starting the custom thread, processing thread: " + Thread.currentThread().getName()
				+ ", with id: " + Thread.currentThread().getId() + ", with priority: "
				+ Thread.currentThread().getPriority() + ", in state: " + Thread.currentThread().getState());

	}

}
