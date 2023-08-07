import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderStudentTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        Customer customer = new Customer("John", 25);
        order = new Order(10, Day.SATURDAY, customer);
    }

    @Test
    public void testGetOrderNo() {
        assertEquals(0, order.getOrderNo()); // Replace with the actual order number
    }

    @Test
    public void testGetOrderTime() {
        assertEquals(10, order.getOrderTime());
    }

    @Test
    public void testGetOrderDay() {
        assertEquals(Day.SATURDAY, order.getOrderDay());
    }

    @Test
    public void testGetCustomer() {
        Customer customer = order.getCustomer();
        assertEquals("John", customer.getName());
        assertEquals(25, customer.getAge());
    }

    @Test
    public void testIsWeekend() {
        assertTrue(order.isWeekend());
    }

    @Test
    public void testAddNewBeverageCoffee() {
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        assertEquals(1, order.getTotalItems());
    }

    @Test
    public void testAddNewBeverageAlcohol() {
        order.addNewBeverage("Vodka", Size.LARGE);
        assertEquals(1, order.getTotalItems());
    }

    @Test
    public void testAddNewBeverageSmoothie() {
        order.addNewBeverage("Berry Blast", Size.SMALL, 3, true);
        assertEquals(1, order.getTotalItems());
    }

    @Test
    public void testCalcOrderTotal() {
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        order.addNewBeverage("Vodka", Size.LARGE);
        order.addNewBeverage("Berry Blast", Size.SMALL, 3, true);
        assertEquals(10.0, order.calcOrderTotal());
    }

    @Test
    public void testFindNumOfBeveType() {
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        order.addNewBeverage("Vodka", Size.LARGE);
        order.addNewBeverage("Berry Blast", Size.SMALL, 3, true);
        assertEquals(1, order.findNumOfBeveType(Type.COFFEE));
        assertEquals(1, order.findNumOfBeveType(Type.ALCOHOL));
        assertEquals(1, order.findNumOfBeveType(Type.SMOOTHIE));
    }

    @Test
    public void testGetNumOfAlcoholDrink() {
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        order.addNewBeverage("Vodka", Size.LARGE);
        order.addNewBeverage("Berry Blast", Size.SMALL, 3, true);
        assertEquals(1, order.getNumOfAlcoholDrink());
    }

    @Test
    public void testCompareTo() {
        Order anotherOrder = new Order(5, Day.SUNDAY, new Customer("Alice", 30));
        assertTrue(order.compareTo(anotherOrder) > 0);
    }
}
