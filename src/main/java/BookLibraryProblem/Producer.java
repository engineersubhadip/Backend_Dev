package BookLibraryProblem;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {
	
	private ArrayList<Book> store;
	private Semaphore ps;
	private Semaphore cs;
	private Lock lock;
	
	public Producer (ArrayList<Book> store , Semaphore ps, Semaphore cs, Lock lock) {
		this.store = store;
		this.ps = ps;
		this.cs = cs;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		
		try {
			ps.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.lock.lock();
		Book book = new Book(Thread.currentThread().getName(), Thread.currentThread().getName()+" richardson");
		store.add(book);
		System.out.println("Producer added and Store Size is "+store.size());
		this.lock.unlock();
		cs.release();
	}

}
