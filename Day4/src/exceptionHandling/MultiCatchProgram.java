package exceptionHandling;

public class MultiCatchProgram {
    public static void main(String[] args) {
        try{
            String s = null;
//            System.out.println(s);
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println("Null value");
        }catch (Exception e){
            System.out.println("General Exception");
        }
    }
}
