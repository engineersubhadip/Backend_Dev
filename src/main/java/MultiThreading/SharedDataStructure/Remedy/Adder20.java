package MultiThreading.SharedDataStructure.Remedy;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder20 implements Callable<Void> {
	
	private ArrayList<Integer> arr;
	private Lock lock;
	
	public Adder20 (ArrayList<Integer> arr, Lock lock) {
		this.arr = arr;
		this.lock = lock;
	}
	
	@Override
	public Void call() throws Exception {
		this.lock.lock();
		this.arr.add(20);
		this.lock.unlock();
		return null;
	}

}
