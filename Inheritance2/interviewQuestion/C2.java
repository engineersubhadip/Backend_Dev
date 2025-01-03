package Inheritance2.interviewQuestion;
import java.lang.Math;

public class C2 extends C1{
	double y;
	
	public C2(int y) {
		super(y);
		this.y = y;
	}
	public double powerof3() {
		 this.y = Math.pow(y,3.0);
		 return this.y;
	}
}
