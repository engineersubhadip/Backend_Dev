package MultiThreading.Part_3_TableCreator;

public class TableCreator implements Runnable {
	private int refNum;

	public TableCreator(int refNum) {
		this.refNum = refNum;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			int result = this.refNum * i;
			System.out.println(
					this.refNum + " times " + i + " is " + result + " from " + Thread.currentThread().getName());
		}
	}
}
