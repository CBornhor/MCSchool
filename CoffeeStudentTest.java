import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeStudentTest {

    private Coffee coffee;

    @BeforeEach
    public void setUp() {
        coffee = new Coffee("Latte", Size.MEDIUM, true, false);
    }

    @Test
    public void testGetExtraShot() {
        assertTrue(coffee.getExtraShot());
    }

    @Test
    public void testGetExtraSyrup() {
        assertFalse(coffee.getExtraSyrup());
    }

    @Test
    public void testGetType() {
        assertEquals(Type.COFFEE, coffee.getType());
    }

    @Test
    public void testCalcPriceSmall() {
        coffee = new Coffee("Espresso", Size.SMALL, true, true);
        assertEquals(2.5, coffee.calcPrice());
    }

    @Test
    public void testCalcPriceMedium() {
        assertEquals(3.0, coffee.calcPrice());
    }

    @Test
    public void testCalcPriceLarge() {
        coffee = new Coffee("Cappuccino", Size.LARGE, false, true);
        assertEquals(4.0, coffee.calcPrice());
    }

    @Test
    public void testToString() {
        String expected = "Latte, MEDIUM, Extra Shot: Yes, Extra Syrup: No, Price: 3.0";
        assertEquals(expected, coffee.toString());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(coffee.equals(coffee));
    }

    @Test
    public void testEqualsDifferentObject() {
        assertFalse(coffee.equals(null));
        assertFalse(coffee.equals("not a Coffee object"));
    }

    @Test
    public void testEqualsDifferentProperties() {
        Coffee otherCoffee = new Coffee("Latte", Size.MEDIUM, false, false);
        assertFalse(coffee.equals(otherCoffee));
    }

    @Test
    public void testEqualsSameProperties() {
        Coffee sameCoffee = new Coffee("Latte", Size.MEDIUM, true, false);
        assertTrue(coffee.equals(sameCoffee));
    }
}
