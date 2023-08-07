import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypeStudentTest {

    @Test
    void testValues() {
        Type[] types = Type.values();
        assertNotNull(types);
        assertEquals(3, types.length); // Adjust the length based on your enum declaration
        assertEquals(Type.COFFEE, types[0]);
        assertEquals(Type.ALCOHOL, types[1]);
        assertEquals(Type.SMOOTHIE, types[2]);
        // Add more assertions for other enum values if needed
    }

    @Test
    void testValueOfValidName() {
        assertEquals(Type.COFFEE, Type.valueOf("COFFEE"));
        assertEquals(Type.ALCOHOL, Type.valueOf("ALCOHOL"));
        assertEquals(Type.SMOOTHIE, Type.valueOf("SMOOTHIE"));
        // Add more assertions for other valid enum names if needed
    }

    @Test
    void testValueOfInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> Type.valueOf("INVALID_TYPE"));
        assertThrows(IllegalArgumentException.class, () -> Type.valueOf(""));
        assertThrows(IllegalArgumentException.class, () -> Type.valueOf(null));
    }
}
