package Strings.Task;

public class StringRotation {
    public static boolean isRotation(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        String doubled = str1 + str1;
        return doubled.contains(str2);
    }

    public static void main(String[] args) {
        String str1="abc",str2="bca";
        boolean rotation = isRotation(str1, str2);
        System.out.println(rotation);
    }
}
