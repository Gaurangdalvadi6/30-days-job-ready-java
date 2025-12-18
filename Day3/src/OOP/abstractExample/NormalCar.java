package OOP.abstractExample;

public class NormalCar extends Car{

    @Override
    void fuel() {
        super.fuel();
        System.out.println("petrol and diesel");
    }

    @Override
    void start() {
        System.out.println("Start using key");
    }
}
