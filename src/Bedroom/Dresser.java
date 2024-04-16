package OOP.Bedroom;

public class Dresser {

    private String color;
    private Size size; //length and width

    private boolean numberOfDrawers;


    public Dresser(String color, Size size, boolean isHigh) {
        this.color = color;
        this.size = size;
        this.numberOfDrawers = numberOfDrawers;
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

    public boolean isNumberOfDrawers() {
        return isNumberOfDrawers();
    }

    public void setDrawerOpen(boolean drawerOpen) {
        isDrawerOpen = drawerOpen;
    }
    @Override
    public String toString(){
        return "Dresser(" + x + ", " + y + ")";
    }