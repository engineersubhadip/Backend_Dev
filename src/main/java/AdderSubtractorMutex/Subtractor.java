package AdderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
	private Count count;
	private Lock lock;

	public Subtractor(Count count, Lock lock) {
		this.count = count;
		this.lock = lock;
	}

	@Override
	public Void call() throws Exception {
		for (int i = 1; i <= 10000; i++) {
			lock.lock();
			this.count.value -= i;
			lock.unlock();
		}
		return null;
	}

}
