package StaticDataMemberImplication;

public class Client {

	public static void main(String[] args) {
		System.out.println(Parent.age); // 20
		
		Child1 c1 = new Child1();
		System.out.println(c1.age); // 20
		
		Child2 c2 = new Child2();
		System.out.println(c2.age); // 20
		
		c1.age = 25;
		
		System.out.println(c2.age); //25
		System.out.println(Parent.age); //25
		System.out.println(c1.age); //25
		
		/*
		Since, age is an CLASS level property, this property will be present at CLASS LEVEL.
		Meaning this is	A SHARED RESOURCE.
		So, changing this property's value from an object will change at CLASS LEVEL OF PARENT, WHICH WILL BE REFLECTED ACROSS ALL ITS CHILD.
		 */
	}

}
