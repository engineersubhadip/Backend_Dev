package Hospital_Management_System;

public class Patient {
	String name;
	String disease;
	Doctor inspectingDoctor;
	
	Patient(String name, String disease, Doctor inspectingDoctor)
	{
		this.name = name;
		this.disease = disease;
		this.inspectingDoctor = new Doctor(inspectingDoctor);
	}
	
	Patient(Patient P)
	{
		this.name = P.name;
		this.disease = P.disease;
		this.inspectingDoctor = new Doctor(P.inspectingDoctor);
	}
	
	void displayPatient()
	{
		System.out.println("------------------");
		System.out.println("Patient Name : "+this.name);
		System.out.println("Patient Disease : "+this.disease);
		this.inspectingDoctor.displayDoctor();
	}
}
