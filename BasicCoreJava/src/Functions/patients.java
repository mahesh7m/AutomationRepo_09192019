package Functions;

public class patients {

	public static void main(String[] args) {

		Hospital hospital1 = new Hospital();
		hospital1.hospitalName = "noble";
		hospital1.patientType = "Bone injury";
		hospital1.speciality = "Orthopedic";
		hospital1.doctorsName = "Dr. Sharma";
		hospital1.numofBed = 100;
		hospital1.numofDoctors = 10;
		hospital1.treatment();
		hospital1.capacity();

		Hospital hospital2 = new Hospital();
		hospital2.hospitalName = "Columbia asia";
		hospital2.patientType = "Cancer";
		hospital2.speciality = "Oncologist";
		hospital2.doctorsName = "Dr. Batra";
		hospital2.numofBed = 50;
		hospital2.numofDoctors = 5;
		hospital2.treatment();
		hospital2.capacity();

		Hospital hospital3 = new Hospital("Tooth Ache", "Manohar", "Dentist", 1000, 100, "City Hospital");

		hospital3.treatment();
		hospital3.capacity();

	}

}
