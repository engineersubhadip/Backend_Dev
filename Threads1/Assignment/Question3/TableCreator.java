package Threads1.Assignment.Question3;

public class TableCreator implements Runnable {
	private int refNum;

	public TableCreator(int refNum) {
		this.refNum = refNum;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			int result = refNum * i;
			System.out.println(refNum + " times " + i + " is " + result);
		}
	}

}
