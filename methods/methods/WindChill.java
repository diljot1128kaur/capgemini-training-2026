
import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double t = scn.nextDouble();
        double v = scn.nextDouble();
        double ans = solve(t, v);
        System.out.println(ans);
    }
    public static double solve(double t, double v) {
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        return w;
    }
}
