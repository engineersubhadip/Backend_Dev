package Hospital_Management_System;

public class Client {

	public static void main(String[] args) {
		
		Doctor doctorDetail1 = new Doctor("Marcus","ENT");
		Doctor doctorDetail2 = new Doctor(doctorDetail1);
		
//		doctorDetail1.displayDoctor();
		doctorDetail2.name = "Aurelius";
		doctorDetail2.specialization = "General Surgeon";
		
//		doctorDetail2.displayDoctor();
		
		Patient patientDetail1 = new Patient("Smitty","Cardio-Vascular-Blockage",doctorDetail2);
//		patientDetail1.displayPatient();
		
		Patient patientDetail2 = new Patient("Jane","Bronchitis",doctorDetail1);
//		patientDetail2.displayPatient();
		
		Hospital hospitalDetail1 = new Hospital("AMRI","Salt-Lake SF",patientDetail1);
		Hospital hospitalDetail2 = new Hospital("AMRI","Salt-Lake SF",patientDetail2);
		
		hospitalDetail1.displayHospital();
		hospitalDetail2.displayHospital();
	}

}
