package com.packtpub.java7.concurrency.chapter1.recipe8.core;

import java.lang.Thread.UncaughtExceptionHandler;

public class MiMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thredz th = new Thredz();
		Thread t = new Thread(th);
		t.setUncaughtExceptionHandler(new Hnd());
		t.start();

	}

	static class Thredz implements Runnable {

		@Override
		public void run() {
			Integer.parseInt("hello dolly");
		}

	}

	static class Hnd implements UncaughtExceptionHandler {

		@Override
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println("yikes");
			System.out.printf("Cause:%s", e.getStackTrace());

		}

	}

}
