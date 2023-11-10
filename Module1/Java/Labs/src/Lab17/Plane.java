package Lab17;

public class Plane extends Token {
    public static int maxSpeed = 360;
    private int altitude = 0;

    public Plane(String name, int x, int y, Map map) {
        super(name, x, y, map);
        
    }
    
    public int getAltitude() {
        return this.altitude;
    }

    public void climb(int howHigh) {
        this.altitude += howHigh;
        System.out.println("New altitude is: " + this.getAltitude());
    }

    public void land() {
        this.altitude = 0;
        System.out.println("Plane has landed safely");
    }

}
