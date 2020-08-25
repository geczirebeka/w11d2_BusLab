import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person passengers;

    @Before
    public void before() {
        bus = new Bus("Waverly", 50);
        passengers = new Person();
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

}
