import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieStudentTest {

    private Smoothie smoothie;

    @BeforeEach
    void setUp() {
        smoothie = new Smoothie("Berry Blast", Size.MEDIUM, 3, true);
    }

    @Test
    void testGetNumOfFruits() {
        assertEquals(3, smoothie.getNumOfFruits());
    }

    @Test
    void testGetAddProtein() {
        assertTrue(smoothie.getAddProtein());
    }

    @Test
    void testGetType() {
        assertEquals(Type.SMOOTHIE, smoothie.getType());
    }

    @Test
    void testCalcPriceMedium() {
        assertEquals(4.5, smoothie.calcPrice());
    }

    @Test
    void testCalcPriceLarge() {
        smoothie = new Smoothie("Berry Blast", Size.LARGE, 4, false);
        assertEquals(5.5, smoothie.calcPrice());
    }

    @Test
    void testCalcPriceSmall() {
        smoothie = new Smoothie("Berry Blast", Size.SMALL, 2, true);
        assertEquals(4.0, smoothie.calcPrice());
    }

    @Test
    void testToString() {
        String expected = "Berry Blast, MEDIUM, Number of Fruits: 3, Add Protein: Yes, Price: 4.5";
        assertEquals(expected, smoothie.toString());
    }

    @Test
    void testEqualsSameObject() {
        assertEquals(smoothie, smoothie);
    }

    @Test
    void testEqualsDifferentClass() {
        assertNotEquals(smoothie, new Object());
    }

    @Test
    void testEqualsDifferentSmoothie() {
        Smoothie other = new Smoothie("Berry Blast", Size.MEDIUM, 4, false);
        assertNotEquals(smoothie, other);
    }

    @Test
    void testEqualsSameSmoothie() {
        Smoothie same = new Smoothie("Berry Blast", Size.MEDIUM, 3, true);
        assertEquals(smoothie, same);
    }
}
