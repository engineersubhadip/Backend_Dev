package Sorting_An_Array_Of_Custom_Objects;
import java.util.*;

public class Client {
	
	static void displayCarList(Car cars[])
	{
		for (Car car : cars)
		{
			System.out.println(car);
		}
	}
	
	public static void main(String[] args) {
		Car cars[] = new Car[3];
		
		// cars : [null,null,null]
		
		cars[0] = new Car(100,120,"B");
		cars[1] = new Car(74,85,"A");
		cars[2] = new Car(104,107,"X");
		
		displayCarList(cars);
		
		Arrays.sort(cars);
		
		System.out.println("After Sorting ---------");
		displayCarList(cars);
	}

}
