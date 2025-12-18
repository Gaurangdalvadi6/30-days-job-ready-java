package OOP.abstractExample;

public class Main {
    public static void main(String[] args) {
        Car c = new NormalCar();
        c.start();
        c.fuel();
        Car electricCar = new ElectricCar();
        electricCar.start();
        electricCar.fuel();
    }
}
