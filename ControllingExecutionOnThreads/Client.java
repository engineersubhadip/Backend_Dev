package ControllingExecutionOnThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {

	public static void main(String[] args) {
//		I want to execute Namaste first and Hello second -> I want to control the execution of Threads

		Semaphore hindiSemaphore = new Semaphore(1);
		Semaphore englishSemaphore = new Semaphore(0);

		PrintHindiGreeting task1 = new PrintHindiGreeting(hindiSemaphore, englishSemaphore);
		PrintEnglishGreeting task2 = new PrintEnglishGreeting(hindiSemaphore, englishSemaphore);

		ExecutorService es = Executors.newFixedThreadPool(2);

		es.submit(task1);
		es.submit(task2);

		es.shutdown();
	}

}
