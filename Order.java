import java.util.ArrayList;

public class Order implements OrderInterface, Comparable<Order> {
    private static final int MIN_ORDER_NUMBER = 10000;
    private static final int MAX_ORDER_NUMBER = 90000;

    private int orderNo;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private ArrayList<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer cust) {
        this.orderNo = generateOrder();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = cust;
        this.beverages = new ArrayList<>();
    }

    public int generateOrder() {
        return MIN_ORDER_NUMBER + (int) (Math.random() * (MAX_ORDER_NUMBER - MIN_ORDER_NUMBER + 1));
    }

    public int getOrderNo() {
        return orderNo;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public Day getOrderDay() {
        return orderDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Day getDay() {
        return orderDay;
    }

    public boolean isWeekend() {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }

    public Beverage getBeverage(int itemNo) {
        if (itemNo >= 0 && itemNo < beverages.size()) {
            return beverages.get(itemNo);
        }
        return null;
    }

    public int getTotalItems() {
        return beverages.size();
    }

    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        Coffee coffee = new Coffee(bevName, size, extraShot, extraSyrup);
        beverages.add(coffee);
    }

    public void addNewBeverage(String bevName, Size size) {
        Alcohol alcohol = new Alcohol(bevName, size, isWeekend());
        beverages.add(alcohol);
    }

    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
        Smoothie smoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
        beverages.add(smoothie);
    }

    public double calcOrderTotal() {
        double total = 0;
        for (Beverage beverage : beverages) {
            total += beverage.calcPrice();
        }
        return total;
    }

    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getType() == type) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order No: ").append(orderNo)
          .append(", Time: ").append(orderTime)
          .append(", Day: ").append(orderDay)
          .append(", Customer: ").append(customer)
          .append("\nBeverages:\n");
        for (int i = 0; i < beverages.size(); i++) {
            sb.append("  ").append(i + 1).append(". ").append(beverages.get(i)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Order anotherOrder) {
        return Integer.compare(this.orderNo, anotherOrder.orderNo);
    }
    
    public int getNumOfAlcoholDrink() {
        int numOfAlcoholDrink = 0;
        for (Beverage beverage : beverages) {
            if (beverage instanceof Alcohol) {
                numOfAlcoholDrink++;
            }
        }
        return numOfAlcoholDrink;
    }
}
