package MultiThreading.ExecutorsAndCallables.Executors;

public class PrintNumber implements Runnable {
	int x;

	PrintNumber(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.x + " Thread " + Thread.currentThread().getName());
	}

}
