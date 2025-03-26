package Generics;

public class Pair<A, B> {
	
	private A first;
	private B second;

//	private Pair() {};

	void setFirst(A val) {
		this.first = val;
	}

	void setSecond(B val) {
		this.second = val;
	}

	A getFirst() {
		return this.first;
	}

	B getSecond() {
		return this.second;
	}
	
	public String toString() {
		return "First : "+first+" Second : "+second;
	}
}
