package lamdaexample;

public class Runnableusinglambda {

	public static void main(String[] args) {
		Thread mythread=new Thread(new Runnable() {
			public void run() {
				System.out.println("my thread ");
			}
		});
		mythread.run();
		
		Thread newthread=new Thread(()->System.out.println("inside new thread"));
		newthread.run();
	}

}
