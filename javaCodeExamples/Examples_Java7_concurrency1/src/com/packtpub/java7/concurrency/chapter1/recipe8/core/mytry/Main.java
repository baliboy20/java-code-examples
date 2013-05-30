package com.packtpub.java7.concurrency.chapter1.recipe8.core.mytry;

import java.lang.Thread.UncaughtExceptionHandler;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyTask my = new MyTask();
		Thread th = new Thread(my);
		th.setUncaughtExceptionHandler(new ErrHandler());
		th.start();

	}

	public static class MyTask implements Runnable {

		@Override
		public void run() {
			try {
				throw new Exception("damm damm");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static class ErrHandler implements UncaughtExceptionHandler {

		@Override
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println("uncaught exceprion has occurred");

		}

	}

}
