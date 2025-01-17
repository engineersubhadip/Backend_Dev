package Generics.Question1;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {

		Point currPoint = null;

		try {
			currPoint = (Point) obj;
		} catch (Exception e) {
			return false;
		}

		if ((this.x == currPoint.x) && (this.y == currPoint.y)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return (31 * this.x) + this.y;
	}
}
