package Lab19;


public abstract class Bird extends Animal implements Consumable{
    public String name;  

    public Bird(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }

    public String describeTaste() {
        return getName() + ": " + "Delicate";
    }
    
    public String isMainCourseDish() {
        return getName() + ": " + true;
    }
}
