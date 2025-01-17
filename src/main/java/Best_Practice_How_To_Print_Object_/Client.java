package Best_Practice_How_To_Print_Object_;


public class Client {
	
	static void printCars(Car cars[])
	{
		for (Car car : cars)
		{
			System.out.println(car);
		}
	}

	
	public static void main(String[] args) {
		
		Car cars[] = new Car[5];
		
		cars[0] = new Car(25,42,"V");
		cars[1] = new Car(73,12,"B");
		cars[2] = new Car(11,29,"X");
		cars[3] = new Car(37,19,"C");
		cars[4] = new Car(52,35,"G");
		
		printCars(cars);
		
		
	}
	
}
