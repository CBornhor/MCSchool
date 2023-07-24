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
import java.io.File;
import java.io.IOException;

public class TwoDimRaggedArrayUtilityTestStudent {

	@Test
    public void testReadFile() throws IOException {
        double[][] expectedData = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        File inputFile = new File("test_input.txt");
        TwoDimRaggedArrayUtility.writeToFile(expectedData, inputFile);

        double[][] actualData = TwoDimRaggedArrayUtility.readFile(inputFile);
        assertArrayEquals(expectedData, actualData);
    }

	@Test
    public void testWriteToFile() throws IOException {
        double[][] data = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        File outputFile = new File("test_output.txt");
        TwoDimRaggedArrayUtility.writeToFile(data, outputFile);

        double[][] readData = TwoDimRaggedArrayUtility.readFile(outputFile);
        assertArrayEquals(data, readData);
    }
	
	@Test
    public void testGetTotal() {
        double[][] data = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        double expectedTotal = 45;
        double actualTotal = TwoDimRaggedArrayUtility.getTotal(data);
        assertEquals(expectedTotal, actualTotal, 0.001);
    }

	@Test
    public void testGetAverage() {
        double[][] data = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        double expectedAverage = 5;
        double actualAverage = TwoDimRaggedArrayUtility.getAverage(data);
        assertEquals(expectedAverage, actualAverage, 0.001);
    }

	 @Test
	    public void testGetRowTotal() {
	        double[][] data = {
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8, 9}
	        };

	        double expectedRowTotal1 = 6;
	        double expectedRowTotal2 = 9;
	        double expectedRowTotal3 = 30;

	        double actualRowTotal1 = TwoDimRaggedArrayUtility.getRowTotal(data, 0);
	        double actualRowTotal2 = TwoDimRaggedArrayUtility.getRowTotal(data, 1);
	        double actualRowTotal3 = TwoDimRaggedArrayUtility.getRowTotal(data, 2);

	        assertEquals(expectedRowTotal1, actualRowTotal1, 0.001);
	        assertEquals(expectedRowTotal2, actualRowTotal2, 0.001);
	        assertEquals(expectedRowTotal3, actualRowTotal3, 0.001);
	    }

	 @Test
	    public void testGetColumnTotal() {
	        double[][] data = {
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8, 9}
	        };

	        double expectedColumnTotal1 = 11;
	        double expectedColumnTotal2 = 14;
	        double expectedColumnTotal3 = 11;
	        double expectedColumnTotal4 = 9;

	        double actualColumnTotal1 = TwoDimRaggedArrayUtility.getColumnTotal(data, 0);
	        double actualColumnTotal2 = TwoDimRaggedArrayUtility.getColumnTotal(data, 1);
	        double actualColumnTotal3 = TwoDimRaggedArrayUtility.getColumnTotal(data, 2);
	        double actualColumnTotal4 = TwoDimRaggedArrayUtility.getColumnTotal(data, 3);

	        assertEquals(expectedColumnTotal1, actualColumnTotal1, 0.001);
	        assertEquals(expectedColumnTotal2, actualColumnTotal2, 0.001);
	        assertEquals(expectedColumnTotal3, actualColumnTotal3, 0.001);
	        assertEquals(expectedColumnTotal4, actualColumnTotal4, 0.001);
	    }

	 @Test
	    public void testGetHighestInRow() {
	        double[][] data = {
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8, 9}
	        };

	        double expectedHighest1 = 3;
	        double expectedHighest2 = 5;
	        double expectedHighest3 = 9;

	        double actualHighest1 = TwoDimRaggedArrayUtility.getHighestInRow(data, 0);
	        double actualHighest2 = TwoDimRaggedArrayUtility.getHighestInRow(data, 1);
	        double actualHighest3 = TwoDimRaggedArrayUtility.getHighestInRow(data, 2);

	        assertEquals(expectedHighest1, actualHighest1, 0.001);
	        assertEquals(expectedHighest2, actualHighest2, 0.001);
	        assertEquals(expectedHighest3, actualHighest3, 0.001);
	    }

	 @Test
	    public void testGetHighestInRowIndex() {
	        double[][] data = {
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8, 9}
	        };

	        int expectedIndex1 = 2;
	        int expectedIndex2 = 1;
	        int expectedIndex3 = 3;

	        int actualIndex1 = TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 0);
	        int actualIndex2 = TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 1);
	        int actualIndex3 = TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 2);

	        assertEquals(expectedIndex1, actualIndex1);
	        assertEquals(expectedIndex2, actualIndex2);
	        assertEquals(expectedIndex3, actualIndex3);
	    }

	 @Test
	    public void testGetLowestInRow() {
	        double[][] data = {
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8, 9}
	        };

	        double expectedLowest1 = 1;
	        double expectedLowest2 = 4;
	        double expectedLowest3 = 6;

	        double actualLowest1 = TwoDimRaggedArrayUtility.getLowestInRow(data, 0);
	        double actualLowest2 = TwoDimRaggedArrayUtility.getLowestInRow(data, 1);
	        double actualLowest3 = TwoDimRaggedArrayUtility.getLowestInRow(data, 2);

	        assertEquals(expectedLowest1, actualLowest1, 0.001);
	        assertEquals(expectedLowest2, actualLowest2, 0.001);
	        assertEquals(expectedLowest3, actualLowest3, 0.001);
	    }

	 @Test
	    public void testGetLowestInRowIndex() {
	        double[][] data = {
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8, 9}
	        };

	        int expectedIndex1 = 0;
	        int expectedIndex2 = 0;
	        int expectedIndex3 = 0;

	        int actualIndex1 = TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 0);
	        int actualIndex2 = TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 1);
	        int actualIndex3 = TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 2);

	        assertEquals(expectedIndex1, actualIndex1);
	        assertEquals(expectedIndex2, actualIndex2);
	        assertEquals(expectedIndex3, actualIndex3);
	    }

	 
	 @Test
	    public void testGetHighestInArray() {
	        double[][] data = {
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8, 9}
	        };

	        double expectedHighest = 9;
	        double actualHighest = TwoDimRaggedArrayUtility.getHighestInArray(data);

	        assertEquals(expectedHighest, actualHighest, 0.001);
	    }

	 @Test
	    public void testGetLowestInArray() {
	        double[][] data = {
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8, 9}
	        };

	        double expectedLowest = 1;
	        double actualLowest = TwoDimRaggedArrayUtility.getLowestInArray(data);

	        assertEquals(expectedLowest, actualLowest, 0.001);
	    }
}
