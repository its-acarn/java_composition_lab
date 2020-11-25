import org.junit.Before;
import org.junit.Test;
import people.Customer;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void before() {
        customer = new Customer("John", 100.00);
    }

    @Test
    public void canGetName() {
        assertEquals("John", customer.getName());
    }

    @Test
    public void canGetMoney() {
        assertEquals(100.00, customer.getMoney(), 0.01);
    }

    @Test
    public void ownedVehiclesStartsEmpty() {
        assertEquals(0, customer.getOwnedVehicles());
    }
}
