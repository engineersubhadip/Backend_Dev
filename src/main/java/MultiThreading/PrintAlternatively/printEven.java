package MultiThreading.PrintAlternatively;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class printEven implements Callable<Void> {
	private Initializer evenInitial;
	private Semaphore evenSema;
	private Semaphore oddSema;

	public printEven(Initializer evenInitial, Semaphore evenSema, Semaphore oddSema) {
		this.evenInitial = evenInitial;
		this.evenSema = evenSema;
		this.oddSema = oddSema;
	}

	public Void call() {
		while (true) {
			try {
				this.evenSema.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (this.evenInitial.evenStart > 20) {
				return null;
			}
			System.out.println(evenInitial.evenStart);
			evenInitial.evenStart += 2;
			this.oddSema.release();
		}
	}

}
