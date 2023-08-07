import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlcoholStudentTest {

	@Test
	public void testCalcPrice() {
	    Alcohol alcohol = new Alcohol("Whiskey", Size.LARGE, true);
	    double expectedPrice = 7.0; // Update this with the correct expected price calculation
	    double actualPrice = alcohol.calcPrice();
	    assertEquals(expectedPrice, actualPrice, 0.001); // Adjust the delta value as needed
	}

	@Test
	public void testToString() {
	    Alcohol alcohol = new Alcohol("Vodka", Size.MEDIUM, false);
	    String expectedString = "Vodka, MEDIUM, Weekend: No, Price: 0.0";
	    String actualString = alcohol.toString();
	    assertEquals(expectedString, actualString);
	}

	
    @Test
    public void testEquals() {
        Alcohol alcohol1 = new Alcohol("Rum", Size.SMALL, true);
        Alcohol alcohol2 = new Alcohol("Rum", Size.SMALL, true);
        assertTrue(alcohol1.equals(alcohol2));
    }

    @Test
    public void testIsWeekend() {
        Alcohol weekendAlcohol = new Alcohol("Beer", Size.LARGE, true);
        assertTrue(weekendAlcohol.isWeekend());

        Alcohol nonWeekendAlcohol = new Alcohol("Wine", Size.SMALL, false);
        assertFalse(nonWeekendAlcohol.isWeekend());
    }
}
