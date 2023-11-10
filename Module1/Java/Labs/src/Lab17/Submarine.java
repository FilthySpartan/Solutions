package Lab17;

public class Submarine extends Token{
    public static int maxSpeed = 15;
    private int depth = 0;

    public Submarine(String name, int x, int y, Map map) {
        super(name, x, y, map);
        
    }
    
    public int getDepth() {
        return this.depth;
    }

    public void dive(int howDeep) {
        this.depth += howDeep;
        System.out.println("New depth is: " + this.getDepth());
    }

    public void surface() {
        this.depth = 0;
        System.out.println(this.name + " has breached the surface");
    }

}
