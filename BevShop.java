import java.util.ArrayList;

public class BevShop implements BevShopInterface {
    private ArrayList<Order> orders;
    private static final int MIN_AGE_FOR_ALCOHOL = 21;
    private static final int MAX_NUM_OF_FRUITS = 5;
    private static final int MAX_ORDER_FOR_ALCOHOL = 3;

    public BevShop() {
        orders = new ArrayList<>();
    }

    @Override
    public boolean isValidTime(int time) {
        return time >= 8 && time <= 23;
    }

    @Override
    public int getMaxNumOfFruits() {
        return MAX_NUM_OF_FRUITS;
    }

    @Override
    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public boolean isMaxFruit(int numOfFruits) {
        return numOfFruits > MAX_NUM_OF_FRUITS;
    }

    @Override
    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }

    @Override
    public boolean isEligibleForMore() {
        if (!orders.isEmpty()) {
            int numOfAlcoholDrinks = orders.get(orders.size() - 1).getNumOfAlcoholDrink();
            return numOfAlcoholDrinks < MAX_ORDER_FOR_ALCOHOL;
        }
        return true;
    }

    @Override
    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public void startNewOrder(int time, Day day, String customerName, int customerAge) {
        if (isValidTime(time) && customerAge >= getMinAgeForAlcohol()) {
            Customer customer = new Customer(customerName, customerAge);
            Order order = new Order(time, day, customer);
            orders.add(order);
        }
    }

    @Override
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        if (!orders.isEmpty()) {
            orders.get(orders.size() - 1).addNewBeverage(bevName, size, extraShot, extraSyrup);
        }
    }

    @Override
    public void processAlcoholOrder(String bevName, Size size) {
        if (!orders.isEmpty()) {
            orders.get(orders.size() - 1).addNewBeverage(bevName, size);
        }
    }

    @Override
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        if (!orders.isEmpty()) {
            orders.get(orders.size() - 1).addNewBeverage(bevName, size, numOfFruits, addProtein);
        }
    }

    @Override
    public int findOrder(int orderNo) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNo() == orderNo) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public double totalOrderPrice(int orderNo) {
        int index = findOrder(orderNo);
        if (index != -1) {
            return orders.get(index).calcOrderTotal();
        }
        return 0.0;
    }

    @Override
    public double totalMonthlySale() {
        double totalSale = 0;
        for (Order order : orders) {
            totalSale += order.calcOrderTotal();
        }
        return totalSale;
    }

    @Override
    public int totalNumOfMonthlyOrders() {
        return orders.size();
    }
    @Override
    public int getNumOfAlcoholDrink() {
        if (!orders.isEmpty()) {
            return orders.get(orders.size() - 1).getNumOfAlcoholDrink();
        }
        return 0;
    }

    @Override
    public Order getCurrentOrder() {
        if (!orders.isEmpty()) {
            return orders.get(orders.size() - 1);
        }
        return null;
    }

    @Override
    public Order getOrderAtIndex(int index) {
        if (index >= 0 && index < orders.size()) {
            return orders.get(index);
        }
        return null;
    }

    @Override
    public void sortOrders() {
        // Implement sorting algorithm (e.g., Selection Sort) for orders
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Order order : orders) {
            sb.append(order).append("\n");
        }
        sb.append("Total Monthly Sale: ").append(totalMonthlySale());
        return sb.toString();
    }
}
