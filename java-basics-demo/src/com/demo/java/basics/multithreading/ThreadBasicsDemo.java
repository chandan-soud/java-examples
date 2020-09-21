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
		Thread thread = new Thread(
				() -> System.out.println("Currently processing thread: " + Thread.currentThread().getName()
						+ ", with id: " + Thread.currentThread().getId() + ", with priority: "
						+ Thread.currentThread().getPriority() + ", in state: " + Thread.currentThread().getState()));

		System.out.println("Before starting the custom thread, processing thread: " + Thread.currentThread().getName()
				+ ", with id: " + Thread.currentThread().getId() + ", with priority: "
				+ Thread.currentThread().getPriority() + ", in state: " + Thread.currentThread().getState());

		thread.start();

		System.out.println("After starting the custom thread, processing thread: " + Thread.currentThread().getName()
				+ ", with id: " + Thread.currentThread().getId() + ", with priority: "
				+ Thread.currentThread().getPriority() + ", in state: " + Thread.currentThread().getState());

	}

}
