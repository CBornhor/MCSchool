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
public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;

	public Property() {
		this("", "", 0.0, "");
	}

	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}

	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width,
			int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}

	public Property(Property otherProperty) {
		this.propertyName = otherProperty.getPropertyName();
		this.city = otherProperty.getCity();
		this.rentAmount = otherProperty.getRentAmount();
		this.owner = otherProperty.getOwner();
		this.plot = new Plot(otherProperty.getPlot());
	}

	public Plot getPlot() {
		return plot;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public String getCity() {
		return city;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public String getOwner() {
		return owner;
	}

	@Override
	public String toString() {
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}

}
