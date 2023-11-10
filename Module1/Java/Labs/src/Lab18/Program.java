package Lab18;

public class Program {
    public static void main(String[] args) {
        Car c1 = new Car(0, "Ford");
        Car c2 = new Car(0, "VW");
        RacingCar rc1 = new RacingCar(0, "Lamborghini", "Jim Fastnuts", 3);
        RacingCar rc2  = new RacingCar(0, "Dodge", "David Grease", 2);

        Car[] cars = {c1, c2, rc1, rc2};    
        
        processCars(cars);
    
    }  

    public  static void processCars(Car[] cars) {
        for (Car car : cars) {
            car.getToSixty();
            car.accelerate(2);
            System.out.println(car.getModel());
            System.out.println(car.getSpeed());
            if (car instanceof RacingCar) {
               System.out.println(((RacingCar)car).getDriver());
            }
        }
    }
}
