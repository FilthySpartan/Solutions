package Lab17;
import java.util.Random;

public class Program {
    
    public static void main(String[] args) {
        String[][] layout = {{"-----------------"},
                            {"|~~~~~~~~~~~~~~~|"},
                            {"|~~~++++++++~~~~|"},
                            {"|~~~++++++~~~~~~|"},
                            {"|~~~+++++++++~~~|"},
                            {"|~~~~+++++++~~~~|"},
                            {"|~~~~~~~~~~~~~~~|"},
                            {"-----------------"}};

        Random rand = new Random();
        Map map = new Map(1000, 1000, layout);       
        Plane p1 = new Plane("p1", 150, 150, map);
        Plane p2 = new Plane("p2", 700, 300, map);
        Submarine s1 = new Submarine("s1", 250, 200, map);
        Submarine s2 = new Submarine("s2", 650, 400, map);
        Plane[] planes = {p1, p2};
        Submarine[] submarines = {s1, s2};

        for(int j = 0; j < 5; j++) {
            for(int i = 0; i < planes.length; i++) {
                if(planes[i].getAltitude() >= 5000) {
                  planes[i].land();
                } 

                int dir = rand.nextInt(4);  
                int dis = rand.nextInt(5);
                int height = rand.nextInt(100, 1000);
                String moveDir = "n";
                planes[i].climb(height);

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
            }

            for(int i = 0; i < submarines.length; i++) {
                if(submarines[i].getDepth() <= 1000) {
                    submarines[i].surface();                    
                }
                int dir = rand.nextInt(4);
                int dis = rand.nextInt(5);
                int depth = rand.nextInt(500);
                String moveDir = "n";
                submarines[i].dive(depth);

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
            }
        }
    }
}
