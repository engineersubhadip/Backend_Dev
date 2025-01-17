package Practice;

public class Shapes {

	static void playWithRectangle(Rectangle r) {
		r.setHeight(5);
		r.setWidth(10);
		System.out.println(r.getArea());
	}

	public static void main(String[] args) {
//		Rectangle r = new Rectangle();
//		playWithRectangle(r);

		Square r1 = new Square();
		playWithRectangle(r1);
	}

}

//Rectangle r = new Square();