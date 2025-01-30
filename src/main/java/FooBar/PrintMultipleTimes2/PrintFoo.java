package FooBar.PrintMultipleTimes2;

import java.util.concurrent.Semaphore;

public class PrintFoo implements Runnable {
	
	private Semaphore fooSema;
	private Semaphore barSema;
	
	public PrintFoo(Semaphore fooSema, Semaphore barSema) {
		this.fooSema = fooSema;
		this.barSema = barSema;
	}
	
	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			try {
				fooSema.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Foo from "+Thread.currentThread().getName());
			barSema.release();
		}
		
	}
	
}
