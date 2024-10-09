package OOPS_Lec2;

public class Point_Copy_Const_V2 {
	
	int x;
	int y;
	
	Point_Copy_Const_V2()
	{
		this(0,0);
	}
	
	Point_Copy_Const_V2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	Point_Copy_Const_V2(Point_Copy_Const_V2 P)
	{
		this.x = P.x;
		this.y = P.y;
	}
}
