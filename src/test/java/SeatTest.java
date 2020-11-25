import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Seats;

import static org.junit.Assert.assertEquals;

public class SeatTest {
    Seats seats;

    @Before
    public void before() {
        seats = new Seats(4);
    }

    @Test
    public void hasSeats() {
        assertEquals(4, seats.getNumberOfSeats());
    }
}
