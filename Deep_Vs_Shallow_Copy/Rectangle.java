package Deep_Vs_Shallow_Copy;

public class Rectangle {
	Point topLeft;
	int height;
	int width;
	
	Rectangle (Point topLeft ,int height, int width) {
		this.topLeft = new Point(topLeft);
		this.height = height;
		this.width = width;
	}
	
	int getArea () {
		return this.height * this.width;
	}
	
	int getPerimeter () {
		return 2 * (this.height + this.width);
	}
	
	Point getBottomRight () {
		int bottomRight_height = this.topLeft.y - this.height;
		int bottomRight_width = this.topLeft.x + this.width;
		
		Point bottomRight = new Point(bottomRight_width, bottomRight_height);
		return bottomRight;
	}
	
}
