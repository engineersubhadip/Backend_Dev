package BookLibraryProblem;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
	
	private ArrayList<Book> store;
	private Semaphore ps;
	private Semaphore cs;
	private Lock lock;
	
	public Consumer (ArrayList<Book> store, Semaphore ps, Semaphore cs, Lock lock) {
		this.store = store;
		this.ps = ps;
		this.cs = cs;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			cs.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.lock.lock();
		this.store.remove(this.store.size()-1);
		System.out.println("Consumer removed Store Size is "+this.store.size());
		this.lock.unlock();
		ps.release();
	}

}
