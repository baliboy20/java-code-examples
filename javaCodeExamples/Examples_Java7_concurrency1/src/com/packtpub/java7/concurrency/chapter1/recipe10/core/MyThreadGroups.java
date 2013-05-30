package com.packtpub.java7.concurrency.chapter1.recipe10.core;


public class MyThreadGroups {

	/**
	 * @param args
	 */
	private Object lock1 = new Object();
	public static void main(String[] args) {
		ThreadGroup chelsea = new ThreadGroup("Chelsea");
		ThreadGroup manu = new ThreadGroup("Manchester United");

		for (int i = 0; i<5;i++) {
			(new Forward(manu, "dwii")).start();
		}
		
		for (int i = 0; i < 5; i++) {
			new Forward(chelsea, "dwii").start();
		}


		addScore(chelsea);
		addScore(chelsea);
		addScore(chelsea);
		addScore(manu);
		addScore(manu);
		printout(chelsea);
		printout(manu);
		
		String st = new String("lock");

			
		}

	public class MsLunch {
		private long c1 = 0;
		private long c2 = 0;

		private Object lock2 = new Object();

		public void inc1() {
			synchronized (lock1) {
				c1++;
			}
		}

		public void inc2() {
			synchronized (lock2) {
				c2++;
			}
		}
	}


	static public void printout(ThreadGroup arg0) {
		Forward[] thrdz = new Forward[arg0.activeCount()];
		arg0.enumerate(thrdz);
		for (Forward th : thrdz) {
			System.out.printf("Player of %s has %n goals\n", th
					.getThreadGroup()
					.getName(), th.score);
		}
	}

	static public void addScore(ThreadGroup arg0) {
		Forward[] thrdz = new Forward[arg0.activeCount()];
		arg0.enumerate(thrdz);
		for(Forward th : thrdz) {
			th.newScore();
		}
	}

	public static class Player extends Thread {
		final public static String FORWARD = "forward";
		final public static String DEFENDER = "defender";
		final public static String GOALKEEPER = "goalkeeper";

		public String team;
		public int score = 0;
		public String position;

		public Player(ThreadGroup group, String name) {
			super(group, name);
		}

		public void newScore() {
			System.out.println("new Score");
			score++;
		}

		@Override
		public void run() {
			while (true) {
			try {
					Thread.sleep(50);
					System.out.printf("player has %d goals\n", score);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		};
	}

	public static class Forward extends Player {
		public Forward(ThreadGroup group, String name) {
			super(group, name);
			position = Forward.FORWARD;
		}
	}

}

