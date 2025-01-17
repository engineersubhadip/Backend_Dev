package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d.toString()); //Thu Nov 14 10:53:34 IST 2024
		
//		Requirement is mm/dd/yyyy
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/y hh:mm:ss");
		System.out.println(sdf.format(d));
	}

}
