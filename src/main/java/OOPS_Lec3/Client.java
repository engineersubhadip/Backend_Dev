package OOPS_Lec3;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.age = 22;
		s1.name = "rakesh";
		
		Student s2 = new Student();
		s2.age = 24;
		s2.name = "Parul";
		
		s1.schoolName = "KV Haridwar";
		
		System.out.println("s1.schoolName "+s1.schoolName + " "+"s2.schoolName "+s2.schoolName+" "+ "Student.schoolName "+ Student.schoolName);
		
		s2.schoolName = "KV Cossipore";
		
		System.out.println("s1.schoolName "+s1.schoolName + " "+"s2.schoolName "+s2.schoolName+" "+ "Student.schoolName "+ Student.schoolName);
		
		Student.schoolName = "BITS Mesra";
		
		System.out.println("s1.schoolName "+s1.schoolName + " "+"s2.schoolName "+s2.schoolName+" "+ "Student.schoolName "+ Student.schoolName);
		
		
		
	}

}
