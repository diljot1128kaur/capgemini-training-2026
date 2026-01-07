
import java.util.Scanner;

public class factor {
    public static int[] find(int n){
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                
            }
        }
        int[]ans=new int[cnt];
        int idx=0;
        for(int i=0;i<=n;i++){
            if(n%i==0){
                ans[idx++]=i;
            }
        }
        return ans;
    }
    public static int sum(int[]arr){
        int s=0;
        for(int val:arr){
            s+=val;
        }
        return s;
    }
    public static long prod(int[]arr){
        long p=1;
        for(int val:arr){
            p*=val;
        }
        return p;
    }
    public static int sq(int[]arr){
        double s=0;
        for(int val:arr){
            s+=val*val;
        }
        return (int)s;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]ans=find(n);
        for(int f:ans){
            System.out.print(f+" ");
        }


        System.out.println(sum(ans));
        System.out.println(prod(ans));
        System.out.println(sq(ans));
    }
}
