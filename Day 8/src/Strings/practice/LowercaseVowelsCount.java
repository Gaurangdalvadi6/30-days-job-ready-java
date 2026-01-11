package Strings.practice;

public class LowercaseVowelsCount {
    public static int countVowel(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String name = "devanshu";
        System.out.println(countVowel(name));
    }
}
