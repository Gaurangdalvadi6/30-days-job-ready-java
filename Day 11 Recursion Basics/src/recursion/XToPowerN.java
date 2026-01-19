package recursion;

public class XToPowerN {
    public static int xToPowerN(int x,int n){
        if (n==0){
            return 1;
        }

        return x*xToPowerN(x,n-1);
    }

    public static int optimizePower(int x,int n){
        if (n==0){
            return 1;
        }

        int halfPower = optimizePower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n%2 != 0){
            halfPowerSq = x* halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
//        int powerN = xToPowerN(x, n);
//        System.out.println(powerN);

        int optimizedPower = optimizePower(x, n);
        System.out.println(optimizedPower);
    }
}
