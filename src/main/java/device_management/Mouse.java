package device_management;

import behaviours.IInput;

public class Mouse extends NavigationDevice implements IInput {

    private String type;

    public Mouse(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }

    @Override
    public String click(String direction) {
        return getMake() + " " + getModel() + " has " + direction + " clicked" ;
    }

    @Override
    public String move() {
        return "You have moved your " + getMake() + " " + getModel();
    }

    @Override
    public String sendData() {
        return getMake() + " " + getModel() + " is sending data!";
    }

    public String getType() {
        return type;
    }
}


