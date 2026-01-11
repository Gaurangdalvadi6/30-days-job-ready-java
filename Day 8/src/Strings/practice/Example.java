package Strings.practice;

import java.util.Arrays;

public class Example {
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static double getShortestPath(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //South
            if (dir == 'S'){
                y--;
            }
            //North
            else if (dir == 'N') {
                y++;
            }
            //West
            else if (dir == 'W') {
                x--;
            }
            //East
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return Math.sqrt(X2+Y2);
    }

    public static String subString(String str,int si,int ei){
        String subString = "";
        for (int i = si; i < ei; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }

    public static void main(String[] args) {
//        String fullName = "Gaurang Dalvadi";
//        System.out.println(fullName.length());

        String firstName = "Gaurang";
        String lastName = "Dalvadi";
        // concatenation
        String fullName = firstName  + " " + lastName;
//        System.out.println(fullName);

        // charAt method
//        System.out.println(fullName.charAt(0));
//        printLetters(fullName);

        String path = "WNEENESENNN";
//        System.out.println(getShortestPath(path));

        String str = "HelloWorld";
//        System.out.println(str.substring(0,6));
//        String subString = subString(str, 0, 6);
//        System.out.println(subString);

        String[] fruits = {"apple","mango","banana"};
            String largest = fruits[0];
            String smallest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
            if (smallest.compareTo(fruits[i])>0){
                smallest=fruits[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);

        str = "HelloWorld";
        char[] charArray = str.toCharArray();
        Character[] characters = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            characters[i] = charArray[i];
        }
        String string = Arrays.toString(characters);
        System.out.println(string);

        // back to Original
        char[] chars = new char[characters.length];
        for (int i = 0; i < characters.length; i++) {
            chars[i] = characters[i];
        }

        String string1 = new String(chars);
        System.out.println(string1);

//        String str1 = "HelloWorld";
//        char[] charArray1 = str1.toCharArray();
//        String string3 = Arrays.toString(charArray1);
//        System.out.println(string3);
//
//        String string2 = new String(charArray1);
//        System.out.println(string2);

//        String str1 = "ApnaCollege".replaceAll("l","");
//        System.out.println(str1);
    }
}
