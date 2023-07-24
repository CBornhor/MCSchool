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

public class HolidayBonus {

	public static double[]  calculateHolidayBonus(double[][] data) {
		double[] holidayBonus;
		int highest, lowest;
		holidayBonus = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			double bonus = 0;
			for (int j=0; j < data[i].length; j++) {
				if (data[i][j] >= 0) {
					if (data[i].length > 1) {
						lowest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j);
						highest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j);
						
					if (highest == i)
						bonus += 5000;
					else if (lowest == i)
						bonus += 1000;
					else if (data[i][j] >= 0)
						bonus += 2000;
					}
				} 
			}
			holidayBonus[i] = bonus;
		}
		return holidayBonus;
	}

	public static double calculateTotalHolidayBonus(double[][] data) {
	    double holidayBonus = 0;
	    int highest, lowest;
	    
	    for (int i = 0; i < data.length; i++) {
	        for (int j = 0; j < data[i].length; j++) {
	            if (data[i][j] >= 0) {
	                lowest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j);
	                highest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j);
	                
	                if (highest == i)
	                    holidayBonus += 5000;
	                else if (lowest == i)
	                    holidayBonus += 1000;
	                else if (data[i][j] >= 0)
	                    holidayBonus += 2000;
	            }
	        }
	    }
	    return holidayBonus;
	}

}
