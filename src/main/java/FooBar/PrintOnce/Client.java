package FooBar.PrintOnce;

import java.util.concurrent.Semaphore;

public class Client {

	public static void main(String[] args) {
		Semaphore fooSema = new Semaphore(1);
		Semaphore barSema = new Semaphore(0);
		
		PrintFoo task1 = new PrintFoo(fooSema, barSema);
		PrintBar task2 = new PrintBar(fooSema, barSema);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
	}

}
