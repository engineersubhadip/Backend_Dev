package Exercise_OOPS_Lecture_1;
// For Class Point and Rectangle

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point pt1 = new Point();
		pt1.x = 29;
		pt1.y = 15;
		
		Rectangle rec = new Rectangle();
		rec.topLeft = pt1;
		
		rec.height = 12;
		rec.width = 13;
		
		int rectArea = rec.getArea();
		
		int rectPeri = rec.getPerimeter();
		
		Point bottomRight = rec.getBottomRight();
		
		
	}

}
