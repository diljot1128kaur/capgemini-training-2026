import java.util.*;
public class primenumberrange{
    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}