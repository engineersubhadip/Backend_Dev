package ControllingExecutionOnThreads;

import java.util.concurrent.Semaphore;

public class PrintHindiGreeting implements Runnable {

	private Semaphore hindiSema;
	private Semaphore englishSema;

	public PrintHindiGreeting(Semaphore hindiSema, Semaphore englishSema) {
		this.hindiSema = hindiSema;
		this.englishSema = englishSema;
	}

	@Override
	public void run() {

		try {
			this.hindiSema.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Namaste");
		this.englishSema.release();
	}
}
