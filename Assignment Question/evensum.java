import java.util.*;
public class evensum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int pos=1;
        while(n>0){
            int digit=n%10;
            if(pos%2==0){
                sum+=digit;
            }
            pos++;
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}