package recursion;

public class TilingProblem {

    public static int tilingProblem(int n){
        if (n==0 || n==1){
            return 1;
        }

        // vertical choice
//        int fnm1 = tilingProblem(n-1);
//
//        // horizontal choice
//        int fnm2 = tilingProblem(n-2);
//
//        int totalWay = fnm1+fnm2;
//        return totalWay;

        return tilingProblem(n-1)+tilingProblem(n-2);
    }

    public static void main(String[] args) {
        int tilingProblem = tilingProblem(4);
        System.out.println(tilingProblem);
    }
}
