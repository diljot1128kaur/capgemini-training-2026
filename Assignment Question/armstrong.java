import java.util.*;
public class armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int originalnum=num;
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d*d*d;
            num/=10;
        }
        if(sum==originalnum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
        sc.close();
    }
}