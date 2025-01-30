package FooBar.PrintMultipleTimes;

import java.util.concurrent.Semaphore;

public class Client {

	public static void main(String[] args) {
		
		Semaphore fooSema = new Semaphore(1);
		Semaphore barSema = new Semaphore(0);
		
		
		for (int i=0; i<10; i++) {
			PrintFoo task1 = new PrintFoo(fooSema, barSema);
			Thread tFoo = new Thread(task1);
			PrintBar task2 = new PrintBar(fooSema, barSema);
			Thread tBar = new Thread(task2);
			tFoo.start();
			tBar.start();
		}
	}

}
