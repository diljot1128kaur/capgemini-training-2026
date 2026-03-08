import java.util.*;
public class Ques7 {
    public static String nbaseEquivalent(int n, int num){
        StringBuilder s=new StringBuilder();
        while(num!=0){
            int rem=num%n;
            if(rem<=9) s.append(rem);
            else{
                char ch=(char)(55+rem);
                s.append(ch);
            }  
            num/=n;
        }
        return s.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(nbaseEquivalent(n, num));
        sc.close();
    }
}
