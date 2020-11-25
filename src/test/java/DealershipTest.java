import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Dealership;
import vehicleComponents.Engine;
import vehicleComponents.Seats;
import vehicleComponents.Tyres;
import vehicles.Car;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Car car;
    Engine engine;
    Tyres tyres;
    Seats seats;
    Customer customer;

    @Before
    public void before() {
        dealership = new Dealership("CodeClan Wheels", 500.00);
        engine = new Engine("diesel");
        tyres = new Tyres(4);
        seats = new Seats(5);
        car = new Car(engine, tyres, seats, "BMW", "Big Chonker", 50.00, "Red", 0);
        customer = new Customer("Sandra", 75.00);
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Wheels", dealership.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(500.00, dealership.getTill(), 0.01);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, dealership.getStock());
    }

    @Test
    public void canBuyVehicle() {
        dealership.buyVehicle(car);
        assertEquals(1, dealership.getStock());
    }

    @Test
    public void canSellVehicle() {
        dealership.buyVehicle(car);
        dealership.sellVehicle(car, customer);

        assertEquals(500.00, dealership.getTill(),0.01);
        assertEquals(0, dealership.getStock());
    }

    @Test
    public void canRepair() {
        car.addDamage(10);
        dealership.repair(car);
        assertEquals(0, car.getDamage(), 0.01);
        assertEquals(50, car.getPrice(), 0.01);


    }

}
