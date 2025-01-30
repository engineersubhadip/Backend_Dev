package H2O.PrintH2O_Once;

import java.util.concurrent.Semaphore;

public class PrintO implements Runnable {
	
	private Semaphore hSema;
	private Semaphore oSema;
	private int oxyCheck;
	
	public PrintO(Semaphore hSema, Semaphore oSema, int oxyCheck) {
		this.hSema = hSema;
		this.oSema = oSema;
		this.oxyCheck = oxyCheck;
	}

	@Override
	public void run() {
			try {
				oSema.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("O from "+Thread.currentThread().getName());
	}
		
}
