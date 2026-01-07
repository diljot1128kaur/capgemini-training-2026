
import java.util.Scanner;

public class numberOfHandShake {
    public static int solve(int n) {
        return n * (n - 1) / 2;
    }   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = solve(n);
        System.out.println(ans);
    }
}
