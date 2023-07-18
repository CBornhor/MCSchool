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
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
    private ManagementCompany managementCompany;
    private Property sampleProperty;

    @Before
    public void setUp() throws Exception {
        managementCompany = new ManagementCompany("Railey", "555555555", 6);
    }

    @After
    public void tearDown() throws Exception {
        managementCompany = null;
    }

    @Test
    public void testAddProperty() {
        sampleProperty = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 2, 2);
        assertEquals(0, managementCompany.addProperty(sampleProperty));
    }

    @Test
    public void testAddProperty_OverlappingProperties() {
        sampleProperty = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 2, 2);
        managementCompany.addProperty(sampleProperty);

        Property overlappingProperty = new Property("Another Property", "Beckman", 3000, "John Doe", 1, 4, 3, 3);
        assertEquals(-4, managementCompany.addProperty(overlappingProperty));
    }

    @Test
    public void testAddProperty_NullProperty() {
        assertEquals(-2, managementCompany.addProperty((Property) null));
    }

    @Test
    public void testAddProperty_PlotNotEncompassed() {
        sampleProperty = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 12, 12);
        assertEquals(-3, managementCompany.addProperty(sampleProperty));
    }

    @Test
    public void testAddProperty_ArrayFull() {
        for (int i = 0; i < ManagementCompany.MAX_PROPERTY; i++) {
            sampleProperty = new Property("Property " + i, "City " + i, i * 1000, "Owner " + i);
            assertEquals(i, managementCompany.addProperty(sampleProperty));
        }

        sampleProperty = new Property("Extra Property", "Extra City", 5000, "Extra Owner");
        assertEquals(-1, managementCompany.addProperty(sampleProperty));
    }

    @Test
    public void testRemoveLastProperty() {
        sampleProperty = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 2, 2);
        managementCompany.addProperty(sampleProperty);

        managementCompany.removeLastProperty();

        assertEquals(0, managementCompany.getPropertiesCount());
    }

    @Test
    public void testIsPropertiesFull() {
        assertFalse(managementCompany.isPropertiesFull());

        for (int i = 0; i < ManagementCompany.MAX_PROPERTY; i++) {
            sampleProperty = new Property("Property " + i, "City " + i, i * 1000, "Owner " + i);
            managementCompany.addProperty(sampleProperty);
        }

        assertTrue(managementCompany.isPropertiesFull());
    }

    @Test
    public void testGetPropertiesCount() {
        assertEquals(0, managementCompany.getPropertiesCount());

        sampleProperty = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 2, 2);
        managementCompany.addProperty(sampleProperty);

        assertEquals(1, managementCompany.getPropertiesCount());
    }

    @Test
    public void testGetTotalRent() {
        assertEquals(0, managementCompany.getTotalRent(), 0.0);

        sampleProperty = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 2, 2);
        managementCompany.addProperty(sampleProperty);

        assertEquals(2613, managementCompany.getTotalRent(), 0.0);
    }

    @Test
    public void testGetHighestRentProperty() {
        assertNull(managementCompany.getHighestRentProperty());

        Property property1 = new Property("Property 1", "City 1", 1000, "Owner 1");
        Property property2 = new Property("Property 2", "City 2", 2000, "Owner 2");
        Property property3 = new Property("Property 3", "City 3", 1500, "Owner 3");

        managementCompany.addProperty(property1);
        managementCompany.addProperty(property2);
        managementCompany.addProperty(property3);

        assertEquals(property2, managementCompany.getHighestRentProperty());
    }


    @Test
    public void testIsManagementFeeValid() {
        assertTrue(managementCompany.isManagementFeeValid());

        ManagementCompany highFeeCompany = new ManagementCompany("High Fee Company", "123456789", 150);
        assertFalse(highFeeCompany.isManagementFeeValid());

        ManagementCompany negativeFeeCompany = new ManagementCompany("Negative Fee Company", "987654321", -10);
        assertFalse(negativeFeeCompany.isManagementFeeValid());
    }


    @Test
    public void testGetName() {
        assertEquals("Railey", managementCompany.getName());
    }

    @Test
    public void testGetTaxID() {
        assertEquals("555555555", managementCompany.getTaxID());
    }

    @Test
    public void testGetProperties() {
        sampleProperty = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 2, 2);
        managementCompany.addProperty(sampleProperty);

        Property[] properties = managementCompany.getProperties();
        assertNotNull(properties);
        assertEquals(1, properties.length);
        assertEquals(sampleProperty, properties[0]);
    }

    @Test
    public void testGetMgmFeePer() {
        assertEquals(6, managementCompany.getMgmFeePer(), 0.0);
    }

    @Test
    public void testGetPlot() {
        Plot plot = managementCompany.getPlot();
        assertNotNull(plot);
        assertEquals(0, plot.getX());
        assertEquals(0, plot.getY());
        assertEquals(ManagementCompany.MGMT_WIDTH, plot.getWidth());
        assertEquals(ManagementCompany.MGMT_DEPTH, plot.getDepth());
    }

    @Test
    public void testToString() {
        sampleProperty = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 2, 2);
        managementCompany.addProperty(sampleProperty);

        assertEquals("Management Company: Railey, Tax ID: 555555555\n" +
                "Properties:\n" +
                "Sunsational,Beckman,BillyBob Wilson,2613.0\n", managementCompany.toString());
    }
}
