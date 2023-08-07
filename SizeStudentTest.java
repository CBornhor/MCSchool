import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SizeStudentTest {

    @Test
    public void testValues() {
        Size[] sizes = Size.values();
        assertEquals(3, sizes.length); // Adjust the value according to the number of enum constants
        assertEquals(Size.SMALL, sizes[0]);
        assertEquals(Size.MEDIUM, sizes[1]);
        assertEquals(Size.LARGE, sizes[2]);
    }

    @Test
    public void testValueOf() {
        assertEquals(Size.SMALL, Size.valueOf("SMALL"));
        assertEquals(Size.MEDIUM, Size.valueOf("MEDIUM"));
        assertEquals(Size.LARGE, Size.valueOf("LARGE"));
        assertThrows(IllegalArgumentException.class, () -> Size.valueOf("XTRA_LARGE")); // Adjust to a non-existing enum constant name
        assertThrows(NullPointerException.class, () -> Size.valueOf(null));
    }
}
