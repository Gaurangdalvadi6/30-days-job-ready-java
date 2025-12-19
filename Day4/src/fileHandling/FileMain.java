package fileHandling;

import java.io.*;

public class FileMain {
    public static void main(String[] args) {
        File file = new File("data.txt");

        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());

//        Write Data to File using FileWriter
        try (FileWriter writer = new FileWriter("data.txt")){
            writer.write("Write through FileWriter");
            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("Error while writing in file " + e.getMessage());
        }

        System.out.println();

        //        Write Data to File using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))){
            writer.write("writing using BufferedWriter");
            System.out.println("data written successfully using BufferedWriter");
        } catch (IOException e) {
            System.out.println("Error while writing in file when use BufferedWriter" + e.getMessage());
        }

//        Append Data to File
        try(FileWriter writer = new FileWriter("data.txt",true)) {
            writer.write("\nThis data is added through append");
            System.out.println("Data updated successfully");
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }

        System.out.println();

//        Read Data from File
        try (FileReader reader = new FileReader("data.txt")){
            int ch;
            while ((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error while reading data " + e.getMessage());
        }

        System.out.println();
        System.out.println();

//        Better Way: BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading data " + e.getMessage());
        }
    }
}
