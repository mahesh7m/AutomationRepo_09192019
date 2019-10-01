package Functions;

public class Hospital {

	public String patientType;
	public String doctorsName;
	public String speciality;
	public int numofBed;
	public int numofDoctors;
	public String hospitalName;

	public void treatment() {
		System.out.println(
				"patients with the " + patientType + " will be sent to the " + speciality + " doctor "+doctorsName);
	}

	public void capacity() {
		System.out.println("Noble hospital has " + numofBed + " beds and " + numofDoctors + " doctors");

	}
	//Default Constructor
public Hospital()
{
	
}


public Hospital(String patientType,String doctorsName,String speciality, int numofBed, int numofDoctors,String hospitalName) 
{
	this.patientType=patientType;
	this.doctorsName=doctorsName;
	this.speciality=speciality;
	this.numofBed=numofBed;
	this.numofDoctors=numofDoctors;
	this.hospitalName=hospitalName;
	
	
}
}

