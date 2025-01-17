package Practice;

public class Square extends Rectangle {
	public int height;
	public int width;

	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}

	public void setWidth(int width) {
		this.width = width;
		this.height = width;
	}

}
