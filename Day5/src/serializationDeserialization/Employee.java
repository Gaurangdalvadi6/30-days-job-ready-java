package serializationDeserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    transient double salary;
    double basicPay;

    public Employee(int id, String name, double basicPay) {
        this.id = id;
        this.name = name;
        this.basicPay = basicPay;
        this.salary = calculateSalary();
    }

    double calculateSalary(){
        return basicPay+(basicPay*0.2);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.salary =calculateSalary();
    }
}
