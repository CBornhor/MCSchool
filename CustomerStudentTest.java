import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerStudentTest {

    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("John", 25);
    }

    @Test
    public void testGetAge() {
        assertEquals(25, customer.getAge());
    }

    @Test
    public void testSetAge() {
        customer.setAge(30);
        assertEquals(30, customer.getAge());
    }

    @Test
    public void testGetName() {
        assertEquals("John", customer.getName());
    }

    @Test
    public void testSetName() {
        customer.setName("Alice");
        assertEquals("Alice", customer.getName());
    }

    @Test
    public void testToString() {
        String expected = "Name: John, Age: 25";
        assertEquals(expected, customer.toString());
    }

    @Test
    public void testCopyConstructor() {
        Customer copy = new Customer(customer);
        assertEquals(customer.getName(), copy.getName());
        assertEquals(customer.getAge(), copy.getAge());
    }
}
