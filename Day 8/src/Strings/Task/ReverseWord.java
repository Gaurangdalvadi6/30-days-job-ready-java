package Strings.Task;

public class ReverseWord {
    // 1.
    public static String reverseWord(String word){
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }

    // 2.
    public static String reverseString(String word){
        String reversed = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }


    public static void main(String[] args) {
        String name = "Hello World";
        System.out.println(reverseWord(name));
        System.out.println(reverseString(name));
    }
}
