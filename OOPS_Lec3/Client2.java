package OOPS_Lec3;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_2 stu1 = new Student_2();
		
		stu1.fun();
		
//		Invoking the static method via object reference :-
		
		stu1.add(12,13); 
		
//		Invoking the static method via Class :-
		
		Student_2.add(98,99);
		
//		Static Methods can be invoked via Obj Reference and Class

	}

}
