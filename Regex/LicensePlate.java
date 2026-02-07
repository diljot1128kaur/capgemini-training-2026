import java.util.*;

public class LicensePlate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        if(n>6 || n<6) {
            System.out.println("Invalid license number");
            return;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!Character.isUpperCase(s.charAt(0)) && 
            !Character.isUpperCase(s.charAt(0)) && !Character.isDigit(ch)) {
                System.out.println("Invalid license number");
                return;
            }
        }
        System.out.println("Valid license number");
        sc.close();
    }
}
