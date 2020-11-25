import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Tyres;

import static org.junit.Assert.assertEquals;

public class TyresTest {
    Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres(4);
    }

    @Test
    public void hasSeats() {
        assertEquals(4, tyres.getNumberOfTyres());
    }
}
