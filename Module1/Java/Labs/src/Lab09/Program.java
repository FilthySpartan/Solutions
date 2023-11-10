package Lab09;
import java.util.Random;

public class Program {
    
    public static void main(String[] args) {
        Random rand = new Random();
        Map map = new Map(20, 20);
        Token t1 = new Token(5, 3, map);
        // Token t2 = new Token(30, 70, map);
        // Token t3 = new Token(250, 200, map);
        Token[] tokens = {t1};
        map.drawMap(tokens);

        for(int j = 0; j < 5; j++) {
            for(int i = 0; i < tokens.length; i++) {
                int dir = rand.nextInt(3);
                int dis = rand.nextInt(5);
                String moveDir = "n";
                if (dir == 0) {
                    moveDir = "north";
                } else if (dir == 1) {
                    moveDir = "south";
                } else if (dir == 2) {
                    moveDir = "east";
                } else if (dir == 3) {
                    moveDir = "west";
                }

                System.out.println(tokens[i] + " xPos: " + tokens[i].getX());
                System.out.println(tokens[i] + " yPos: " + tokens[i].getY());

                if(tokens[i].move(moveDir, dis) == false){
                     tokens[i] = null;
                    System.out.println("Token has fallen off the board");
                }

                map.drawMap(tokens);
            }
        }
    }
}
