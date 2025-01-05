package MultiThreading.Synchronization.SynchronizedKeyword;

import java.util.concurrent.Callable;

public class Add implements Callable<Void> {

	private Count count;

	public Add(Count count) {
		this.count = count;
	}

	@Override
	public Void call() throws Exception {

		for (int i = 1; i <= 100000; i++) {
			synchronized (count) {
				this.count.value += i; // this is the part of the code where shared object is involved between threads.
			}
		}
		return null;
	}

}
