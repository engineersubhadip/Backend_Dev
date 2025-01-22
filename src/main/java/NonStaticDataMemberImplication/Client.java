package NonStaticDataMemberImplication;

public class Client {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.age); //20
		
		Child1 c1 = new Child1();
		System.out.println(c1.age); // 20
		
		Child2 c2 = new Child2();
		System.out.println(c2.age); //20
		
		c2.age = 44;
		
		System.out.println(p.age); //20
		System.out.println(c2.age); //44
		System.out.println(c1.age);  //20
		
		/*
		Since, age is an object level property, this property will be present at object level NOT AT CLASS LEVEL.
		Meaning this is NOT	A SHARED RESOURCE.
		So, changing this property's value from an object will change at object level and not at class level.
		 */
	}

}
