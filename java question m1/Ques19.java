import java.util.*;
public class Ques19 {
    public static int passwordCheck(String s){
        int n=s.length();
        if(n<4) return 0;
        boolean hasDigit = false;
        boolean hasUpper = false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(s.charAt(0))) return 0;
            if(ch==' ' || ch=='/') return 0;
            if(Character.isUpperCase(ch)) hasUpper=true;
            if(Character.isDigit(ch)) hasDigit=true;
        }
        if(hasDigit && hasUpper) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(passwordCheck(s));
        sc.close();
    }
}
