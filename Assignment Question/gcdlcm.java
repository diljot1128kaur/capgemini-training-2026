import java.util.*;
public class gcdlcm{
    public static int gcd(int m,int n){
        if(n==0) return m;
        return gcd(n,m%n);
    }
    public static int lcm(int m,int n){
        return (m*n)/gcd(m,n);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(gcd(m,n));
        System.out.print(lcm(m,n));
    }
}