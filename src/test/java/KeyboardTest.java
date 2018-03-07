import device_management.Keyboard;
import device_management.NavigationDevice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    private Keyboard keyboard;

    @Before
    public void setUp() throws Exception {

        keyboard = new Keyboard("HP", "cordless");

    }

    @Test
    public void canGetMake() {
        assertEquals("HP", keyboard.getMake());
    }

    @Test
    public void canGetType() {
        assertEquals("cordless", keyboard.getType());
    }

    @Test
    public void canSendData() {
        assertEquals("I'm a keyboard and I'm sending data!", keyboard.sendData());
    }
}
