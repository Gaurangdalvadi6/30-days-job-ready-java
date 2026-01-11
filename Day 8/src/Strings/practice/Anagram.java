package Strings.practice;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str,String str2){
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        char[] str2CharArray = str2.toLowerCase().toCharArray();
        Arrays.sort(str2CharArray);
        return Arrays.equals(charArray,str2CharArray);
    }
    public static void main(String[] args) {
        String str = "race",str2 = "care";
        boolean anagram = isAnagram(str, str2);
        if (anagram){
            System.out.println(str +" and "+str2+" are anagram");
        }else {
            System.out.println(str +" and "+str2+" are not anagram");
        }
    }
}
