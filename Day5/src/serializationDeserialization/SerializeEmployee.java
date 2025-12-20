package serializationDeserialization;

import java.io.*;

public class SerializeEmployee {
    public static void main(String[] args) {

        Employee emp = new Employee(1,"dev",27000.50);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))){
            oos.writeObject(emp);
            System.out.println("employee object serialize successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))){
            Employee employee = (Employee) ois.readObject();
            System.out.println("ID: " + employee.id);
            System.out.println("Name: " + employee.name);
            System.out.println("Salary: " + employee.salary);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
