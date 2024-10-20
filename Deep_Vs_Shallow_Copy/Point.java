package Deep_Vs_Shallow_Copy;

public class Point {
	int x;
	int y;
	
	Point()
	{
		this(0,0);
	}
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	Point(Point P)
	{
		this.x = P.x;
		this.y = P.y;
	}
	
	void display()
	{
		System.out.println("X : "+this.x +" Y : "+this.y);
	}
}
