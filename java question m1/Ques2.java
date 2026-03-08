 import java.util.*;
public class Ques2 {
    public static int operationOnStr(String s){
        if(s==null || s.length()==0) return -1;
        int res=s.charAt(0)-'0';
        for(int i=1;i<s.length();i+=2){
            char ch=s.charAt(i);
            if(ch=='C' || ch=='A' ||ch=='B'){
                char ch1=s.charAt(i+1);
                int num1=ch1-'0';
                if(ch=='C') res=res ^ num1;
                else if(ch=='B') res=res | num1;
                else if(ch=='A') res=res & num1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(operationOnStr(s));
        sc.close();
    }
}

