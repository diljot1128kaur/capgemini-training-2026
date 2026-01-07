
import java.util.Scanner;

public class sumFormulas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n<=0){
            System.out.println("Not a natural number");
            return;
        }

        int r1=rec(n);
        int r2=sum(n);
        System.out.println("rec "+r1); 
        System.out.println("sum "+r2);
    }
    public static int sum(int n){
        int sum=n*(n+1)/2;
        return sum;
    }
    public static int rec(int n){
        if(n==1){
            return 1;
        }
        return n+rec(n-1);
    }
}
