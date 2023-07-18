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
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlotTestSudent {
    private Plot plot1, plot2;

    @Before
    public void setUp() throws Exception {
        plot1 = new Plot(2, 2, 6, 6);
        plot2 = new Plot(5, 5, 4, 4);
    }

    @After
    public void tearDown() throws Exception {
        plot1 = plot2 = null;
    }

    @Test
    public void testOverlaps() {
        assertTrue(plot1.overlaps(plot2)); 
    }

    @Test
    public void testToString() {
        assertEquals("5,5,4,4", plot2.toString());
    }
}
