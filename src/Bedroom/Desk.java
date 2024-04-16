package OOP.Bedroom;

public class Desk {

    private String color;
    private Size size; //length and width

    private boolean isDrawerOpen;


    public Desk(String color, Size size, boolean isHigh) {
        this.color = color;
        this.size = size;
        this.isHigh = isDrawerOpen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isDrawerOpen() {
        return isDrawerOpen;
    }

    public void setDrawerOpen(boolean drawerOpen) {
        isDrawerOpen = drawerOpen;
    }
    @Override
    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }
}

