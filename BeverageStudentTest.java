import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BeverageStudentTest {

    @Test
    public void testGetBasePrice() {
        Beverage beverage = new TestBeverage("Test", Size.SMALL, 5.0);
        assertEquals(5.0, beverage.getBasePrice());
    }

    @Test
    public void testGetType() {
        Beverage beverage = new TestBeverage("Test", Size.SMALL, 5.0);
        assertEquals(Type.YOUR_TYPE, beverage.getType());
    }

    @Test
    public void testGetBevName() {
        Beverage beverage = new TestBeverage("Test", Size.SMALL, 5.0);
        assertEquals("Test", beverage.getBevName());
    }

    @Test
    public void testGetSize() {
        Beverage beverage = new TestBeverage("Test", Size.SMALL, 5.0);
        assertEquals(Size.SMALL, beverage.getSize());
    }

    @Test
    public void testAddSizePriceSmall() {
        Beverage beverage = new TestBeverage("Test", Size.SMALL, 5.0);
        assertEquals(5.0, beverage.addSizePrice(1.0));
    }

    @Test
    public void testAddSizePriceMedium() {
        Beverage beverage = new TestBeverage("Test", Size.MEDIUM, 5.0);
        assertEquals(6.0, beverage.addSizePrice(1.0));
    }

    @Test
    public void testToString() {
        Beverage beverage = new TestBeverage("Test", Size.SMALL, 5.0);
        assertEquals("Test, SMALL", beverage.toString());
    }

    @Test
    public void testEquals() {
        Beverage beverage1 = new TestBeverage("Test", Size.SMALL, 5.0);
        Beverage beverage2 = new TestBeverage("Test", Size.SMALL, 5.0);
        assertTrue(beverage1.equals(beverage2));
    }

    @Test
    public void testCalcPrice() {
        Beverage beverage = new TestBeverage("Test", Size.SMALL, 5.0);
        assertEquals(5.0, beverage.calcPrice());
    }
    
    // A simple subclass of Beverage for testing purposes
    private class TestBeverage extends Beverage {
        public TestBeverage(String bevName, Size size, double basePrice) {
            super(bevName, size, basePrice);
        }

        @Override
        public Type getType() {
            return Type.YOUR_TYPE;
        }

        @Override
        public double calcPrice() {
            return getBasePrice();
        }
    }
}
