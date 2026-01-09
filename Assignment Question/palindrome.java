import java.util.*;
public class palindrome{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int originalnum=num;
       int r=0;
       while(num>0){
        int digit=num%10;
        r=r*10+digit;
        num/=10;
        }
        if(r==originalnum){
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("no palindrome");
        } 
        sc.close();
       
    }
}