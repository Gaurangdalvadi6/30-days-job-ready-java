package collectionsFramework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        userList.add(new User(1,"Gautam"));
        userList.add(new User(2,"Harsh"));
        userList.add(new User(3,"Sanjay"));

        for (User user: userList){
            System.out.println(user.getId() + " " + user.getName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id : ");
        try {
            int searchId = scanner.nextInt();
            boolean found = false;

            for (User user:userList){
                if (user.getId() == searchId){
                    System.out.println("User Found: " + user.getName());
                    found = true;
                    break;
                }
            }

            if (!found){
                System.out.println("User not found with ID: " + searchId);
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter a valid ID.");
            scanner.nextLine(); // Clear invalid input
        }
    }
}
