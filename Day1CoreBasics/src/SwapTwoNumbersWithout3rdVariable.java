public class SwapTwoNumbersWithout3rdVariable {
    public static void main(String[] args) {
        int a = 9, b = 5;
        System.out.printf("Before swap value a = %d and b = %d",a,b);
        System.out.println();
        a = a+b; // 9+5 = 14
        b = a-b; // 14-5 = 9
        a = a-b; // 14-9 = 5

        System.out.printf("After swap value a = %d and b = %d",a,b);
    }
}
