package Deep_Vs_Shallow_Copy;

public class Client {
	
	public static void main(String[] args) {
		
		Point pt1 = new Point(24,36);
		
		Rectangle rt = new Rectangle (pt1, 30, 12);
		
		rt.getArea();
		
		rt.getPerimeter();
		
		Point br = rt.getBottomRight();
		
		System.out.println("Before Changing ...");
		pt1.display();
		br.display();
		
		pt1.x = 88;
		pt1.y = 99;
		
		System.out.println();
		
		System.out.println("After Changing ...");
		pt1.display();
		br.display();
	}
}

// This proves it is an example of deep copy
// Meaning that if we change pt1's co-ordinate
// The value of "br" remains unchanged, because "br" is
// de-coupled from pt1.
// Meaning "br" has made a deep copy of "pt1"
