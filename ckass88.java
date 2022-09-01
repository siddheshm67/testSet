package PracticeSet;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
	String name;

	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(name + " job started by " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " job ended by " + Thread.currentThread().getName());
	}
}

public class Test101 {
	
	public static void main(String[] args) {
		
		PrintJob[] jobs = { new PrintJob("siddhes"), 
							new PrintJob("manoj"), 
							new PrintJob("manohar"),
							new PrintJob("nira"), 
							new PrintJob("deepak"), 
							new PrintJob("ashok") };
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for (PrintJob printJob : jobs) {
			service.submit(printJob);
		}
		service.shutdown();
	}
}
