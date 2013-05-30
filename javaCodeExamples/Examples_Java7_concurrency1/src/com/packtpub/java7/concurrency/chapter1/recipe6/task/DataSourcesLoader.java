package com.packtpub.java7.concurrency.chapter1.recipe6.task;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Class that simulates an initialization operation. It sleeps during four seconds
 *
 */
public class DataSourcesLoader implements Runnable {


	/**
	 * Main method of the class
	 */
	@Override
	public void run() {
		
		// Writes a messsage
		System.out.printf("D1: %s\n",new Date());
		// Sleeps four seconds
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Writes a message
		System.out.printf("D1: %s\n",new Date());
	}
}
