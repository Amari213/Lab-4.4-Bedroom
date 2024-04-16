public class Outlet {
    private String color;
    private String type; //type

    private boolean isOn;


    public Outlet(String type, boolean isOn) {
        this.type = type;
        this.isOn = isOn;
    }

    public String getType() {
        return type;
    }

    public void setType(String color) {
        this.type = type;
    }

    public Size getType() {
        return brightness;
    }

    public void setType(Size size) {
        this.type = type;
    }

    public boolean isOn() {
        return isOn();
    }

    public void setOn(boolean on) {
        isOn = on;
    }
    @Override
    public String toString(){
        return "Outlet(" + x + ", " + y + ")";
    }

}
