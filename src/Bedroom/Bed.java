package OOP.Bedroom;

public class Bed {

    private String size; //queen, King, double
    private int pillow;
    private boolean hasBlanket; //


    public Bed(String size, int pillow, boolean hasBlanket) {
        this.size = size;
        this.pillow = pillow;
        this.hasBlanket = hasBlanket;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPillow() {
        return pillow;
    }

    public void setPillow(int pillow) {
        this.pillow = pillow;
    }

    public boolean isHasBlanket() {
        return hasBlanket;
    }

    public void setHasBlanket(boolean hasBlanket) {
        this.hasBlanket = hasBlanket;
    }


    public void make(){
        System.out.println("From Bed class:  I make my bed every morning when I wake up.");
    }

    //private String size; //queen, King, double
    //    private int pillow;
    //    private boolean hasBlanket; //
    public String toString(){
        String result = "";
        if(hasBlanket){
            result = "This Bed has a blanket.";
        }
        else result = "This Bed does not have a blanet.";
        return String.format("Bed: %s\nNumber of Pillows: %d\nBlanket %s\n",size,pillow,hasBlanket );
    }
}
