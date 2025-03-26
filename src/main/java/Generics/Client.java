package Generics;

public class Client {

	public static void main(String[] args) {
		
		Pair<String, Integer> p1 = new Pair<>();
		p1.setFirst("Subhadip");
		p1.setSecond(12);
		
		System.out.println(p1);
		
		
		Pair<Integer, Integer> p2 = new Pair<>();
		p2.setFirst(22);
		p2.setSecond(99);
		
		System.out.println(p2);
	}

}
