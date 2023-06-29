/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Chap Bornhor
*/
package ESPTest;
import java.util.Scanner;
import java.util.Random;
public class Assignment1 {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner C = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = C.nextLine();
		System.out.print("Enter your MC M# : ");
		String id = C.nextLine();
		System.out.print("Describe yourself : ");
		String describe = C.nextLine();
		System.out.print("Due Date : ");
		String date = C.nextLine();
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		
		int correctGuesses = 0;
		//int red = 0, green = 1, blue = 2, orange = 3, yellow = 4;
		
		
		
		for (int round = 1; round <= 10; round++) 
		{
			
			System.out.println("Round " + round + "\n");
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			System.out.print("Enter your guess here: ");
			int input = C.nextInt();
			
			Random rand = new Random();
			int upperbound = 5;
			int int_random = rand.nextInt(upperbound);
			String s = "";
			if(int_random == 0) {
				s = "red";
			}
			if(int_random == 1) {
				s = "green";
			}
			if(int_random == 2) {
				s = "blue";
			}
			if(int_random == 3) {
				s = "orange";
			}
			if(int_random == 4) {
				s = "yellow";
			}
			
			
			if (int_random == input)
				correctGuesses ++;
			
			System.out.println("I was thinking of " + s);
			
		}
		
		System.out.println("Game Over\n");
		System.out.println("You guessed " + correctGuesses + " out of 10 colors correctly");
		System.out.println("Username : " + name);
		System.out.println("Student MC M# : " + id);
		System.out.println("User Description : " + describe);
		System.out.println("Date: " + date);
		
	}
	
	
	
	
}
