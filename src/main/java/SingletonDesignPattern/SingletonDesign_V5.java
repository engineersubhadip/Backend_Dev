package SingletonDesignPattern;

public class SingletonDesign_V5 {
	
		String name;
		String city;
		int age;
		private static SingletonDesign_V5 obj;
		
		private SingletonDesign_V5(String name, String city, int age) {
			this.name = name;
			this.city = city;
			this.age = age;
		}

		public static synchronized SingletonDesign_V5 setObject() {
			
			if (obj == null) {
				obj = new SingletonDesign_V5("A","Mizoram",23);			
			}
			return obj;
		}
}
