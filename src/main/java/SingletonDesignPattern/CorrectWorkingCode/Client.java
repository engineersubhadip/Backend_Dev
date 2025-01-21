package SingletonDesignPattern.CorrectWorkingCode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		Thread1_Target task1 = new Thread1_Target();
		Thread2_Target task2 = new Thread2_Target();
		
		es.submit(task1);
		es.submit(task2);
		
		es.shutdown();
	}

}
