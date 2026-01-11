package Strings.practice;

public class CheckPalindrome {
    public static boolean isPalindrome(String str){
        for (int i = 0; i < (str .length()/2); i++) {
            int n = str .length();
            if (str .charAt(i) != str .charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str){
        String string = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(string);
    }

    public static void main(String[] args) {
        String car = "raceCar";
        boolean palindrome = isPalindrome(car);
//        System.out.println(palindrome);
        boolean palindrome2 = isPalindrome2(car);
        System.out.println(palindrome2);

    }
}
