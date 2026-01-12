package arrays.Practice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class ArrayCC {
    public static double average(int[] num){
        int sum =0;
        for (int i = 0; i < num.length; i++) {
            sum = sum+num[i];
        }
        return (double) sum / num.length;
    }

    public static void update(int[] marks){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int[] marks = new int[50];

        Scanner sc = new Scanner(System.in);

//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//        marks[2] = sc.nextInt();

//        System.out.println(marks[0] +" " + marks[1]+" " + marks[2]);

        int[] num = {10,25,39};
        System.out.println(average(num));

        update(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();


//        int[] numbers = {1,2,3};
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }
    }
}
