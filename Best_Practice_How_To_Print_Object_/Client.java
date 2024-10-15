package Best_Practice_How_To_Print_Object_;

import java.util.*;

class customComparator implements Comparator<Car>
{
	public int compare(Car car1, Car car2)
	{
		if (car1.speed <= car2.speed)
		{
			return -1;
		}
		return 1;
	}
}


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
		
		System.out.println("After Sorting --- ");
		
		Arrays.sort(cars, new customComparator());
		
		printCars(cars);
		
	}
	
}
