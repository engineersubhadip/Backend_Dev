package SingletonDesignPattern.CorrectWorkingCode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton_Design {
	
	private static Singleton_Design instance;
	private static  Lock lock = new ReentrantLock();
	
	private Singleton_Design() {
		
	}
	
	public static Singleton_Design getInstance () {
		
		if (instance == null) {
			lock.lock();
			if (instance == null) {
				instance = new Singleton_Design();
			}
			lock.unlock();
		}
		return instance;
	}
}
