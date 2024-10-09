package Practice;

public class Client {

	public static void main(String[] args) {
		A topLeft = new A(55,88);
		
		B rect = new B(topLeft,33, 44);
		
		A br = rect.setBottomRight();
		
		br.displayElements();
	}
}
