import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.Seats;
import vehicleComponents.Tyres;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    Car car;
    Engine engine;
    Tyres tyres;
    Seats seats;

    @Before
    public void before() {
        engine = new Engine("diesel");
        tyres = new Tyres(4);
        seats = new Seats(5);
        car = new Car(engine, tyres, seats, "BMW", "Big Chonker", 50.00, "Red");
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void hasSeats() {
        assertEquals(seats, car.getSeats());
    }

    @Test
    public void hasMake() {
        assertEquals("BMW", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Big Chonker", car.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", car.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(50.00, car.getPrice(), 0.01);
    }
}
