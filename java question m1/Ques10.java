import java.util.*;
public class Ques10 {
    public static String replace(String s, char ch1,char ch2){
        if(s==null) return null;
        if(ch1==ch2) return s;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==ch1) sb.append(ch2);
            else if(ch==ch2) sb.append(ch1);
            else sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        System.out.println(replace(s,ch1,ch2));
        sc.close();
    }
}
