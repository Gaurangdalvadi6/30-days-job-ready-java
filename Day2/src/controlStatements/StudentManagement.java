package controlStatements;

import java.util.Scanner;

public class StudentManagement {
    static int[] ids = new int[5];
    static String[] names = new String[5];
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choices;

        while (true){
            System.out.println("-----Welcome to student management system");
            System.out.println("1. Add student");
            System.out.println("2. view students");
            System.out.println("3. search student");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            System.out.println("Enter choice : ");

            choices = scanner.nextInt();

            switch (choices){
                case 1:
                    addstudent(scanner);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.println("Enter student id : ");
        int deleteId = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (ids[i] == deleteId){
                for (int j = i; j < count-1 ; j++) {
                    ids[j] = ids[j+1];
                    names[j] = names[j+1];
                }
                count--;
                System.out.println("Student deleted");
                return;
            }
        }
        System.out.println("Student not found with id : " + deleteId);
    }

    private static void searchStudent(Scanner scanner) {
        System.out.println("Enter student id to search : ");
        int searchId = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (ids[i]==searchId){
                System.out.println("Student found: " + names[i]);
                return;
            }
        }
        System.out.println("Student not found with id : " + searchId);
    }

    private static void viewStudents() {
        if (count == 0){
            System.out.println("No student found");
            return;
        }

        System.out.println("\nID\tName");
        for (int i = 0; i < count; i++) {
            System.out.println(ids[i] + "\t" + names[i]);
        }
    }

    private static void addstudent(Scanner scanner) {
        if (count == ids.length){
            System.out.println("Student list is full");
            return;
        }

        System.out.println("Enter id: ");
        ids[count] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name : ");
        names[count] = scanner.nextLine();

        count++;
        System.out.println("Student added successfully");
    }



}
