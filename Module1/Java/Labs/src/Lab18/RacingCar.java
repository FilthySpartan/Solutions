package Lab18;

public class RacingCar extends Car{
    public String driver;
    public int turboFactor;


    public RacingCar(int speed, String model, String driver, int turboFactor) {
        super(speed, model);
        this.driver = driver;
        this.turboFactor = turboFactor;
    }
    
    @Override
    public void accelerate(int seconds) {
        super.accelerate(seconds);
        this.speed *= this.getTurboFactor();
    }

    public String getDriver() {
        return this.driver;
    }
    public int getTurboFactor() {
        return this.turboFactor;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setTurboFactor(int turboFactor) {
        this.turboFactor = turboFactor;
    }
}
