package H2O.PrintH2O_Once;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class PrintH implements Runnable {
	
	private Semaphore hSema;
	private Semaphore oSema;
	private int oxyCheck;
	private Lock lock;
	
	public PrintH(Semaphore hSema, Semaphore oSema, int oxyCheck, Lock lock) {
		this.hSema = hSema;
		this.oSema = oSema;
		this.oxyCheck = oxyCheck;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			hSema.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("H from "+Thread.currentThread().getName());
		lock.lock();
		this.oxyCheck += 1;
		if (this.oxyCheck == 2) {
			oSema.release();
		}
		lock.unlock();
//		System.out.println(this.oxyCheck);
		
	}

}
