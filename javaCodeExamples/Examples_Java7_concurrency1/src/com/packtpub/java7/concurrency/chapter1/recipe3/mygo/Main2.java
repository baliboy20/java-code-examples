package com.packtpub.java7.concurrency.chapter1.recipe3.mygo;

import java.util.concurrent.TimeUnit;


public class Main2 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Thread th = new Thread(new Runner());
		th.start();
		System.out.printf("hi there has run  \n", null);
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// th.sleep(5000);
		th.interrupt();

	}

	static class Runner implements Runnable {

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {

			int i = 0;
			while(true){
				System.out.printf("hum hoh  %d, interupted:%b\n", i++,
						Thread.interrupted());
				if (Thread.currentThread().isInterrupted())
 {
					System.out.printf("=======>%d, interupted:%b\n", i++,
							Thread.interrupted());
					break;
				}
				try {

				} catch (Exception e) {
					break;
				}
			} 


		}

	}
}
