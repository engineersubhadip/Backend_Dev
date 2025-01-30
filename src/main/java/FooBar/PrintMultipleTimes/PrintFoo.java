package FooBar.PrintMultipleTimes;

import java.util.concurrent.Semaphore;

public class PrintFoo implements Runnable{
	
	private Semaphore fooSema;
	private Semaphore barSema;
	
	public PrintFoo(Semaphore fooSema, Semaphore barSema) {
		this.fooSema = fooSema;
		this.barSema = barSema;
	}
	
	@Override
	public void run() {
		try {
			this.fooSema.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("Foo");
		this.barSema.release();
	}

}
