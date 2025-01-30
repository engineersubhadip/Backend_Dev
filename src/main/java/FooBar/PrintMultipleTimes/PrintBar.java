package FooBar.PrintMultipleTimes;

import java.util.concurrent.Semaphore;

public class PrintBar implements Runnable{
	
	private Semaphore fooSema;
	private Semaphore barSema;
	
	public PrintBar(Semaphore fooSema, Semaphore barSema) {
		this.fooSema = fooSema;
		this.barSema = barSema;
	}
	
	@Override
	public void run() {
		try {
			this.barSema.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("Bar");
		this.fooSema.release();
	}

}
