package OOPS_Lec2;

public class Point_Copy_Const {
	int x;
	int y;
	
	Point_Copy_Const()
	{
		this(0,0); // telescoping
	}
	
	Point_Copy_Const(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	Point_Copy_Const(Point_Copy_Const P)
	{
		this.x = P.x;
		this.y = P.y;
	}
}
