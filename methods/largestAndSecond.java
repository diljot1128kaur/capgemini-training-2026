
import java.util.Scanner;

public class largestAndSecond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        int[] ans=find(a,b,c);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    public static int[] find(int a,int b,int c){
        int small=Math.min(a,Math.min(b,c));
        int large=Math.max(a,Math.max(b,c));
        return new int[]{large,small};
    }
}
