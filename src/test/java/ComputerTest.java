import behaviours.IInput;
import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        mouse = new Mouse("Apple", "Magic Mouse", "wireless");
        computer = new Computer(8, 512, monitor, mouse);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataPrinter() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataSpeaker() {
        Speaker speaker = new Speaker(100);
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice()  {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));

    }

    @Test
    public void canRecieveInputMouse() {
        computer = new Computer(8, 512, monitor, mouse);
        assertEquals("Receiving Data : Apple Magic Mouse is sending data!", computer.receiveInputData());
    }

    @Test
    public void canGetDataStream() {
        assertEquals(null, computer.getDataStream());

    }

    @Test
    public void canOutputReceivedInputData() {
        String result = computer.outputStreamedData();
        assertEquals("Apple Magic Mouse is sending data! is now on screen", result);
    }

    @Test
    public void canOutputReceivedInputData__Speaker_Mouse() {
        Speaker speaker = new Speaker(100);
        keyboard = new Keyboard("HP", "cordless");
        computer = new Computer(8, 512, speaker, keyboard);
        String result = computer.outputStreamedData();
        assertEquals("playing: I'm a keyboard and I'm sending data!", result);


    }
}
