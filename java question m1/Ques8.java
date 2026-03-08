import java.util.*;
public class Ques8 {
    public static String moveHyphens(String s){
        int n=s.length();
        StringBuilder str = new StringBuilder();
        int cnt=0;
        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            if(ch!='-') str.append(ch);
            else cnt++;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<cnt;i++){
            res.append('-');
        }
        res.append(str);
        return res.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(moveHyphens(s));
        sc.close();
    }
}
