import java.util.Scanner;

public class BevShorDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShop bevShop = new BevShop();
        
        System.out.println("The current order in process can have at most " + bevShop.getMaxOrderForAlcohol() + " alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is " + bevShop.getMinAgeForAlcohol());
        System.out.println("Start please a new order:");
        
        Order currentOrder = null;
        while (true) {
            System.out.println("Your Total Order for now is " + (currentOrder != null ? currentOrder.calcOrderTotal() : 0.0));
            
            System.out.print("Would you please enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Would you please enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            if (bevShop.isValidAge(age)) {
                Customer customer = new Customer(name, age);
                bevShop.startNewOrder(12, Day.SATURDAY, "John", 23);
                currentOrder = bevShop.getCurrentOrder();
                
                System.out.println("Your age is above " + bevShop.getMinAgeForAlcohol() + " and you are eligible to order alcohol");
                
                while (bevShop.isEligibleForMore()) {
                    System.out.println("Would you please add an alcohol drink");
                    System.out.println("The current order of drinks is " + currentOrder.getTotalItems());
                    System.out.println("The Total Price on the Order: " + currentOrder.calcOrderTotal());
                    
                    bevShop.processAlcoholOrder("Alcohol Drink", Size.MEDIUM);
                    System.out.println("Your current alcohol drink order is less than " + bevShop.getMaxOrderForAlcohol());
                }
                
                System.out.println("You have a maximum alcohol drinks for this order");
                
                System.out.println("Would you please add a COFFEE to your order:");
                System.out.println("Total items on your order is " + currentOrder.getTotalItems());
                System.out.println("The Total Price on the Order: " + currentOrder.calcOrderTotal());
                
                System.out.println("#------------------------------------#");
            } else {
                System.out.println("Your Age is not appropriate for alcohol drink!!");
            }
            
            System.out.print("Would you please start a new order? (yes/no): ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        System.out.println("Total amount for all Orders: " + bevShop.totalMonthlySale());
        
        scanner.close();
    }
}
