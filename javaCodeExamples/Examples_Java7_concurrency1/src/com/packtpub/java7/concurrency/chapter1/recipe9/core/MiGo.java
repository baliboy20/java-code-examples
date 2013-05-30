package com.packtpub.java7.concurrency.chapter1.recipe9.core;

public class MiGo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runner r = new Runner();
		for (int i = 0; i < 3; i++) {
			Thread t = new Thread(r);
			t.start();
		}

	}

	static class Runner implements Runnable {
		double value = 0;

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				value = Math.random() * 100;
				System.out.println(value);
			}
		}

	}

}
