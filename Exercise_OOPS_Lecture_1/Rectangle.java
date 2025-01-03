package Exercise_OOPS_Lecture_1;

public class Rectangle {
	Point topLeft; // this will share a shallow copy with class Point
	int height;
	int width;
	
//	Rectangle(Point topLeft)
//	{
//		Point newTopLeft = new Point(topLeft);
//		this.topLeft = newTopLeft;
//	}
//	
//	Rectangle()
//	{
//		this.topLeft = null;
//		this.height = 0;
//		this.width = 0;
//	}
	
	int getArea()
	{
		int area = this.height * this.width;
		return area;
	}
	
	int getPerimeter()
	{
		int perimeter = 2 * (this.height + this.width);
		return perimeter;
	}
	
	Point getBottomRight()
	{
		Point pt1 = new Point();
		pt1.x = this.topLeft.x + this.width;
		pt1.y = this.topLeft.y - this.height;
		System.out.println("BR x : "+ pt1.x + " BR y : "+ pt1.y);
		return pt1;
	}
	
}
