package SingletonDesignPattern;

public class Client {

	public static void main(String[] args) {
		
		/*
//		Version 1 :-
		
		SingletonDesign_V1 v1 = new SingletonDesign_V1("A","Mizoram",23);
		SingletonDesign_V1 v2 = new SingletonDesign_V1("B","Aizwal",28);
		
//		Since we are able to create multiple objects of the Class.
//		This is not a singleton.
		 */
		
		/*
//		Version 2:-
		SingletonDesign_V2 v1 = new SingletonDesign_V2();
		SingletonDesign_V2 v2 = new SingletonDesign_V2();
		
//		Still we are able to create multiple objects because default constructor is still there.
//		This is not a singleton.
///
		 */
		
		/*
//		Version 3 :-
		SingletonDesign_V3 v1 = SingletonDesign_V3.setObject("A","Mizoram",23);
		SingletonDesign_V3 v2 = SingletonDesign_V3.setObject("B","Imphal",25);
		
//		Still we are able to create multiple objects.
//		This is not a single ton.		*/
		
		/*
//		Version 4 :-
		
		SingletonDesign_V4 v1 = SingletonDesign_V4.setObject();
		SingletonDesign_V4 v2 = SingletonDesign_V4.setObject();
		
		System.out.println(v1);
		System.out.println(v2);
		
//		We are able to create only one object for multiple object references.
//		This is single ton.
//		But this code will not work in multi-threaded environment.
		 */
		
//		Version 5 is the correct singleton for MultiThreaded Environment.
	
//		Version 5 will suffer from Performance hit, in a MultiThreaded Env.
//		It makes sense for the concurrent Threads to wait until the instance has been created.
//		But once the instance has been created, it does not makes sense for the concurrent threads to wait.
//		But since we are using synchronized keyword, all the threads will wait.
//		Hence performance hit.
		
		
	}

}
