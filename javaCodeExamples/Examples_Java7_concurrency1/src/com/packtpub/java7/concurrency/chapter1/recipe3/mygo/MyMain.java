package com.packtpub.java7.concurrency.chapter1.recipe3.mygo;

public class MyMain {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		Thread th = new Thread(new MyRunner());
		th.start();
		try {
			th.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main has been interupted as well.");
		}
		th.interrupt();

	}

}
