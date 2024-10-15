package Best_Practice_How_To_Print_Object_;

public class Car {
	int speed;
	int price;
	String name;
	
	Car(int speed, int price, String name)
	{
		this.speed = speed;
		this.price = price;
		this.name = name;
	}
	
	public String toString()
	{
		return "[ "+this.speed+" , "+this.price+" , "+this.name+" ]";
	}
}
