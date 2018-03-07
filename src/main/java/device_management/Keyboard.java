package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

    private String type;
    private String make;

    public Keyboard(String make, String type) {
        this.type = type;
        this.make = make;
    }

    @Override
    public String sendData() {
        return "I'm a keyboard and I'm sending data!";
    }

    public String getMake() {
        return make;
    }

    public String getType() {
        return type;
    }
}
