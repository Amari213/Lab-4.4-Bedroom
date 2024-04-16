package OOP.Bedroom;

public class Dresser {

    private String color;
    private int brightness; //min to max

    private boolean isOn;


    public Light(String color, int brightness, boolean isOn) {
        this.color = color;
        this.Brightness = brightness;
        this.isOn = isOn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getBrightness() {
        return brightness;
    }

    public void setBrightness(Size size) {
        this.brightness = brightness;
    }

    public boolean isOn() {
        return isOn();
    }

    public void setOn(boolean drawerOpen) {
        isOn = on;
    }
    @Override
    public String toString(){
        return "Light(" + x + ", " + y + ")";
    }
