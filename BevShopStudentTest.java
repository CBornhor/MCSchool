import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BevShopStudentTest {

    private BevShop bevShop;

    @BeforeEach
    public void setUp() {
        bevShop = new BevShop();
    }

    @Test
    public void testIsValidTimeValid() {
        assertTrue(bevShop.isValidTime(12));
    }

    @Test
    public void testIsValidTimeInvalid() {
        assertFalse(bevShop.isValidTime(5));
    }

    @Test
    public void testGetMaxNumOfFruits() {
        assertEquals(5, bevShop.getMaxNumOfFruits());
    }

    @Test
    public void testGetMinAgeForAlcohol() {
        assertEquals(21, bevShop.getMinAgeForAlcohol());
    }

    @Test
    public void testIsMaxFruitTrue() {
        assertTrue(bevShop.isMaxFruit(6));
    }

    @Test
    public void testIsMaxFruitFalse() {
        assertFalse(bevShop.isMaxFruit(4));
    }

    @Test
    public void testGetMaxOrderForAlcohol() {
        assertEquals(3, bevShop.getMaxOrderForAlcohol());
    }

    @Test
    public void testIsEligibleForMoreEmptyOrders() {
        assertTrue(bevShop.isEligibleForMore());
    }

    @Test
    public void testIsEligibleForMoreNotFull() {
        bevShop.startNewOrder(12, Day.MONDAY, "John", 25);
        assertTrue(bevShop.isEligibleForMore());
    }

    @Test
    public void testIsEligibleForMoreFull() {
        bevShop.startNewOrder(12, Day.MONDAY, "John", 25);
        bevShop.processAlcoholOrder("Vodka", Size.MEDIUM);
        bevShop.processAlcoholOrder("Rum", Size.SMALL);
        bevShop.processAlcoholOrder("Whiskey", Size.LARGE);
        assertFalse(bevShop.isEligibleForMore());
    }

    @Test
    public void testIsValidAgeValid() {
        assertTrue(bevShop.isValidAge(22));
    }

    @Test
    public void testIsValidAgeInvalid() {
        assertFalse(bevShop.isValidAge(18));
    }

    @Test
    public void testStartNewOrderValid() {
        bevShop.startNewOrder(12, Day.MONDAY, "John", 25);
        assertEquals(1, bevShop.totalNumOfMonthlyOrders());
    }

    @Test
    public void testStartNewOrderInvalidTime() {
        bevShop.startNewOrder(5, Day.MONDAY, "John", 25);
        assertEquals(0, bevShop.totalNumOfMonthlyOrders());
    }

    @Test
    public void testStartNewOrderInvalidAge() {
        bevShop.startNewOrder(12, Day.MONDAY, "John", 18);
        assertEquals(0, bevShop.totalNumOfMonthlyOrders());
    }

    // You can add more test cases for the remaining methods
}
