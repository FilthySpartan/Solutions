package Lab09;

public class Token {
    int x;
    int y;
    Map map;

    public Token(int x, int y, Map map) {
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
                this.setY(this.y + dis);
                onBoard = true;
            } 
        } else if (dir.equals("south") || dir.equals("s")) {
            if (map.getySize() < (this.getY() - dis)){
                this.setY(this.y - dis); 
                onBoard = true;
            }
        } else if (dir.equals("west") || dir.equals("w")) {
            if (map.getxSize() > (this.getX() - dis)){
                this.setX(this.x - dis);  
                onBoard = true;
            }
        } else if (dir.equals("east") || dir.equals("e")) {
            if (map.getxSize() < (this.getX() + dis)) {             
                this.setX(this.x + dis);this.x += dis; 
                onBoard = true;
            }
        }

        if(!onBoard){
            System.out.println("Token has fallen off the board");
        }

        return onBoard;
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
