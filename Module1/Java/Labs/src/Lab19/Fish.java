package Lab19;

public class Fish extends Animal implements Consumable, Insurable{
    public String name;


    public Fish(String name){
        this.name = name;

    }

    
    public String describeTaste() {
        return getName() + ": " + "Salty";
    }
    
    public String isMainCourseDish() {
        return getName() + ": " + true;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getPremium() {
        String premium = "£25.00";
        return premium;
    }

    @Override
    public String expires() {
        String expDate = "10/10/2024";
        return expDate;
    }
}
