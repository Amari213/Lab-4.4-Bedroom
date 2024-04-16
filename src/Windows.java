package OOP.Bedroom;

public class Window {

    private String type; //open and close
    private Size size; //length and width

    private boolean isOpen;


    public Window(String type, Size size, boolean isopen) {
        this.type = type;
        this.size = size;
        this.isopen = isOpen;
    }

    public String getType() {
        return type;
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

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean drawerOpen) {
        isOpen = open;
    }
    @Override
    public String toString(){
        return "Window(" + x + ", " + y + ")";
    }
}

