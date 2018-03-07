import device_management.NavigationDevice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrackpadTest {

    private Trackpad trackpad;

    @Before
    public void setUp() throws Exception {
        trackpad = new Trackpad("Cirque", "Easy Cat");
    }

    @Test
    public void testCanGetMake() {
        assertEquals("Cirque", trackpad.getMake());
    }

    @Test
    public void testCanGetModel() {
        assertEquals("Easy Cat", trackpad.getModel());
    }

    @Test
    public void testCanClick() {
        assertEquals("Your trackpad has left clicked", trackpad.click("left"));
    }

    @Test
    public void testCanMove() {
        assertEquals("You have moved your trackpad", trackpad.move());
    }

    @Test
    public void testCanSendData() {
        assertEquals("Cirque Easy Cat is sending your data!", trackpad.sendData());
    }
}
