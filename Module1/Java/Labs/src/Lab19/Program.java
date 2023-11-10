package Lab19;

public class Program {
     enum AnimalType {
            Fish,          
            Amphibian,         
            Reptile,         
            Mammal,            
            Bird,           
            Invertebrate      
    }

    public static void main (String[] args) {
        Duck d1 = new Duck("Quackers");
        Penguin p1 = new Penguin("Flappers");
        Fish f1 = new Fish("Dave");
 
        Animal[] animals = {d1, p1, f1};

        for (Animal a : animals) {
            if (a instanceof Consumable) {
                System.out.println(((Consumable)a).describeTaste());
                System.out.println(((Consumable)a).isMainCourseDish());
            }

        }

        for (Animal a : animals) {
            if (a instanceof Insurable) {
                System.out.println(((Insurable)a).getPremium());
                System.out.println(((Insurable)a).expires());
            }

        }

    }
}
