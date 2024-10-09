package Practice;

public class B {
	
	A topLeft;
	int height;
	int width;
	
	
	B(A topLeft, int height, int width) // copy constructor
	{
		A topLeftDeepCopy = new A(topLeft);
		this.topLeft = topLeftDeepCopy;
		this.height = height;
		this.width = width;
	}
	
	A setBottomRight()
	{
		A bottomRight = new A();
		bottomRight.x = this.topLeft.x + this.width;
		bottomRight.y = this.topLeft.y - this.height;
		return bottomRight;
	}
}
