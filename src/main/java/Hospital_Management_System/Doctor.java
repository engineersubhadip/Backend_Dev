package Hospital_Management_System;

public class Doctor {
	String name;
	String specialization;
	
	Doctor(String name, String specialization)
	{
		this.name = name;
		this.specialization = specialization;
	}
	
	Doctor(Doctor D)
	{
		this.name = D.name;
		this.specialization = D.specialization;
	}
	
	void displayDoctor()
	{
		System.out.println("------------------");
		System.out.println("Doctor Name : "+this.name);
		System.out.println("Specialization : "+this.specialization);
		System.out.println("------------------");
	}
}
