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

public class Patient 
{
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String ZIP;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyNumber;
	
	
	
	
	public Patient(String firstName, String middleName, String lastName, String address, String city, 
				   String state, String ZIP, String phoneNumber, String emergencyName, String emergencyNumber)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.ZIP = ZIP;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyNumber = emergencyNumber;
	}
	public String getfirstName()
	{	
		return firstName;
	}
	public void setfirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getmiddleName()
	{
		return middleName;
	}
	public void setmiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public void setlastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getaddress()
	{
		return address;
	}
	public void setaddress(String address)
	{
		this.address = address;
	}
	public String getcity()
	{
		return city;
	}
	public void setcity(String city)
	{
		this.city = city;
	}
	public String getstate()
	{
		return state;
	}
	public void setstate(String state)
	{
		this.state = state;
	}
	public String getZIP()
	{
		return ZIP;
	}
	public void setZIP(String ZIP)
	{
		this.ZIP = ZIP;
	}
	public String getphoneNumber()
	{
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getemergencyName()
	{
		return emergencyName;
	}
	public void setemergencyName(String emergencyName)
	{
		this.emergencyName = emergencyName;
	}
	public String getemergencyNumber()
	{
		return emergencyNumber;
	}
	public void setemergencyNumber(String emergencyNumber)
	{
		this.emergencyNumber = emergencyNumber;
	}
	
	
}
