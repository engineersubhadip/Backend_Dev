package Exercise_OOPS_Lecture_3;

public class ThreedPoint extends Point{
	private int z;
	
	public void display() // method over-riding
	{
		System.out.println("["+this.x+","+""+this.y+","+""+this.z+"]");
	}
	
}
