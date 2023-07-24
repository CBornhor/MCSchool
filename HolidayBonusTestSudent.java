/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Chap Bornhor
*/

import static org.junit.Assert.*;
import org.junit.Test;
public class HolidayBonusTestSudent {

	@Test
    public void testCalculateHolidayBonus() {
        double[][] data = {
            {1000, 2000, 1500},
            {3000, 2500, 1800},
            {500, 800, 700}
        };
        
        double[] expectedBonuses = {6000, 7000, 2500};
        double[] actualBonuses = HolidayBonus.calculateHolidayBonus(data);
        
        assertArrayEquals(expectedBonuses, actualBonuses, 0.001);
    }
	
	@Test
    public void testCalculateTotalHolidayBonus() {
        double[][] data = {
            {1000, 2000, 1500},
            {3000, 2500, 1800},
            {500, 800, 700}
        };
        
        double expectedTotalBonus = 6000 + 7000 + 2500;
        double actualTotalBonus = HolidayBonus.calculateTotalHolidayBonus(data);
        
        assertEquals(expectedTotalBonus, actualTotalBonus, 0.001);
    }
}
