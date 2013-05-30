package com.packtpub.java7.concurrency.chapter1.recipe3.mygo;

public class MyRunner implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				 
				System.out.println("my runner has been interrupted");
			}
			System.out.println(i++);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
