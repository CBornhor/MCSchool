/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chap Bornhor
*/

public class PatientDriverApp {

	public static void main(String[] args) {

		Patient pAtient = new Patient("Chap", "Ethan", "Bornhor", "123 Main Street", "Rockville", "MD", "20877","123456789", "Friend", "1234567890");
		
		System.out.println("Patient Name: " + pAtient.getfirstName() + " " + pAtient.getmiddleName() + " " + pAtient.getlastName());
		System.out.println("Address: " + pAtient.getaddress());
		System.out.println("City: " + pAtient.getcity());
		System.out.println("State: " + pAtient.getstate());
		System.out.println("Zip: " + pAtient.getZIP());
		System.out.println("Phone Number: " + pAtient.getphoneNumber());
		System.out.println("Emergency Contact: " + pAtient.getemergencyName() + " " + pAtient.getemergencyNumber());
		
		Procedure p1 = new Procedure("Physical Exam", "7/3/2023", "Dr. Irvine", 250.00);
		Procedure p2 = new Procedure("X-ray", "7/3/2023", "Dr. Jamison", 500.00);
		Procedure p3 = new Procedure("Blood Test", "7/3/2023", "Dr. Smith", 200.00);
		
		System.out.println("\nProcedure: ");
		System.out.println("Procedure Name: " + p1.getprocedureName());
		System.out.println("Date: " + p1.getprocedureDate());
		System.out.println("Practitioner: " + p1.getdoctorName());
		System.out.println("Procedure Charge: " + p1.getprodureCost() + "\n");
		
		System.out.println("Procedure: ");
		System.out.println("Procedure Name: " + p2.getprocedureName());
		System.out.println("Date: " + p2.getprocedureDate());
		System.out.println("Practitioner: " + p2.getdoctorName());
		System.out.println("Procedure Charge: " + p2.getprodureCost() + "\n");
		
		System.out.println("Procedure: ");
		System.out.println("Procedure Name: " + p3.getprocedureName());
		System.out.println("Date: " + p3.getprocedureDate());
		System.out.println("Practitioner: " + p3.getdoctorName());
		System.out.println("Procedure Charge: " + p3.getprodureCost() + "\n");
		
		System.out.println("Student Name: Chap Bornhor");
		System.out.println("Student MC M#: M21143980");
		System.out.println("Due Date: 07/03/2023");
		System.out.println("The program was developed by a Student: <Chap Bornhor> <06/27/23>");
	}
}
