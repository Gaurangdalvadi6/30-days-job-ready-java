package OOP.abstractExample;

public class ElectricCar extends Car{
    @Override
    void fuel() {
        super.fuel();
        System.out.println("battery");
    }

    @Override
    void start() {
        System.out.println("Start using mobile");
    }
}
