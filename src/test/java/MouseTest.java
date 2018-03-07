import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    private Mouse mouse;

    @Before
    public void setUp() throws Exception {
        mouse = new Mouse("Apple", "Magic Mouse", "wireless");
    }

    @Test
    public void canGetMake() {
        assertEquals("Apple", mouse.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Magic Mouse", mouse.getModel());
    }

    @Test
    public void testMouseCanLeftClick() {
        assertEquals("Apple Magic Mouse has left clicked", mouse.click("left"));
    }

    @Test
    public void testMouseCanRightClick() {
        assertEquals("Apple Magic Mouse has right clicked", mouse.click("right"));
    }

    @Test
    public void testMouseCanMove() {
        assertEquals("You have moved your Apple Magic Mouse", mouse.move());
    }

    @Test
    public void testCanGetType() {
        assertEquals("wireless", mouse.getType());
    }

    @Test
    public void testMouseCanSendData() {
        assertEquals("Apple Magic Mouse is sending data!", mouse.sendData());
    }
}
