import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DayStudentTest {

    @Test
    public void testValues() {
        Day[] days = Day.values();
        assertEquals(7, days.length);
        assertEquals(Day.MONDAY, days[0]);
        assertEquals(Day.TUESDAY, days[1]);
        assertEquals(Day.WEDNESDAY, days[2]);
        assertEquals(Day.THURSDAY, days[3]);
        assertEquals(Day.FRIDAY, days[4]);
        assertEquals(Day.SATURDAY, days[5]);
        assertEquals(Day.SUNDAY, days[6]);
    }

    @Test
    public void testValueOf() {
        assertEquals(Day.MONDAY, Day.valueOf("MONDAY"));
        assertEquals(Day.TUESDAY, Day.valueOf("TUESDAY"));
        assertEquals(Day.WEDNESDAY, Day.valueOf("WEDNESDAY"));
        assertEquals(Day.THURSDAY, Day.valueOf("THURSDAY"));
        assertEquals(Day.FRIDAY, Day.valueOf("FRIDAY"));
        assertEquals(Day.SATURDAY, Day.valueOf("SATURDAY"));
        assertEquals(Day.SUNDAY, Day.valueOf("SUNDAY"));
    }
}
