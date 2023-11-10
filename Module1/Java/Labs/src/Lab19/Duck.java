package Lab19;

import Lab19.Program.AnimalType;

public class Duck extends Bird implements Insurable{

    public Duck(String name) {
        super(name);
        this.animalType = AnimalType.Bird;

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
