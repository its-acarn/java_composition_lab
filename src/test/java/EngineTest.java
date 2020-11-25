import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void before() {
        engine = new Engine("Big Yin");
    }

    @Test
    public void hasType() {
        assertEquals("Big Yin", engine.getEngineType());
    }
}

