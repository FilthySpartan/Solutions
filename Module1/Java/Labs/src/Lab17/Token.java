package Lab17;

public class Token {
    String name;
    int x;
    int y;
    Map map;
    

    public Token(String name, int x, int y, Map map) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.map = map;
    }

    /**
     * moves the token on the map based of dir and dis
     * @param dir
     * @param dis
     * @return
     */
    public boolean move(String dir, int dis) {
        boolean onBoard = false;
        dir = dir.toLowerCase();

        if (dir.equals("north") || dir.equals("n")) {
            if (map.getySize() > (this.getY() + dis)){
                this.setY(this.getY() + dis);
                onBoard = true;
            } 
        } else if (dir.equals("south") || dir.equals("s")) {
            if (0 < (this.getY() - dis)){
                this.setY(this.getY() - dis); 
                onBoard = true;
            }
        } else if (dir.equals("west") || dir.equals("w")) {
            if (0 < (this.getX() - dis)){
                this.setX(this.getX() - dis);  
                onBoard = true;
            }
        } else if (dir.equals("east") || dir.equals("e")) {
            if (map.getxSize() > (this.getX() + dis)) {             
                this.setX(this.getX() + dis); 
                onBoard = true;
            }
        }

        return onBoard;
    }

    public void printDetails() {
        System.out.println(this.name + " Xpos: " + this.getX() + ", Ypos: " + this.getY());
    }

    public String getName() {
        return this.name;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public Map getMap() {
        return this.map;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
