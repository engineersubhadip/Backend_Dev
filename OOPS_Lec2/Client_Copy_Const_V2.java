package OOPS_Lec2;

public class Client_Copy_Const_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point_Copy_Const_V2 pt1 = new Point_Copy_Const_V2();
		pt1.x = 20;
		pt1.y = 40;
		
		Rectangle_Copy_Const_V2 rec = new Rectangle_Copy_Const_V2(pt1, 25, 33);
		
		Point_Copy_Const_V2 bottomRight = rec.getBottomRight();
		
		pt1.x = 200;
		pt1.y = 300;
		
		System.out.println("BR_X "+bottomRight.x+" "+ "BR_Y "+bottomRight.y);
	}

}
