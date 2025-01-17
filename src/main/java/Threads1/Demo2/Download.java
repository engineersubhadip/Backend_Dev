package Threads1.Demo2;

public class Download implements Runnable {

	public void run() {
		System.out.println("Currently Downloading at Thread :- " + Thread.currentThread().getName());
	}

	public void dontRun() {
		System.out.println("This will never be run");
	}
}
