package Hospital_Management_System;

public class Hospital {
	String hospitalName;
	String location;
	Patient P;
	
	Hospital(String hospitalName, String location, Patient P)
	{
		this.hospitalName = hospitalName;
		this.location = location;
		this.P = new Patient(P);
	}
	
	Hospital(Hospital H)
	{
		this.hospitalName = H.hospitalName;
		this.location = H.location;
		this.P = new Patient(H.P);
	}
	
	void displayHospital()
	{
		System.out.println("------------------");
		System.out.println("Hospital Name : "+this.hospitalName);
		System.out.println("Hospital Location : "+this.location);
		this.P.displayPatient();
	}
}
