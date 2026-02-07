import java.util.*;

public class CreditCard {
    public static void visa(String s){
        int n=s.length();
        if(n!=16 || s.charAt(0)!='4'){
            System.out.println("Invalid");
            return;
        }
        for(char ch: s.toCharArray()){
            if(!Character.isDigit(ch)){
            System.out.println("Invalid");
            return;
            }
        }
        System.out.println("Valid");
    }
    public static void master(String s){
        int n=s.length();
        if(n!=16 || s.charAt(0)!='5'){
            System.out.println("Invalid");
            return;
        }
        for(char ch: s.toCharArray()){
            if(!Character.isDigit(ch)){
            System.out.println("Invalid");
            return;
            }
        }
        System.out.println("Valid");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        sc.nextLine();
        String str2=sc.next();
        visa(str1);
        master(str2);
    }
}
