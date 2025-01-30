package FooBar.PrintMultipleTimes2;

import java.util.concurrent.Semaphore;

public class PrintBar implements Runnable {
	
	private Semaphore fooSema;
	private Semaphore barSema;
	
	public PrintBar(Semaphore fooSema, Semaphore barSema) {
		this.fooSema = fooSema;
		this.barSema = barSema;
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			try {
				this.barSema.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Bar from "+Thread.currentThread().getName());
			this.fooSema.release();
		}
		
	}
	
	
}
