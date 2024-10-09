package OOPS_Lec2;

public class Client_Copy_Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point_Copy_Const pt1 = new Point_Copy_Const(12,33);
		
		System.out.println(pt1.x + " " + pt1.y);
		
		Point_Copy_Const pt2 = new Point_Copy_Const(pt1);
		
		pt2.y = 95;
		
		System.out.println(pt1.x + " " + pt1.y);
		System.out.println(pt2.x + " " + pt2.y);
	}

}
