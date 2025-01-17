package AdderSubtractorSynchronizedMethods;

public class Count {
	public int value;

	public Count(int value) {
		this.value = value;
	}

	public synchronized void incrementValue(int x) {
		this.value += x;
	}

	public synchronized void decrementValue(int x) {
		this.value -= x;
	}
}
