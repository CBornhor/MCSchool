import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Movie New = new Movie();
		
		
		System.out.println("Enter the name of the movie : ");
		String title = scanner.nextLine();
		New.setTitle(title);
		System.out.println("Enter the rating for this movie : ");
		String rating = scanner.nextLine();
		New.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie : ");
		int tickets = scanner.nextInt();
		New.setSoldTickets(tickets);
		System.out.println(New.toString());
		
		
		
		
		
		
		
		
	}

}
