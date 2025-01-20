package MultiThreading.PrintAlternatively;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class printOdd implements Callable<Void> {
	private Initializer oddInitial;
	private Semaphore evenSema;
	private Semaphore oddSema;

	public printOdd(Initializer oddInitial, Semaphore evenSema, Semaphore oddSema) {
		this.oddInitial = oddInitial;
		this.evenSema = evenSema;
		this.oddSema = oddSema;
	}

	public Void call() {
		
		while (true) {
			try {
				this.oddSema.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (this.oddInitial.oddStart > 20) {
				return null;
			}
			System.out.println(this.oddInitial.oddStart);
			this.oddInitial.oddStart += 2;

			this.evenSema.release();
		}
	}

}
