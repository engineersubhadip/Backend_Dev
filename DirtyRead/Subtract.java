package Practice.DirtyRead;

public class Subtract implements Runnable {
	private Count count;

	public Subtract(Count count) {
		this.count = count;
	}

	@Override
	public void run() {
		this.count.ref += 1;
	}
}
