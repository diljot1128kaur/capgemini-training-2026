
import java.util.Scanner;

public class remAndQuo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int div=scn.nextInt();
        int[] ans=solve(n,div);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    public static int[] solve(int n,int div){
        int quo=n/div;
        int rem=n%div;
        return new int[]{quo,rem};
    }
}
