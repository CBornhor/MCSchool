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
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PropertyTestStudent {
		private Property propertyOne;

		@Before
		public void setUp() throws Exception {
			propertyOne = new Property("Property ABC", "Rockville", 2450.00, "Wells Fargo Bank");
		}

		@After
		public void tearDown() throws Exception {
			propertyOne = null;
		}

		@Test
		public void testGetPropertyName() {
			assertEquals("Property ABC", propertyOne.getPropertyName());
		}

		@Test
		public void testGetRentAmount() {
			assertEquals(2450.00, propertyOne.getRentAmount(), 0.01);
		}

		@Test
		public void testGetPlot() {
			Plot plot = propertyOne.getPlot();
			assertEquals(0, plot.getX());
			assertEquals(0, plot.getY());
			assertEquals(1, plot.getWidth());
			assertEquals(1, plot.getDepth());
		}

		@Test
		public void testToString() {
			assertEquals("Property ABC,Rockville,Wells Fargo Bank,2450.0", propertyOne.toString());
		}

	}


