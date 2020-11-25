import org.junit.Before;
import org.junit.Test;
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

    @Before
    public void before() {
        dealership = new Dealership("CodeClan Wheels", 500.00);
        engine = new Engine("diesel");
        tyres = new Tyres(4);
        seats = new Seats(5);
        car = new Car(engine, tyres, seats, "BMW", "Big Chonker", 50.00, "Red");
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
    public void canAddStock() {
        dealership.addStock(car);
        assertEquals(1, dealership.getStock());
    }
}
