package ExceptionHandling;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 12;
			int x = 0;
			int b = a/x;
		}catch (Exception  e) {
			System.out.println(e);
		}
	}

}
