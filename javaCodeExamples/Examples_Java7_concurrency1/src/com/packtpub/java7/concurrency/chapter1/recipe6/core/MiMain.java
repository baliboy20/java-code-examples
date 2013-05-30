package com.packtpub.java7.concurrency.chapter1.recipe6.core;

public class MiMain {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Thredz th1 = new Thredz(2000);
		Thredz th2 = new Thredz(1000);
		th1.start();
		th2.start();

		th1.join();
		th2.join();

		System.out.println("All threads have now finished");

	}

	static class Thredz extends Thread {

		public long ti;

		public Thredz(int ti) {
			super();
			this.ti = ti;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();

			try {
				this.sleep(ti);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This program has run its course.");
		}

	}

}
