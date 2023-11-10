package Lab18;

public class Car {
        public int speed;
        public String model;

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }    

    public void getToSixty() {
        this.speed = 60;
    }

    public void accelerate(int seconds) {
        this.speed += (5 * seconds);
    }

    public String getModel() {
        return this.model;
    }
    
    public int getSpeed() {
        return this.speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
