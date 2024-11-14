package ThisKeyword;

public class Thisdemo {
	int a = 2;
	
	public void setData() {
		int a = 3;
		System.out.println("Local Value "+a+" Global Value "+this.a);
	}
}
