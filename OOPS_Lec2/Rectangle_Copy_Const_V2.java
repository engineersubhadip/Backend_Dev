package OOPS_Lec2;

public class Rectangle_Copy_Const_V2 {
	Point_Copy_Const_V2 topLeft;
	int height;
	int width;
	
	Rectangle_Copy_Const_V2(Point_Copy_Const_V2 P, int height, int width)
	{
//		"P" is the input for the given topLeft pt1.
//		We are making a deep copy of the object and pointing this.topLeft to that deep copy.
//		Reason :- Any Changes to the original pt1 co-ordinates will not impact pt2 and subsequently the value of bottomRight
		
		Point_Copy_Const_V2 pt2 = new Point_Copy_Const_V2(P);
		this.topLeft = pt2;
		this.height = height;
		this.width = width;
	}
	
	Point_Copy_Const_V2 getBottomRight()
	{
		Point_Copy_Const_V2 bottomRight = new Point_Copy_Const_V2();
		bottomRight.x = this.topLeft.x + this.width;
		bottomRight.y = this.topLeft.y - this.height;
		return bottomRight;
	}
}
