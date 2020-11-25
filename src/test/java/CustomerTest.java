import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Dealership;
import vehicleComponents.Engine;
import vehicleComponents.Seats;
import vehicleComponents.Tyres;
import vehicles.Car;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {
    Customer customer;
    Engine engine;
    Tyres tyres;
    Seats seats;
    Car car;
    Dealership dealership;

    @Before
    public void before() {
        customer = new Customer("John", 100.00);
        dealership = new Dealership("CodeClan Wheels", 500.00);
        engine = new Engine("diesel");
        tyres = new Tyres(4);
        seats = new Seats(5);
        car = new Car(engine, tyres, seats, "BMW", "Big Chonker", 50.00, "Red");
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

    @Test
    public void canBuyVehicle() {
        dealership.buyVehicle(car);

        customer.buyVehicle(car);

        assertEquals(1, customer.getOwnedVehicles());
        assertEquals(50.00, customer.getMoney(), 0.01);
    }
}
