package H2O.PrintH2O_Once;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

	public static void main(String[] args) {
		Semaphore hSema = new Semaphore(2);
		Semaphore oSema = new Semaphore(0);
		Lock lock = new ReentrantLock();
		
		PrintH task1 = new PrintH(hSema, oSema, 0, lock);
		PrintO task2 = new PrintO(hSema, oSema, 0);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task1);
		Thread t3 = new Thread(task2);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
