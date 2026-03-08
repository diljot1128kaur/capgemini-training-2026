import java.util.*;
public class Ques15 {
    public static boolean checkPalindrome(int n){
        int rev=0;
        int num=n;
        while(n!=0){
            rev=rev*10+ n%10;
            n/=10;
        }
        return num==rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int i=num1;i<=num2;i++){
            if(checkPalindrome(i)) System.out.print(i+" ");
        }
        sc.close();
    }
}
