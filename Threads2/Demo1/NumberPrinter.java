package Threads2.Demo1;

public class NumberPrinter implements Runnable {
	private int refNum;

	public NumberPrinter(int refNum) {
		this.refNum = refNum;
	}

	@Override
	public void run() {
		System.out.println("Current Number is " + refNum + " from Thread Number : " + Thread.currentThread().getName());
	}

}
