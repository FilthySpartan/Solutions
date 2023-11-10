package Lab17;
import java.util.Random;

public class Program {
    
    public static void main(String[] args) {
        Random rand = new Random();
        Map map = new Map(1000, 1000);
        
        Plane p1 = new Plane("p1", 150, 150, map);
        Submarine s1 = new Submarine("s1", 250, 200, map);
      

        p1.printDetails();
        p1.move("NORTH", Plane.maxSpeed);
        p1.climb(200);
        p1.printDetails();
        p1.land();
        
        s1.printDetails();
        s1.move("SOUTH", Submarine.maxSpeed);
        s1.printDetails();
        s1.dive(100);
        s1.surface();
        Plane[] planes = {p1};
        Submarine[] submarines = {s1};

        for(int j = 0; j < 5; j++) {
            for(int i = 0; i < planes.length; i++) {
                int dir = rand.nextInt(4);
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

                planes[i].printDetails();

                if(planes[i].move(moveDir, dis) == false){
                    //tokens[i] = null;
                    System.out.println("Token has fallen off the board");
                }

                //map.drawMap(tokens);
            }

            for(int i = 0; i < submarines.length; i++) {
                int dir = rand.nextInt(4);
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

                submarines[i].printDetails();

                if(submarines[i].move(moveDir, dis) == false){
                    //tokens[i] = null;
                    System.out.println("Token has fallen off the board");
                }

                //map.drawMap(tokens);
            }
        }
    }
}
