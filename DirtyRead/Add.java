package Practice.DirtyRead;

public class Add implements Runnable {

	private Count count;

	public Add(Count count) {
		this.count = count;
	}

	@Override
	public void run() {
		this.count.ref += 1;
	}
}
