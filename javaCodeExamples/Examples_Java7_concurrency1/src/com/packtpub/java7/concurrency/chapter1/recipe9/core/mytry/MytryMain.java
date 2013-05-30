package com.packtpub.java7.concurrency.chapter1.recipe9.core.mytry;

public class MytryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Worker w = new Worker();
		Thread t;
		for (int i = 0; i < 6; i++) {
			t = new Thread(w);
			t.start();
		}

	}

	public static class Worker implements Runnable {

		private ThreadLocal<Integer> count = new ThreadLocal<>();
		{
			count.set(0);
		}

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				int j = count.get();

				count.set(++j);
			}

			System.out.println("count = " + count.get());

		}

	}

}
