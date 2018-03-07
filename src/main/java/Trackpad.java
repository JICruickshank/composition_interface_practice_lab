import behaviours.IInput;
import device_management.NavigationDevice;

public class Trackpad extends NavigationDevice implements IInput {
    public Trackpad(String make, String model) {
        super(make, model);
    }

    @Override
    public String sendData() {
        return getMake() + " " + getModel() + " is sending your data!";
    }

    @Override
    public String click(String direction) {
        return "Your trackpad has " + direction + " clicked";
    }

    @Override
    public String move() {
        return "You have moved your trackpad";
    }
}
