package device_management;

public abstract class NavigationDevice {

    private String make;
    private String model;

    public NavigationDevice(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract String click(String direction);

    public abstract String move();

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
