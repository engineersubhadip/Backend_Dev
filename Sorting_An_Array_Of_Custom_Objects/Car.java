package Sorting_An_Array_Of_Custom_Objects;
// Sorting car[] on the basis of Speed

public class Car implements Comparable<Car>{
	int price;
	int speed;
	String name;
	
	Car(int price, int speed, String name)
	{
		this.price = price;
		this.speed = speed;
		this.name = name;
	}
	
	public String toString()
	{
		return "[ Price : "+this.price+" , Speed : "+this.speed+" , Name : "+this.name+" ]";
	}

	
	public int compareTo(Car O)
	{
		return this.speed - O.speed;
	}
}
