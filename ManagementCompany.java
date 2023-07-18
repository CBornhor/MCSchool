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
public class ManagementCompany {
    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_WIDTH = 10;
    public static final int MGMT_DEPTH = 10;

    private String name;
    private String taxID;
    private double mgmFee;
    private Plot plot;
    private Property[] properties;
    private int propertyCount;

    public ManagementCompany() {
        this("", "", 0);
    }

    public ManagementCompany(String name, String taxID, double mgmFee) {
        this(name, taxID, mgmFee, 0, 0, MGMT_WIDTH, MGMT_DEPTH);
    }

    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFee = mgmFee;
        this.plot = new Plot(x, y, width, depth);
        this.properties = new Property[MAX_PROPERTY];
        this.propertyCount = 0;
    }

    public ManagementCompany(ManagementCompany otherCompany) {
        this(otherCompany.getName(), otherCompany.getTaxID(), otherCompany.getMgmFeePer(),
                otherCompany.getPlot().getX(), otherCompany.getPlot().getY(),
                otherCompany.getPlot().getWidth(), otherCompany.getPlot().getDepth());
    }

    public int addProperty(String name, String city, double rent, String owner) {
        return addProperty(new Property(name, city, rent, owner));
    }

    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
    }

    public int addProperty(Property property) {
        if (property == null)
            return -2;

        if (!plot.encompasses(property.getPlot()))
            return -3;

        for (int i = 0; i < propertyCount; i++) {
            if (property.getPlot().overlaps(properties[i].getPlot()))
                return -4;
        }

        if (propertyCount == MAX_PROPERTY)
            return -1;

        properties[propertyCount] = property;
        propertyCount++;
        return propertyCount - 1;
    }

    public void removeLastProperty() {
        if (propertyCount > 0) {
            properties[propertyCount - 1] = null;
            propertyCount--;
        }
    }

    public boolean isPropertiesFull() {
        return propertyCount == MAX_PROPERTY;
    }

    public int getPropertiesCount() {
        return propertyCount;
    }

    public double getTotalRent() {
        double totalRent = 0;
        for (int i = 0; i < propertyCount; i++) {
            totalRent += properties[i].getRentAmount();
        }
        return totalRent;
    }

    public Property getHighestRentProperty() {
        if (propertyCount == 0)
            return null;

        Property highestRentProperty = properties[0];
        for (int i = 1; i < propertyCount; i++) {
            if (properties[i].getRentAmount() > highestRentProperty.getRentAmount())
                highestRentProperty = properties[i];
        }
        return new Property(highestRentProperty);
    }

    public boolean isManagementFeeValid() {
        return mgmFee >= 0 && mgmFee <= 100;
    }

    public String getName() {
        return name;
    }

    public String getTaxID() {
        return taxID;
    }

    public Property[] getProperties() {
        return properties;
    }

    public double getMgmFeePer() {
        return mgmFee;
    }

    public Plot getPlot() {
        return plot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Management Company: ").append(name).append(", Tax ID: ").append(taxID).append("\n");
        sb.append("Properties:\n");
        for (int i = 0; i < propertyCount; i++) {
            sb.append(properties[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
