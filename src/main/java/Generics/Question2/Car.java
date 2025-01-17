package Generics.Question2;

public class Car implements Comparable {
	private int speed;
	private int power;

	public Car(int speed, int power) {
		this.speed = speed;
		this.power = power;
	}

	@Override
	public String toString() {
		return "[S=" + this.speed + ", P=" + this.power + "]";
	}

	@Override
	public int compareTo(Object obj) {

		Car currCar = null;

		try {
			currCar = (Car) obj;
		} catch (Exception e) {
			return 0;
		}

		if (this.speed < currCar.speed) {
			return -1;
		} else if (this.speed == currCar.speed) {
			return 0;
		}

		return 1;
	}
}
