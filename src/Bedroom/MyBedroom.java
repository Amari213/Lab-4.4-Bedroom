package OOP.Bedroom;

public class MyBedroom {
    public static void main(String[] args) {


        //public Bedroom(Wall w1, Wall w2, Wall w3, Wall w4, Floor floor, Ceiling ceiling,
        // Windows window, Door door, Ventilation airVent,
        // Light light, Outlet outlet,  Bed bed, Desk desk, Dresser dresser, Rug rug )
        //public Floor(boolean hasCarpet, Size size) {

        //public Bed(String size, int pillow, boolean hasBlanket) {
        Bedroom samater = new Bedroom(new Wall(), new Wall(), new Wall(), new Wall(),
                new Floor(true,new Size(20,20)), new Ceiling("Blue", new Size(20,20),true),new Windows(), new Door(), new Ventilation()
                , new Light(), new Outlet(), new Bed("King",5, true), new Desk(), new Dresser(), new Rug() );
        Wall w1 = new Wall();
        Wall w2 = new Wall();
        Wall w3 = new Wall();
        Wall w4 = new Wall();
        Size floorSize = new Size(25,25); //floor
        Size ceilingSize = new Size(45,45);//ceiling
        Windows window = new Windows();
        Floor floor = new Floor(true, floorSize);
        Ceiling ceiling = new Ceiling("Grey",ceilingSize,true);

        Door door = new Door();
        Ventilation airVent = new Ventilation();
        Light light = new Light();
        Outlet outlet = new Outlet();
        Bed bed = new Bed("Queen",6, true);
        Desk desk = new Desk();
        Dresser dresser = new Dresser();
        Rug rug = new Rug();
        Bedroom ayanna = new Bedroom(w1,w2,w3,w4, floor, ceiling, window, door, airVent, light, outlet, bed, desk, dresser,rug );

        System.out.println("We built " + Bedroom.numberOfBedroom + " bedrooms");

        ayanna.make();
        ayanna.makeBed();
        bed.make();

    }
}

