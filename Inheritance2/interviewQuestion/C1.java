package Inheritance2.interviewQuestion;

public class C1 {
	int x;
	
	public C1(int x) {
		this.x = x;
	}
	
	public int multiplyBy2() {
		this.x = this.x * 2;
		return this.x;
	}
	
	public int divideBy2() {
		this.x = (this.x/2);
		return this.x;
	}
}
