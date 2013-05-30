package recipe3;


public class Recipe3Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread task = new PrimeGenerator();

		task.start();
		try{
			task.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		task.interrupt();

	}

}
