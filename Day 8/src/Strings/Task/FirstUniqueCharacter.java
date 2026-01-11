package Strings.Task;

public class FirstUniqueCharacter {

    public static char unique(String str){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            System.out.println(str.indexOf(c)+" " + str.lastIndexOf(c));
            if (str.indexOf(c) == str.lastIndexOf(c)){
                return c;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        String data = "I am gaurang and I am creating websites";
        System.out.println(data.length());
        char unique = unique(data);
        System.out.println(unique);
    }
}
