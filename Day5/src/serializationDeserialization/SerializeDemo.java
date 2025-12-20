package serializationDeserialization;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {

        //Serialize Object (Write to File)
        Student student = new Student(1,"Sunil","sunil@84654654654");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))){
            oos.writeObject(student);
            System.out.println("Object SERIALIZED");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Deserialize Object (Read from File)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))){
            Student s = (Student) ois.readObject();
            System.out.println(s.id);
            System.out.println(s.name);
            System.out.println(s.password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
