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

public class Procedure 
{
	private String procedureName;
	private String procedureDate;
	private String doctorName;
	private double procedureCost;
	
	public Procedure(String procedureName, String procedureDate, String doctorName, double procedureCost)
	{
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.doctorName = doctorName;
		this.procedureCost = procedureCost;
	}
	public String getprocedureName()
	{	
		return procedureName;
	}
	public void setprocedureName(String procedureName)
	{
		this.procedureName = procedureName;
	}
	public String getprocedureDate()
	{	
		return procedureDate;
	}
	public void setprocedureDate(String procedureDate)
	{
		this.procedureDate = procedureDate;
	}
	public String getdoctorName()
	{	
		return doctorName;
	}
	public void setdoctorName(String doctorName)
	{
		this.doctorName = doctorName;
	}
	public double getprodureCost()
	{
		return procedureCost;
	}
	public void setprocedureCost(double procedureCost)
	{
		this.procedureCost = procedureCost;
	}	
}
