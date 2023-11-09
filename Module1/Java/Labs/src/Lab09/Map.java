package Lab09;

public class Map {
    int xSize;
    int ySize;

    public Map(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
    }

    public void drawMap(Token[] tokens) {
        String c = "~~~";
        for (int y = 0; y < this.getySize(); y++) {
            for (int x = 0; x < this.getxSize(); x++) {
                for (Token token : tokens) {
                    if(x == token.getX() && y == token.getY()) {
                        c = "~T~";
                    } else {
                        c = "~~~";
                    }                                   
                }      
                System.out.print(c);   
            }
            System.out.println("\n");
        }
    }

    public int getxSize() {
        return this.xSize;
    }

    public int getySize() {
        return this.ySize;
    }
}
