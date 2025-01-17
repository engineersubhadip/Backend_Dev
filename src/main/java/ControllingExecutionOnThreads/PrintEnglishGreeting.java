package ControllingExecutionOnThreads;

import java.util.concurrent.Semaphore;

public class PrintEnglishGreeting implements Runnable {

	private Semaphore hindiSema;
	private Semaphore englishSema;

	public PrintEnglishGreeting(Semaphore hindiSema, Semaphore englishSema) {
		this.hindiSema = hindiSema;
		this.englishSema = englishSema;
	}

	@Override
	public void run() {

		try {
			this.englishSema.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Hello");
		this.hindiSema.release();
	}

}
