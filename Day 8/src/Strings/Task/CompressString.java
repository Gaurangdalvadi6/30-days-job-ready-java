package Strings.Task;

public class CompressString {
    public static String compress(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr = newStr+str.charAt(i);
            if (count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String n = "AAABBCCDD";
        String compress = compress(n);
        System.out.println(compress);
    }
}
