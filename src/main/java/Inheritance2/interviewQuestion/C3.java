package Inheritance2.interviewQuestion;

public class C3 extends C2{
	int z;
	
	public C3(int z) {
		super(z);
		this.z = z;
	}
	
	public int incrementBy1() {
		this.z = this.z + 1;
		return this.z;
	}
	
	public int decrementBy1() {
		this.z = this.z - 1;
		return this.z;
	}
}
