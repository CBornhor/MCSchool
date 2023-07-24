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

import java.io.*;

public class TwoDimRaggedArrayUtility {

    public static double[][] readFile(File file) throws FileNotFoundException {
        int MAX_ROW = 10;

        double[][] raggedArr = new double[MAX_ROW][];

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int row = 0;

            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                int size = temp.length;
                raggedArr[row] = new double[size];

                for (int col = 0; col < size; col++) {
                    raggedArr[row][col] = Double.parseDouble(temp[col]);
                }
                row++;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return raggedArr;
    }

    public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.print(data[i][j] + " ");
                }
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static double getTotal(double[][] data) {
        double total = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
        }

        return total;
    }

    public static double getAverage(double[][] data) {
        double total = 0;
        int numOfElements = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
                numOfElements++;
            }
        }

        return total / numOfElements;
    }

    public static double getRowTotal(double[][] data, int row) {
        double total = 0;

        for (int j = 0; j < data[row].length; j++) {
            total += data[row][j];
        }

        return total;
    }

    public static double getColumnTotal(double[][] data, int col) {
        double total = 0;

        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length) {
                total += data[i][col];
            }
        }

        return total;
    }

    public static double getHighestInRow(double[][] data, int row) {
        double highest = data[row][0];

        for (int j = 1; j < data[row].length; j++) {
            if (data[row][j] > highest) {
                highest = data[row][j];
            }
        }

        return highest;
    }

    public static int getHighestInRowIndex(double[][] data, int row) {
        int index = 0;

        for (int i = 1; i < data[row].length; ++i) {
            if (data[row][i] > data[row][index]) {
                index = i;
            }
        }

        return index;
    }

    public static double getLowestInRow(double[][] data, int row) {
        double lowest = data[row][0];

        for (int j = 1; j < data[row].length; j++) {
            if (data[row][j] < lowest) {
                lowest = data[row][j];
            }
        }

        return lowest;
    }

    public static int getLowestInRowIndex(double[][] data, int row) {
        int index = 0;

        for (int i = 1; i < data[row].length; ++i) {
            if (data[row][i] < data[row][index]) {
                index = i;
            }
        }

        return index;
    }

    public static double getHighestInColumn(double[][] data, int col) {
        if (data == null || col < 0 || col >= data[0].length) {
            throw new IllegalArgumentException("Invalid input or empty column.");
        }

        double highest = data[0][col];

        for (int i = 1; i < data.length; i++) {
            if (data[i].length > col && data[i][col] > highest) {
                highest = data[i][col];
            }
        }

        return highest;
    }

    public static int getHighestInColumnIndex(double[][] data, int col) {
        if (data == null || col < 0 || col >= data[0].length) {
            throw new IllegalArgumentException("Invalid input or empty column.");
        }

        int highestInd = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i].length > col && data[i][col] > data[highestInd][col]) {
                highestInd = i;
            }
        }

        return highestInd;
    }

    public static double getLowestInColumn(double[][] data, int col) {
        if (data == null || col < 0 || col >= data[0].length) {
            throw new IllegalArgumentException("Invalid input or empty column.");
        }

        double lowest = data[0][col];

        for (int i = 1; i < data.length; i++) {
            if (data[i].length > col && data[i][col] < lowest) {
                lowest = data[i][col];
            }
        }

        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] data, int col) {
        if (data == null || col < 0 || col >= data[0].length) {
            throw new IllegalArgumentException("Invalid input or empty column.");
        }

        int lowestInd = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i].length > col && data[i][col] < data[lowestInd][col]) {
                lowestInd = i;
            }
        }

        return lowestInd;
    }


    public static double getHighestInArray(double[][] data) {
        double highest = data[0][0];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > highest) {
                    highest = data[i][j];
                }
            }
        }

        return highest;
    }

    public static double getLowestInArray(double[][] data) {
        double lowest = data[0][0];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < lowest) {
                    lowest = data[i][j];
                }
            }
        }

        return lowest;
    }
}
