import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busstop;
    private Person person;

    @Before
    public void before() {
        busstop = new BusStop("Princess Street");
        person = new Person();
    }

    @Test
    public void canAddPersonToQueue() {
        busstop.addPerson(person);
        assertEquals(1, busstop.queueCount());
    }
}
