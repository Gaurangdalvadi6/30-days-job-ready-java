package arrays.Practice;

public class LinearSearch {
    public static int linearSearchForNumber(int[] numbers, int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchForString(String[] str,String key){
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10,12,15,19,25,36,49};
        int key = 10;
        int index = linearSearchForNumber(numbers, key);
        extracted(index);

        String[] str = {"apple","mango","banana"};
        String key2 = "orange";
        index = linearSearchForString(str, key2);
        extracted(index);
    }

    private static void extracted(int index) {
        if (index ==-1){
            System.out.println("Not found");
        }else {
            System.out.println("Key is at index : " + index);
        }
    }
}
