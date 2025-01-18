package BookLibraryProblem;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

	public static void main(String[] args) {
		
		ArrayList<Book> store = new ArrayList<>(); // we shall be hardcoding the max cap.
		
		Semaphore ps = new Semaphore(4); // the store size is 4.
		Semaphore cs = new Semaphore(0);
		
		Lock lock = new ReentrantLock();
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		for (int i=0; i<10; i++) {
			Producer p = new Producer(store, ps, cs, lock);
			Consumer c = new Consumer(store, ps, cs, lock);
			es.submit(p);
			es.submit(c);
		}
	}

}
